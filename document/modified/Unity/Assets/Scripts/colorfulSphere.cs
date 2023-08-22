using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class colorfulSphere : MonoBehaviour
{
    public Color color;
    public GameObject go;
    public Material material;
    // Start is called before the first frame update
    void Start()
    {
        
        material=go.GetComponent<MeshRenderer> ().material ;
        
    }

    // Update is called once per frame
    void Update()
    {
        color = new Color(Random.value, Random.value, Random.value);
        //material.SetColor("Albedo",color);
        material.color = color;
    }
}
