using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MyCarController : MonoBehaviour
{    
    //public GameObject child;    
    public Transform parentTransform;    
    public int childCount ;
    public Vector3[] DeltaPositionArr;
    public WheelCollider[] wheelColliderArr;

    public bool motoring;
    public bool steering;
    public bool brakeing;

    public float maxMotorTorque;
    public float maxBrakeTorque;
    public float maxSteeringAngle;
    public Vector3 com;
    public Rigidbody rb;
    // Start is called before the first frame update
    void Start()
    {
        childCount = parentTransform.childCount;
        DeltaPositionArr = new Vector3[childCount] ;
        //wheelColliderArr=new wheelCollider[parentTransform.];
        computeDeltaPosition();
        
        rb = GetComponent<Rigidbody>();
        rb.centerOfMass = com;
    }

    // Update is called once per frame
    void Update()
    {
        DriveWheelCollider();
        //UpdatePosition();

    }
    public void ApplyLocalPositionToVisuals(WheelCollider collider)
    {


        Transform visualWheelTransform = collider.transform;

        Vector3 position;
        Quaternion rotation;
        collider.GetWorldPose(out position, out rotation);

        //visualWheelTransform.position = position;
        visualWheelTransform.rotation = rotation;

    }
    public void DriveWheelCollider()
    {
        float motor = maxMotorTorque * Input.GetAxis("Vertical");
        float steer = maxSteeringAngle * Input.GetAxis("Horizontal");
        print("motor:"+motor);
        print("steer:"+steer);
        for (int i = 0; i < wheelColliderArr.Length; i++)
        {
            if (steering)
            {
                wheelColliderArr[i].steerAngle = steer;

            }
            if (motoring)
            {
                wheelColliderArr[i].motorTorque = motor;

            }
            if (Input.GetKeyDown(KeyCode.B))
            {
                brakeing = true;
            }

            if (Input.GetKeyUp(KeyCode.B))
            {
                brakeing = false;
            }
            if (brakeing)
            {
                wheelColliderArr[i].brakeTorque = maxBrakeTorque;

            }
            else
            {
                wheelColliderArr[i].brakeTorque = 0;

            }
            ApplyLocalPositionToVisuals(wheelColliderArr[i]);
        }


       
        


    }
    void UpdatePosition()
    {       
       /* parentTransform.position = parentTransform.GetChild(8).position - DeltaPositionArr[8];
        parentTransform.GetChild(8).localPosition = DeltaPositionArr[8];
        parentTransform.GetChild(9).localPosition = DeltaPositionArr[9];
        parentTransform.GetChild(10).localPosition = DeltaPositionArr[10];
        parentTransform.GetChild(11).localPosition = DeltaPositionArr[11];*/
    }
    void computeDeltaPosition()
    {               
        for (int i = 0; i < childCount; i++)
        {
            DeltaPositionArr[i] = parentTransform.GetChild(i).position - parentTransform.position;
            print("DeltaPositionArr["+ i+"]:" );                       
        }
    }
    

}
