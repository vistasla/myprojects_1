using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CreatePrimitive : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    public CreatePrimitive() {

        GameObject go = GameObject.CreatePrimitive(PrimitiveType.Sphere);
        Renderer rend = go.GetComponent<Renderer>();
        rend.material.mainTexture = Resources.Load("Broadleaf_Desktop_Atlas_Billboards") as Texture;
        //go.AddComponent<DestroyObject>();
    }
}
