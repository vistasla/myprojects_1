using UnityEngine;
using System.Collections;

public class LeftFootIk : MonoBehaviour
{
    public float leftFootPositionWeight;
    public float leftFootRotationWeight;
    public Transform leftFootObj;

    private Animator animator;

    void Start()
    {
        animator = GetComponent<Animator>();
    }

    void OnAnimatorIK(int layerIndex)
    {
        animator.SetIKPositionWeight(AvatarIKGoal.LeftFoot, leftFootPositionWeight);
        animator.SetIKRotationWeight(AvatarIKGoal.RightFoot, leftFootRotationWeight);
        animator.SetIKPosition(AvatarIKGoal.LeftFoot, leftFootObj.position);
        animator.SetIKRotation(AvatarIKGoal.RightFoot, leftFootObj.rotation);
    }
}