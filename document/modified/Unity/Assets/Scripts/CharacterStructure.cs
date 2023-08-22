using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CharacterStructure : MonoBehaviour
{
    public GameObject go;
    public Component component;

    // Start is called before the first frame update
    void Start()
    {
        go = this.gameObject;
        
        component=go.GetComponent(typeof(Light));

        print(component.GetComponentInParent(typeof(HingeJoint)).name);

    }
                       
    // Update is called once per frame
    void Update()
    {       
    }
    
}
