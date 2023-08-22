using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
public class MoveGameObjectToScene : MonoBehaviour
{
    public GameObject go;
    // Start is called before the first frame update
    void Start()
    {
        
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.M))
        {
            print("M");
            

            SceneManager.MoveGameObjectToScene( go, SceneManager.GetSceneByName("NewScene"));
            //SceneManager.MoveGameObjectToScene(go, SceneManager.GetSceneByBuildIndex(3));
            
        }
        if (Input.GetKeyDown(KeyCode.S))
        {
            print("S");
            SceneManager.UnloadSceneAsync(SceneManager.GetActiveScene());
        }

    }
}
