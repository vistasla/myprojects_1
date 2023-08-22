using UnityEngine;
using System.Collections;
using System.Collections.Generic;

public class MyCharacterController : MonoBehaviour
{
    Animator animator;
    // 在第一次帧更新之前调用 Start
    void Start()
    {
        animator = GetComponent<Animator>();
    }
// 每帧调用一次 Update
void Update()
{
        float horizontal = Input.GetAxis("Horizontal");
        float vertical = Input.GetAxis("Vertical");
        Vector3 position = transform.position;
        position.x = position.x + 1f * horizontal;
        position.z = position.z + 1f * vertical;
        transform.position = position;

        //animator.SetTrigger("Humanoid Walk");
        //animator.SetInteger("AniFlag", 1);





        if (Input.GetKey("up"))
        {
            
            
            animator.SetInteger("i", 0);
            
            print("up arrow key is held down");

        }

        if (Input.GetKey("down"))
        {
           
            animator.SetInteger("i", -1);
            
            print("down arrow key is held down");
        }
        if (Input.GetKey("r"))
        {

            animator.SetInteger("i", 1);

            print("r key is held down");
        }
    }

    
}
