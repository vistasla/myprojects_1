using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PickObject : MonoBehaviour
{
    RaycastHit hit;
    GameObject go;
    GameObject go1;
    // Start is called before the first frame update
    void Start()
    {
        go1 = GameObject.Find("RightHand");
    }

    // Update is called once per frame
    void Update()
    {
        //if (Physics.Raycast(transform.position, transform.TransformDirection(Vector3.forward),  out hit))
            if (Physics.Raycast(transform.position, transform.TransformDirection(Vector3.forward),  out hit,1))
            {
            
            //Debug.Log(hit.collider.gameObject.name);
            Debug.Log(hit.collider.name);
            go = hit.collider.gameObject;
            
            Destroy(go);
            //Instantiate(go,go1.transform,true);
            Instantiate(go, go1.transform.position, Quaternion.identity, go1.transform);
            //Instantiate(Object original, Vector3 position, Quaternion rotation, Transform parent);
        }
    }
}
