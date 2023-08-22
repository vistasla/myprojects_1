using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SwitchEnabledCamera : MonoBehaviour
{
    //public GameObject enabledCamera;
    public Camera enabledCamera;
    public Camera disabledCamera;
    public Camera[] cameras ;
    public Color color1 = Color.red;
    public Color color2 = Color.blue;
    public float duration = 3.0F;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        float t = Mathf.PingPong(Time.time, duration) / duration;
        Camera.allCameras[0].backgroundColor = Color.Lerp(color1, color2, t);


        if (Input.GetKeyDown(KeyCode.F))
        {
            print("F");
            
           
        }
        if (Input.GetKeyDown(KeyCode.S))
        {
            print("S");
            
            switchEnabledCamera();
            //Camera.allCameras[0].Render();
        }
        

    }
    public void switchEnabledCamera() {
        
        //print(Camera.current);
        //Camera.allCameras[0].Reset();

        
        // enabledCamera.SetActive(false);
        //Destroy(enabledCamera,0);

        /* for (int i=0; i< Camera.allCameras.Length; i++) {             
             print(Camera.allCameras[i].name);
         }*/

    }
}
