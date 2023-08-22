using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SphereControler : MonoBehaviour
{
    public GameObject parent;
    public GameObject child;
    public Vector3 localPosition;
    public Quaternion localRotation;
    
    // Start is called before the first frame update
    void Start()
    {
        localPosition= child.transform.localPosition;
        localRotation = child.transform.localRotation;
    }

    // Update is called once per frame
    void Update()
    {


        child.transform.localPosition = localPosition;
        child.transform.localRotation = localRotation;
        

    }
}
