using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TransformRotate : MonoBehaviour
{
    public GameObject parent;
    public GameObject child;
    public Vector3 parentPosition;
    public Vector3 childPosition;
    public Quaternion parentRotation;
    public Vector3 deltaPosition;
    // Start is called before the first frame update
    void Start()
    {
        parentPosition = parent.transform.position;
        childPosition = child.transform.position;
        deltaPosition = childPosition - parentPosition;
        print(deltaPosition);
    }

    // Update is called once per frame
    void Update()
    {
        //child.transform.Rotate(0.0F, 30.0F, 0.0F,  Space.Self);
        //child.transform.Rotate(0.0F, 1.5F, 0.0F, Space.World);
        child.transform.Rotate(0.0F, 1.5F, 0.0F, Space.Self);

    }
}
