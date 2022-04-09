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
                    You immediately relax at the mention of the inn, which you remember
                    seeing on a map back in Regio. An old man with a heavy-looking
                    burlap pack makes his way past you. After a few minutes, you are able
                    to make out a two-story brick building with a steady plume of smoke
                    emanating from its chimney. The old man gestures at a red wooden door
                    with a sign spelling "Mistwood Inn" in hand-painted vines. You tie your
                    horse in a small stable adjacent to the entrance, then swing the door open
                    and step inside. You turn around to hold the door open for the old man, but
                    all that greets your eyes are the small drifts of snow beginning to cling to
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
                    You step inside the inn. Behind a wooden podium stands a young man, his blond
                    hair extending down his back. His cheery smile stirs a pleasant warmth within
                    you.
                                        
                    "Hello there! Welcome to the Mistwood Inn. I'm happy you found us in time before
                    the storm rolled in. Will you only be staying overnight?"
                                        
                    "Yes," you say. "I have to make it to Alabastin by noon tomorrow."
                                        
                    "Excellent," says the young man, his smile now pushing his lips further apart.
                    "May I have a name for the ledger?"\040""";
            case "devlinIntro" -> """
                    "I am Devlin, the sole concierge here at Mistwood Inn. If you ever need anything,
                    I will always be here!" With that, Devlin hands you a metal key with the number 9
                    on it. "Up the stairs, to the right," he says with a cordial nod.
                    """;
            case "introChoices" -> """
                    Enter 1: Go drop your things off in your room
                    Enter 2: Ask Devlin about the inn's history
                    Enter 3: Head down the hallway to your left (without going upstairs)
                    """;
            case "climbStairs" -> """
                    a
                    """;
            case "innHistory" -> """
                    b
                    """;
            case "firstFloorHallway" -> """
                    
                    """;
            default -> "";
        };
    }
}
