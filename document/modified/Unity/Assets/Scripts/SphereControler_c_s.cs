using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SphereControler_c_s : MonoBehaviour
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
        /*print(parentPosition);
        print(child
            Position);*/


    }

    // Update is called once per frame
    void Update()
    {
        //parent.transform.position = child.transform.position- localPosition;
        //parent.transform.position = parentPosition+child.transform.position - childPosition;
        parent.transform.position =  child.transform.position -deltaPosition;
        /*print("parent:" + parent.transform.position);
        print("child:" + child.transform.position);
        print("deltaPosition:" + child.transform.position- parent.transform.position);*/
        print( child.transform.position - parent.transform.position);

    }
}
