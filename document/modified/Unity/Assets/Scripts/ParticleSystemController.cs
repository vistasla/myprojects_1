using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ParticleSystemController : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        ParticleSystem particleSystem = GetComponent<ParticleSystem>();
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.P))
        {
            print("P");
            GetComponent<ParticleSystem>().Play();
        }
        if (Input.GetKeyDown(KeyCode.S))
        {
            print("S");
            GetComponent<ParticleSystem>().Pause();
        }
    }
}
