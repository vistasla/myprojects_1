using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TankLanchMissile : MonoBehaviour
{
    public GameObject projectilePrefab;
    public Projectile projectile;
    public Vector3 missileposition;
    public Vector3 missilerotation;
    public Vector3 direction;
    public float force;

    // Start is called before the first frame update
    void Start()
    {

         projectile = projectilePrefab.GetComponent<Projectile>();
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.L))
        {
            Launch();
        }
    }
    void Launch()
    {
        print("launch");
        //missileposition = projectilePrefab.GetComponent<Transform>.position;
        missileposition = new Vector3(-462, 283, 484);
       // missilerotation = new Vector3(-176.428, -90.48102, 71.959);
       // GameObject projectileObject = Instantiate(projectilePrefab, missileposition, missilerotation);
        GameObject projectileObject = Instantiate(projectilePrefab);

        // projectile.Launch(direction, force);
        Rigidbody rigidbody
         = projectileObject.GetComponent<Rigidbody>();
        rigidbody.AddForce(direction * force);
    }
    void OnCollisionEnter() {

        print("Tank Collided");
        
        
    
    }
}
