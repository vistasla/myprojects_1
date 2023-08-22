using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SwitchEnabledCamera_1 : MonoBehaviour
{
    
    public Camera[] cameras ;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
        
        
        if (Input.GetKeyDown(KeyCode.F))
        {
            print("F");
            cameras[0].enabled =true;
            cameras[1].enabled =false;
            cameras[2].enabled = false;
          
        }
        if (Input.GetKeyDown(KeyCode.S))
        {
            print("S");
            cameras[0].enabled = false;
            cameras[1].enabled = true;
            cameras[2].enabled = false;
            
        }
        if (Input.GetKeyDown(KeyCode.T))
        {
            print("T");
            cameras[0].enabled = false;
            cameras[1].enabled = false;
            cameras[2].enabled = true;
           
        }

    }
    

    }

