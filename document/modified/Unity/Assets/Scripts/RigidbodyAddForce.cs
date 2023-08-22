using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RigidbodyAddForce : MonoBehaviour
{
    GameObject go;
    // Start is called before the first frame update
    void Start()
    {
         go = this.gameObject;
       
    }

    // Update is called once per frame
    void Update()
    {
        go.GetComponent<Rigidbody>().AddForce(0, 0, 50, ForceMode.Force);
        if (Input.GetKeyDown(KeyCode.P))
        {
            print("P");
            
        }
        
    }
}
