using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PatrolWithinCircle : MonoBehaviour
{
    private UnityEngine.AI.NavMeshAgent agent;
    // Start is called before the first frame update
    void Start()
    {
        agent = GetComponent<UnityEngine.AI.NavMeshAgent>();
        agent.autoBraking = false;
        GotoNextPoint();

    }
    void GotoNextPoint()
    {
        agent.destination = Random.insideUnitCircle * 5;
        

        
        
    }

    // Update is called once per frame
    void Update()
    {
        if (!agent.pathPending && agent.remainingDistance < 0.5f)
            GotoNextPoint();
    }
}
