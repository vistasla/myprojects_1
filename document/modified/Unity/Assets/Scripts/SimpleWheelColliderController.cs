using UnityEngine;
using System.Collections;
using System.Collections.Generic;

[System.Serializable]
public class AxleInfo_1
{
    public WheelCollider Wheel;
    public bool motor;
    public bool steering;
    public bool brakeing;
}

public class SimpleWheelColliderController : MonoBehaviour
{
    public List<AxleInfo_1> axleInfos;
    public float maxMotorTorque;
    public float maxBrakeTorque;
    public float maxSteeringAngle;


    // 查找相应的可视车轮
    // 正确应用变换
    public void ApplyLocalPositionToVisuals(WheelCollider collider)
    {


        Transform visualWheel = collider.transform;

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


        foreach (AxleInfo_1 axleInfo in axleInfos)
        {

            if (axleInfo.steering)
            {
                axleInfo.Wheel.steerAngle = steering;

            }
            if (axleInfo.motor)
            {
                axleInfo.Wheel.motorTorque = motor;

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
                axleInfo.Wheel.brakeTorque = maxBrakeTorque;

            }
            else
            {
                axleInfo.Wheel.brakeTorque = 0;

            }
            ApplyLocalPositionToVisuals(axleInfo.Wheel);

        }
    }
}