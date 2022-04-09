package MistwoodInn;

public class Narrative {

    Narrative(){
    }
    public String getNarrative (int a){
        String txt = "sample";
        if (a == 1){
             txt = """
                     You are a traveler who has been riding along a winding, dusty
                     road that connects the kingdoms of Regio and Alabastin. After
                     a long day of following the road, it begins to weave through
                     interspersed birch trees. As you continue along, you dismount
                     from your horse as the trees begin to close in on you. The stones
                     beneath your feet are beginning to fade into dirt, and you begin to
                     worry that you may have made a wrong turn somewhere. A gentle snow
                     starts to fall, coating the shoulders of your cloak. The road begins
                     to become obscured as well. Behind you, a deep, aged voice says,
                     'Lost, are we? Not the first, not the last. Please, follow me.
                      The Mistwood Inn is only a few minutes journey from here.
                     Best we get there before the path is lost.'""";
        }
        else if (a == 2){
             txt = """
                     You immediately relax at the mention of the inn, which you remember
                     seeing on a map back in Regio. An old man with a heavy-looking
                     burlap pack makes his way past you. After a few minutes, you are able
                     to make out a two-story brick building with a steady plume of smoke
                     emanating from its chimney. The old man gestures at a red wooden door
                     with a sign spelling ‘Mistwood Inn’ in hand-painted vines. You tie your
                     horse in a small stable adjacent to the entrance, then swing the door
                     open and step inside. You turn around to hold the door open for the old man,
                     but all that greets your eyes are the birch trees beginning to accumulate
                     small drifts of snow.""";
        }
        return txt;
    }
}
