using UnityEngine;
using UnityEngine.AI;

public class MoveToClickPoint : MonoBehaviour
{
    RaycastHit hitInfo = new RaycastHit();
   
    NavMeshAgent agent;
    Ray ray;

    void Start()
    {
        agent = GetComponent<NavMeshAgent>();
    }

    void Update()
    {
        if (Input.GetMouseButtonDown(0))
        {
             ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            if (Physics.Raycast(ray.origin, ray.direction, out hitInfo))
                agent.destination = hitInfo.point;
            
        }
        Debug.DrawRay(ray.origin, ray.direction * 1000, Color.red);
    }
}