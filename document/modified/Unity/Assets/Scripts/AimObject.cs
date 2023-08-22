using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AimObject : MonoBehaviour
{           
    public float duration = 3.0F;
    Transform transform;
    Vector3 position;
    // Start is called before the first frame update
    void Start()
    {
        transform = Camera.allCameras[0].GetComponent<Transform>();
        position = transform.position;
    }

    // Update is called once per frame
    void Update()
    {

        aimObject();

        if (Input.GetKeyDown(KeyCode.A))
        {
            print("A");
            

        }
       

    }
    public void aimObject()
    {

        float t = Mathf.PingPong(Time.time, duration) ;


        
        transform.position = position+ new Vector3(0F,0F,t);

    }
}
