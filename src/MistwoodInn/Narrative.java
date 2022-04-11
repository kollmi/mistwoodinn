package MistwoodInn;

public class Narrative {
    Narrative(){
    }
    public String getNarrative (String a){
        return switch (a) {
            case "intro1" -> """
                    You are a traveler who has been riding along a winding, dusty
                    road that connects the kingdoms of Regio and Alabastin. After
                    a long day of following the road, it begins to weave through
                    interspersed birch trees. As you continue along, you dismount
                    from your horse as the trees begin to close in on you. The stones
                    beneath your feet are beginning to fade into dirt, and you begin to
                    worry that you may have made a wrong turn somewhere. A gentle snow
                    starts to fall, coating the shoulders of your cloak. The road begins
                    to become obscured as well. Behind you, a deep, rust-colored voice says,
                    "Lost, are we? Not the first, not the last. Please, follow me.
                    The Mistwood Inn is not much farther ahead. Best we get there
                    before the snow picks up."
                    """;
            case "intro2" -> """
                    An old man with a heavy-looking burlap pack makes his way past you. After
                    a few minutes, you are able to make out a two-story brick building with a
                    steady plume of smoke emanating from its chimney. The old man gestures at a red
                    wooden door with a sign spelling "Mistwood Inn" in hand-painted vines.
                    
                    You tie your horse in a small stable adjacent to the entrance, then swing the
                    door open and step inside. You turn around to hold the door open for the old man,
                    but all that greets your eyes are the small drifts of snow beginning to cling to
                    the birch trees.
                    """;
            case "oldManCheck" -> """
                    You trace a few paces back down the trail and notice that there is only a single
                    pair of footprints between the inn's door and the path: yours. However, you do
                    find a small silver coin half-buried in the soft layer of snow.
                                        
                    Silver Coin has been added to your inventory.
                                        
                    You return back to the entrance of the inn and open the door again.
                    """;
            case "enterInn" -> """
                    You step inside the inn. Behind a wooden podium stands a young man in his late
                    teens, his blond hair extending down his back. His cheery smile has a refreshing
                    genuine quality to it.
                                        
                    "Hi! Welcome to the Mistwood Inn. I'm happy you found us in time before the
                    storm rolled in. Will you only be staying overnight?"
                                        
                    "Yes," you say. "I have to make it to Alabastin by noon tomorrow."
                                        
                    "Excellent," says the young man, his smile now pushing his lips further apart.
                    "I'm Devlin, the sole innkeeper here at Mistwood Inn. May I have your name for the ledger?"
                    """;
            case "devlinIntro" -> """
                    "Ah, yes. You must be thinking, "Devlin, where's the ledger?" Well, that just happens
                    to be my gift! I have an encyclopedic memory. I know what you're thinking, why waste my
                    last few years of my gift here at Mistwood? It just happens that this inn is very
                    near and dear to me, and my gift happens to make running an inn quite easy. I know
                    every single visitor: when they arrived, left, where they're going to, and, of course,
                    their name.
                    """;
            case "devlinIntro2" -> """
                    "If you ever need anything,I will always be here!" With that, Devlin hands you a
                    metal key with the number 9 on it. "Up the stairs, to the right," he says with a
                    cordial nod.
                    """;
            case "climbStairs" -> """
                    You climb up the wooden staircase, each step exhaling a deep creak as your foot
                    lands on it. Wax candles line the walls around the steps, each flickering as if
                    its life depended on it. As you reach the top of the staircase, you see a very
                    short woman with jet-black hair turn into the hallway from the left. She flashes
                    a look of concern at you as she knocks on the door next to the one she just left.
                    """;
            case "innBackstory" -> """
                    "Ah!" Devlin exclaimed. "I am so glad you asked! No one ever does. I'll keep that
                    in mind for..." Devlin trailed off. "Anyways, yes, yes. Of course. Despite its
                    secluded location, Mistwood Inn is well frequented by those who know it. Typically,
                    the crowd we attract is the merchant type. Some enjoy recounting their epic adventures
                    in the galley. Others prefer to not commiserate much. Once, Prince Dallio of Regio
                    himself passed through in complete disguise! We only found out after a royal crow
                    dropped a note of gratitude and a thousand gold coins off at the front door."
                    """;
            case "innBackstory2" -> """
                    You almost flinch at the name of Prince Dallio, but hold your composure. Surely Devlin
                    mentioned that name out of complete coincidence. There was no way he could know of
                    your mission.
                    
                    Enter 1: Head upstairs to your room
                    Enter 2: Ask Devlin more about Prince Dallio's visit
                    """;
            case "innBackstory3" -> """
                    "What's happening?"
                    """;
            default -> "";
        };
    }
}
