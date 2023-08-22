using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TankEnemy : MonoBehaviour
{
    //public GameObject tankEnemy;
    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
       
    }
    void OnCollisionEnter()
    {

        print("tankEnemy Collided");
        //Destroy(tankEnemy,  0.0F);
        this.gameObject.GetComponent<InstantiateParticleSystem>().InstantiateParticleSystem_1();
        Destroy(this.gameObject, 10.0F);

    }
}
