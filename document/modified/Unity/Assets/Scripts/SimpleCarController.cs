using UnityEngine;
using System.Collections;
using System.Collections.Generic;

[System.Serializable]
public class AxleInfo
{
    public WheelCollider leftWheel;
    public WheelCollider rightWheel;
    public bool motor;
    public bool steering;
    public bool brakeing;
}

public class SimpleCarController : MonoBehaviour
{
    public List<AxleInfo> axleInfos;
    public float maxMotorTorque;
    public float maxBrakeTorque;
    public float maxSteeringAngle;


    // 查找相应的可视车轮
    // 正确应用变换
    public void ApplyLocalPositionToVisuals(WheelCollider collider)
    {
        if (collider.transform.childCount == 0)
        {
            return;
        }

        Transform visualWheel = collider.transform.GetChild(0);

        Vector3 position;
        Quaternion rotation;
        collider.GetWorldPose(out position, out rotation);
        //rotation.x = rotation.x + 90;
        visualWheel.transform.position = position;
        visualWheel.transform.rotation = rotation;
       
    }

    //public void FixedUpdate()
        public void Update()
    {
        float motor = maxMotorTorque * Input.GetAxis("Vertical");
        float steering = maxSteeringAngle * Input.GetAxis("Horizontal");
        

        foreach (AxleInfo axleInfo in axleInfos)
        {

            if (axleInfo.steering)
            {
                axleInfo.leftWheel.steerAngle = steering;
                axleInfo.rightWheel.steerAngle = steering;
            }
            if (axleInfo.motor)
            {
                axleInfo.leftWheel.motorTorque = motor;
                axleInfo.rightWheel.motorTorque = motor;
            }
            if (Input.GetKeyDown(KeyCode.B))
            {
                axleInfo.brakeing = true;
            }
            
            if (Input.GetKeyUp(KeyCode.B))
            {
                axleInfo.brakeing = false;
            }
            if (axleInfo.brakeing)
            {
                axleInfo.leftWheel.brakeTorque = maxBrakeTorque;
                axleInfo.rightWheel.brakeTorque = maxBrakeTorque;
            }
            else
            {
                axleInfo.leftWheel.brakeTorque = 0;
                axleInfo.rightWheel.brakeTorque = 0;
            }
            ApplyLocalPositionToVisuals(axleInfo.leftWheel);
            ApplyLocalPositionToVisuals(axleInfo.rightWheel);
        }
    }
}