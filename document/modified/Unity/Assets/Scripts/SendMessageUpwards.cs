using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SendMessageUpwards : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        //SendMessageUpwards("ApplyDamage", 5.0);
        SendMessage("ApplyDamage", 5.0);
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    void ApplyDamage(float damage)
    {
        print(damage);
    }
}
