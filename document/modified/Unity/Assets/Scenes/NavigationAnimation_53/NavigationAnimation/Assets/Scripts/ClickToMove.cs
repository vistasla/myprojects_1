using UnityEngine;
[RequireComponent(typeof(UnityEngine.AI.NavMeshAgent))]
[RequireComponent(typeof(Animator))]

public class ClickToMove : MonoBehaviour
{
	RaycastHit hitInfo = new RaycastHit();
	UnityEngine.AI.NavMeshAgent agent;
	public Animator anim;
    public bool isArrived=false;
    public bool isupdatePosition = false;
    void Start()
	{
		agent = GetComponent<UnityEngine.AI.NavMeshAgent>();
		anim = GetComponent<Animator>();
        
        agent.updatePosition = isupdatePosition;
    }
	void Update()
	{
		if (Input.GetMouseButton(0))
		{
			Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
			if (Physics.Raycast(ray.origin, ray.direction, out hitInfo))
				agent.destination = hitInfo.point;

			UpdateAnimPars(true);
        }

        if (!agent.hasPath)
        {
            isArrived = true;
            UpdateAnimPars(false);
        }
        else {
            isArrived = false;
        }
                                   
            anim.SetFloat("velX", Input.GetAxis("Horizontal"));
            
        /*if (Input.GetKeyDown(KeyCode.W))
        {
            print("pressed:" + "W.");
            //Vector3 newPosition = new Vector3(0,0,0);
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            if (Physics.Raycast(ray.origin, ray.direction, out hitInfo)) { 
            agent.Warp(hitInfo.point);
        }                      
        }*/

        if (Input.GetKey(KeyCode.J))
        {
            print("pressed:" + "J.");
            anim.SetBool("isJump", true);           
        }

        if (anim.GetCurrentAnimatorClipInfo(0)[0].clip.name== "HumanoidIdleJumpUp")
        {
            //print(anim.GetCurrentAnimatorClipInfo(0)[0].clip.length);
            anim.SetBool("isJump", false);
            //print(anim.GetNextAnimatorClipInfo(0)[0].clip.name);
        }
        if (anim.IsInTransition(0))
        {
            //print("anim.GetAnimatorTransitionInfo():" + anim.GetAnimatorTransitionInfo(0).IsName("move -> jump") );
           // print("anim.GetAnimatorTransitionInfo():" + anim.GetAnimatorTransitionInfo(0).normalizedTime );

        }
        /*if (Input.GetKey(KeyCode.S))
        {
            print("pressed:" + "S.");
           
            print("animatorInfo:" + anim.deltaPosition);
        }*/
        if (Input.GetKey(KeyCode.S))
        {
            print("pressed:" + "S.");
            agent.isStopped = true;

           
        }
        if (Input.GetKey(KeyCode.W))
        {
            print("pressed:" + "W.");
            agent.isStopped = false;


        }

    }
	void UpdateAnimPars(bool isMove) {
        anim.SetBool("isMove", isMove);
    }
    

    void TransitionEndEvent() {

        print("TransitionEndEvent():");
    }
    void OnGUI()
    {
        GUI.Label(new Rect(0, 0, 200, 20), "isArrived : " +isArrived );
        GUI.Label(new Rect(0, 30, 200, 20), "curvelX: " + Input.GetAxis("Horizontal"));
    }
       
    }

