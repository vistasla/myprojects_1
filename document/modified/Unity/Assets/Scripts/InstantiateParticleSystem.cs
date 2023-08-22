using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class InstantiateParticleSystem : MonoBehaviour
{
    public GameObject projectilePrefab;
    // Start is called before the first frame update
    void Start()
    {
       
    }

    // Update is called once per frame
    void Update()
    {
        /*if (Input.GetKeyDown(KeyCode.L))
        {
            GameObject projectileObject = Instantiate(projectilePrefab);
        }*/
        
    }
    public void InstantiateParticleSystem_1() {

        GameObject projectileObject = Instantiate(projectilePrefab);

    }
}
