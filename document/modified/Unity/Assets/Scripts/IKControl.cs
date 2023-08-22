using UnityEngine;
using System;
using System.Collections;

[RequireComponent(typeof(Animator))]

public class IKControl : MonoBehaviour
{

    protected Animator animator;

    public bool ikActive = false;
    public Transform rightHandObj = null;
    public Transform lookObj = null;

    void Start()
    {
        animator = GetComponent<Animator>();
    }

    // ���ڼ��� IK �Ļص�
    void OnAnimatorIK()
    {
        if (animator)
        {

            // ��� IK ���ڻ״̬���뽫λ�ú���תֱ������ΪĿ�ꡣ
            if (ikActive)
            {

                // ���ù۲�Ŀ��λ�ã�����ѷ��䣩
                if (lookObj != null)
                {
                    animator.SetLookAtWeight(1);
                    animator.SetLookAtPosition(lookObj.position);
                }

                // ��������Ŀ��λ�ú���ת������ѷ��䣩
                if (rightHandObj != null)
                {
                    animator.SetIKPositionWeight(AvatarIKGoal.RightHand, 1);
                    animator.SetIKRotationWeight(AvatarIKGoal.RightHand, 1);
                    animator.SetIKPosition(AvatarIKGoal.RightHand, rightHandObj.position);
                    animator.SetIKRotation(AvatarIKGoal.RightHand, rightHandObj.rotation);
                }

            }

            // ��� IK δ���ڻ״̬���뽫�ֺ�ͷ����λ�ú���ת���û�ԭʼλ��
            else
            {
                animator.SetIKPositionWeight(AvatarIKGoal.RightHand, 0);
                animator.SetIKRotationWeight(AvatarIKGoal.RightHand, 0);
                animator.SetLookAtWeight(0);
            }
        }
    }
}