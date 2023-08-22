using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class addtonnal : MonoBehaviour
{
    public GameObject projectilePrefab;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
        //GameObject projectileObject = Instantiate(projectilePrefab, this.gameObject.GetComponent<Transform>(),false);
        GameObject projectileObject = Instantiate(projectilePrefab, this.gameObject.GetComponent<Transform>().position, this.gameObject.GetComponent<Transform>().rotation);
    }
}
