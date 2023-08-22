using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TransformRotateAround : MonoBehaviour
{
    public GameObject target;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        //transform.RotateAround(target.transform.position, Vector3.up, 20 * Time.deltaTime);
        transform.RotateAround(target.transform.position, Vector3.left, 20 * Time.deltaTime);
    }
}
