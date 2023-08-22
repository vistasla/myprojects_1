using UnityEngine;
[RequireComponent(typeof(UnityEngine.AI.NavMeshAgent))]
[RequireComponent(typeof(Animator))]

public class ClickToMove : MonoBehaviour
{
	RaycastHit hitInfo = new RaycastHit();
	UnityEngine.AI.NavMeshAgent agent;
	public Animator anim;

	void Start()
	{
		agent = GetComponent<UnityEngine.AI.NavMeshAgent>();
		anim = GetComponent<Animator>();        		      
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
        //print(agent.velocity);

        if (!agent.hasPath)                          
        {
            print("arrived");
            UpdateAnimPars(false);
        }
                                   
            anim.SetFloat("velX", Input.GetAxis("Horizontal"));
            print("curvelX:"+ Input.GetAxis("Horizontal"));


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
            print(anim.GetCurrentAnimatorClipInfo(0)[0].clip.length);
            anim.SetBool("isJump", false);                               
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
        GUI.Label(new Rect(0, 0, 200, 20), "Clip Name : " + anim.GetCurrentAnimatorClipInfo(0)[0].clip.name);
        GUI.Label(new Rect(0, 30, 200, 20), "Clip Length : " + anim.GetCurrentAnimatorClipInfo(0)[0].clip.length);
    }
        /*void OnGUI()
        {       
            public Rect windowRect = new Rect(20, 20, 120, 50);
            Window(0, windowRect, DoMyWindow, "My Window");       
        }
        public void DoMyWindow(int windowID)   
    {
            if (GUI.Button(new Rect(10, 20, 100, 20), "Hello World"))
            {
                print("Got a click");
            }
        }*/
    }

