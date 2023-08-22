using UnityEngine;

using UnityEngine.Playables;

using UnityEngine.Animations;

[RequireComponent(typeof(Animator))]

public class PlayAnimationSample : MonoBehaviour

{

    public AnimationClip clip;

    PlayableGraph playableGraph;

    void Start()

    {

        playableGraph = PlayableGraph.Create();

        playableGraph.SetTimeUpdateMode(DirectorUpdateMode.GameTime);

        var playableOutput = AnimationPlayableOutput.Create(playableGraph, "Animation", GetComponent<Animator>());

        // �����������ڿɲ�������

        var clipPlayable = AnimationClipPlayable.Create(playableGraph, clip);

        // ���ɲ��������ӵ����

        playableOutput.SetSourcePlayable(clipPlayable);

        // ���Ÿ�ͼ��

        playableGraph.Play();

    }

    void OnDisable()

    {

        //���ٸ�ͼ���������пɲ������ PlayableOutput��

        playableGraph.Destroy();

    }

}