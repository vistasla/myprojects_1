using UnityEngine;
using System.Collections;
using System.Collections.Generic;
public class CubeTigger : MonoBehaviour
{
    void OnTriggerEnter(Collider collider)
    //void OnTriggerEnter()
    {
        GameObject go= GameObject.Find("humanPrefab 2");
        /*go.transform.localScale = go.transform.localScale * 2;*/
        Animator animator;
        animator = go.GetComponent<Animator>();

       


            animator.SetInteger("i", -1);

           
        Debug.LogWarning("I come in peace!");

    }
}
