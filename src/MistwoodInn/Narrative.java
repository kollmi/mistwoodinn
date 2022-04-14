package MistwoodInn;

public class Narrative{
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
                                        
                    Silver Coin has been added to your bag.
                                        
                    You return back to the entrance of the inn and open the door again.
                    """;
            case "enterInn" -> """
                    You step inside the inn. Behind a wooden podium stands a young man in his late
                    teens, his blond hair extending down his back. His cheery smile has a refreshing
                    genuine quality to it.
                                        
                    "Hello there! Welcome to the Mistwood Inn. I'm happy you found us in time before the
                    storm rolled in. How long will you be staying?"
                                        
                    "Two nights," you say. "I have to rest up before I make the final leg to Alabastin."
                                        
                    "Excellent," says the young man, his smile now pushing his lips further apart.
                    "I'm Devlin, the sole innkeeper here at Mistwood Inn. May I have your name for the ledger?"
                    """;
            case "devlinIntro" -> """
                    "Ah, yes. You must be thinking, "Devlin, where's the ledger?" Well, that just happens
                    to be my Gift! I have an encyclopedic memory. I know what you're thinking, why waste my
                    last few years of my Gift here at Mistwood? It just happens that this inn is very
                    near and dear to me, and my Gift happens to make running an inn quite easy. I know
                    every single visitor: when they arrived, left, where they're going to, and, of course,
                    their name.
                    """;
            case "devlinIntro2" -> """
                    "If you ever need anything, I'll always be here!" With that, Devlin hands you a
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
                    himself passed through with none of us knowing! We only found out after a royal crow
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
                    Devlin laughs aloud. "Prince Dallio seems to have a bit of an admirer! Unfortunately,
                    I do not know the details of when he visited or how he was dressed. However, I'm sure
                    he does this sort of thing all the time, given that his Gift is being able to pass
                    entirely unnoticed. Must be a convenient Gift to have as a prince!"
                    
                    You hear the door open behind you, and a scraggly looking middle-aged man walks in behind
                    you. Devlin greets him, and you move out of his way and up the staircase to your room.
                    """;
            case "turnCorner" -> """
                    As you turn around the corner towards your room, you hear a voice come from the other side
                    of the hallway. "Leave me ALONE, Ange!" You glance back over your shoulder and realize that
                    it came from behind the door the short woman just knocked on. The short woman notices your
                    glare, and returns an even more steely one.
                    
                    "I know why you're here," she states very matter-of-factly.
                    """;
            case "angeReply1" -> """
                    Ange sighs, a defeated look overcoming her formerly pinched face. "Fair enough," she says.
                    """;
            case "angeReply2" -> """
                    Ange continues to lock eyes with you, her suspicion seeming to only increase.
                    """;
            case "enterRoom" -> """
                    You break away from Ange's prying eyes and insert your key into the door. It opens with a
                    meager creak, revealing a room with a narrow but comfortable looking-bed. Above the bed
                    hangs a picture of a dense forest of birch trees, their branches beginning to accumulate
                    snow.
                    
                    You sit down on the bed and open your bag.
                    """;
            case "roomDecision" -> """
                    You place your bag on the floor and look out the sole window in your room. The setting sun
                    casts rays of orange and pink onto the birch trees from an unknown direction.
                    
                    What do you do now?
                    
                    Enter 1: Lay down and rest
                    Enter 2: Step back into the hallway
                    """;
            case "rest" -> """
                    You hang up your coat and sigh as your head hits the pillow. You reflect on how fortunate
                    you were to have the old man assist you in finding this place, but simultaneously think back
                    on the unpleasant encounter in the hallway with the short woman.
                    
                    As the last orange and pink hues morph into shadows, you notice wisps of fog start
                    to crawl through the underbelly of the forest. You step closer to the window to watch
                    the hauntingly beautiful scene. Through the birch trees, you think you see a figure
                    walking towards the inn, but the impending darkness does not allow you to discern
                    apparition from reality.
                    """;
            case "room10" -> """
                    You turn the metal doorknob and step back into the hallway. The door across from yours,
                    emboldened with a golden 10, is slightly ajar. You don't remember it being open when
                    you were in the hallway earlier. From the room, you can hear a woman sobbing uncontrollably.
                    
                    Do you knock on the door of Room 10?
                    Enter Yes or No.
                    """;
            case "patriceIntro" -> """
                    The crying stops. "Oh, hello? Who's there? Please, come in. Sorry if you heard all that."
                    You step into Room 10. A middle-aged woman wearing a lavender jacket wipes the mascara dribble from
                    around her eyes. She looks up and offers you a weak smile.
                    
                    "I'm Patrice. This inn is like a second home for me. When I traveled around Regio and Alabastin
                    with my caravan, I used to stop here all the time. You see, when you have a Gift like mine,
                    you want to use it as much as possible. But as soon as you begin to notice the first pockets
                    of sagging flesh, the wrinkles you pretend aren't there, you start feeling like a shell of yourself.
                    All the fame associated with my vocal talents and the caravan are gone just as quick. Soon enough
                    you're replaced with the next up-and-coming doll whose Gift is that much more alluring."
                    
                    You return her monologue with a nod of understanding. "Have you heard of the legend of the
                    Permanence Stone? It's said to be able to stop peoples' Gifts from vanishing altogether, and
                    restore them if they've already disappeared."
                    
                    Patrice glances at you with a mix of skepticism and curiosity. "I have indeed heard of it. It's
                    said Prince Dallio was close to discovering it, but he disappeared not too long ago. Any dunce
                    can see the table how it's set, though. He must have found it, then used his Gift to disguise
                    himself as a commoner. As someone who's had their fair dose of fame, I don't blame him in
                    the slightest for wanting to escape from it."
                    
                    "I agree," you say, not trying to reveal too much. You consider that Patrice may be unaware that
                    Prince Dallio was last seen here, but her glance from earlier makes you think otherwise.
                    "It was nice to meet you, Patrice. I'm sure we'll see each other again soon," you say as you step
                    out of Room 10.
                    """;
            default -> "";
        };
    }
}
