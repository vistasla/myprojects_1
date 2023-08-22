using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ConstantRotation : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }
    public float degreesPerSecond = 2.0f;
    // Update is called once per frame
    void Update()
    {
        transform.Rotate(0, 0, degreesPerSecond * Time.deltaTime);
        
        print(Time.deltaTime);
    }
}
