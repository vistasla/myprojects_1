using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class LookAt_1 : MonoBehaviour
{
    RaycastHit hitInfo = new RaycastHit();
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
        if (Input.GetMouseButton(0))
        {
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            if (Physics.Raycast(ray.origin, ray.direction, out hitInfo))

            {
                Vector3 lookAtPosition = hitInfo.point;

                transform.LookAt(lookAtPosition);
            }

        }
    }
}
