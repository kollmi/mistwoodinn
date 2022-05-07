package MistwoodInn;

public class Narrative{
    Narrative(){
    }
    public String printNarrative(String a){
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
                                        
                    <<Silver Coin has been added to your bag.>>
                                        
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
                    
                    You hear the door open behind you, and a scraggly-looking eyepatch-wearing woman walks in behind
                    you. Devlin greets her, and you exit the lobby towards the staircase.
                    """;
            case "turnCorner" -> """
                    As you turn around the corner towards your room, you hear a voice come from the other side
                    of the hallway. "Leave me ALONE!" You glance back over your shoulder and realize that
                    it came from behind the door the short woman just knocked on. The short woman notices your
                    glare, and returns an even more steely one.
                    
                    "I know why you're here," she states very matter-of-factly.
                    """;
            case "angeReply1" -> """
                    The short woman sighs, a defeated look overcoming her formerly pinched face. "Fair enough," she says.
                    """;
            case "angeReply2" -> """
                    The short woman continues to lock eyes with you, her suspicion seeming to only increase.
                    """;
            case "enterRoom" -> """
                    You break away from the woman's prying eyes and insert your key into the door. It opens with a
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
            case "mistRollsIn" -> """
                    You hang up your coat and sigh as you sit down on the edge of the bed. You reflect on how fortunate
                    you were to have the old man assist you in finding this place, but simultaneously think back
                    on the unpleasant encounter in the hallway with the short woman.
                    
                    As the last orange and pink hues morph into shadows, you notice wisps of fog start
                    to crawl through the underbelly of the forest. You step closer to the window to watch
                    the hauntingly beautiful scene. Through the birch trees, you think you see a figure
                    walking towards the inn, but the impending darkness does not allow you to discern
                    apparition from reality.
                    
                    What do you do?
                    Enter 1: Lie down and get some rest
                    Enter 2: Make your way outside out of curiosity
                    """;
            case "room10" -> """
                    You turn the metal doorknob and step back into the hallway. The door across from yours,
                    emboldened with a golden 10, is slightly ajar. You don't remember it being open when
                    you were in the hallway earlier. From the room, you can hear a woman singing a beautiful melody,
                    only for it to be cut short by a spasm of sobs.
                    """;
            case "patriceIntro" -> """
                    You take another step, and the crying stops. "Oh, hello? Who's there? Please, come in. Sorry if
                    you heard all that." You step into Room 10. A middle-aged woman wearing a lavender jacket wipes the
                    mascara dribble from around her eyes. She looks up and offers you a weak smile.
                    
                    "I'm Patrice. This inn is like a second home for me. When I traveled between Regio and Alabastin
                    with my caravan, I used to stop here all the time. You see, when you have a Gift like mine,
                    you want to use it as much as possible. But as soon as you begin to notice the first pockets
                    of sagging flesh, the wrinkles you pretend aren't there, you start feeling like a shell of yourself.
                    All the fame associated with my vocal talents and the caravan are gone just as quick. Soon enough
                    you're replaced with the next up-and-coming doll whose Gift is that much more alluring."
                    
                    You return her monologue with a nod of understanding. "Have you heard of the legend of the
                    Permanence Stone? It's said to be able to stop peoples' Gifts from vanishing altogether, and
                    restore them if they've already disappeared," you say.
                    
                    Patrice glances at you with a mix of skepticism and curiosity. "I have indeed heard of it. It's
                    said Prince Dallio was close to discovering it, but he disappeared not too long ago. Any dunce
                    can see the table how it's set, though. He must have found it, then used his Gift to disguise
                    himself as a commoner. As someone who's had their fair dose of fame, I don't blame him in
                    the slightest for wanting to escape from all of the spotlight."
                    
                    "I agree," you say, not trying to reveal too much. You consider that Patrice may be unaware that
                    Prince Dallio was last seen here, but her glance from earlier makes you think otherwise.
                    "It was nice to meet you, Patrice. I'm sure we'll see each other again soon," you say as you step
                    out of Room 10.
                    """;
            case "nightNoise" -> """
                    You change into more comfortable clothing, then get into bed. It is not until you lie down that
                    you realize how the journey has sapped your energy. As you start to drift off, you hear a shriek
                    come from the hallway. "Leave me ALONE!"
                    
                    What do you do?
                    Enter 1: Enter the hallway to see what's going on
                    Enter 2: Ignore it and go back to bed
                    """;
            case "ignoreNoise" -> """
                    You decide the shriek is not your concern. Not long after, you drift easily into a deep sleep.
                    """;
            case "inspectNoise" -> """
                    Still in your room, your open a door a crack. On the other side of the hallway, you see the
                    short woman with jet-black hair standing in front of the same door she was before. However,
                    this time, the door is open. Also, the scraggly-looking eyepatch-wearing woman who entered the inn
                    behind you is standing there as well. You overhear the short woman say to her, "This girl's Gift is
                    absolutely remarkable, is it not? She would make an excellent addition to the Academy."
                    
                    "Like hell I'd go to your oh-so-special Academy," you hear the voice from inside the room say.
                    
                    Do you decide to intervene?
                    Enter Yes or No.
                    """;
            case "interveneYes" -> """
                    After taking a deep breath, you push your door open further and enter the hallway. Immediately,
                    the two conferring women turn directly towards you. "Hmph," the short woman
                    says. "I knew you and I had competing objectives as soon as we locked eyes. Tell you what. If you
                    leave the inn this instant and tell no one about what you just heard, I'll stop myself from telling
                    everyone at this inn your Gift and how you're using it right now. That way you can still escape
                    with your dignity intact."
                    
                    You wonder how this woman could possibly know what your Gift is. The only reasonable explanation,
                    you think, is that her Gift is to be able to determine other peoples' Gifts with one glance - and
                    whether they're currently using it.
                    
                    Do you leave the inn?
                    Enter Yes or No.
                    """;
            case "strandedEnding" -> """
                    "Ok, I'll leave right away," you say, not wanting to blow your cover. If this woman had told the
                    rest of the inn your Gift, the ability to create a clone of yourself and control it from a distance,
                    then they had every right to be suspicious - especially because it was your clone that you had sent
                    to the inn, not your physical self. You thought sending your clone would protect you from any sort
                    of physical harm, but it seems that backfired.
                    
                    You gather your things and exit back into the forest. The mist has become incredibly dense, and
                    you're completely lost as soon as you step a few paces from the door of the inn. You turn around
                    to face the inn so you can get a bearing - but it has disappeared entirely! In a bout of panic, you
                    dissolve your clone into thin air, and sit up straight in your chair.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Stranded Ending". There are multiple endings
                    to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "interveneNo" -> """
                    You take extra care to close your door quietly. Curiosity bounces off the walls of your brain,
                    but as soon as you lay down on your bed, your weariness sends you into a deep slumber.
                    """;
            case "daria" -> """
                    The short woman laughs. "A poor choice. Everyone, hear me. The guest in Room 10's Gift is ---."
                    She stops talking. Behind her, a tendril of fog shoots out from underneath the shrieking girl's
                    doorway and wraps itself around the mouth of the short woman. Another does the same to the
                    eyepatch-wearing woman. Their screams are muffled by their ethereal constrictors as the two women
                    are pulled into the girl's room. You watch as they both kick the hallway's floorboards, their feet
                    desperately searching for something to cling to. Finding nothing, the women are both dragged into the
                    girl's room. The door shuts. And then, silence.
                    """;
            case "scared" -> """
                    Petrified at what you just witnessed, you look around to see if there were any fellow witnesses
                    in the hallway. Seeing none, you hold your breath and tiptoe your way back into your room, praying
                    that the floorboards won't betray you. They do not, and you lay down in bed. You close your eyes
                    and attempt to sleep, but the scene that just unfolded projects itself onto the back of your
                    eyelids. After tossing and turning for a few hours, you somehow manage to lull yourself to sleep.
                    """;
            case "continueDownstairs" -> """
                    You continue to make your way downstairs. As you reach the top of the staircase, you hear something
                    coming from the room adjacent: room 7. You notice this is the same door that the short woman was
                    trying to enter earlier. As you step closer, you can make out the voice of a teenage girl, "All you
                    had to do was tell the truth. Why did you lie? All you had to do was..." She repeats the two
                    sentences over and over.
                    
                    Unnerved, you continue downstairs and pass Devlin at the desk. He is reading a large red book, his eyes
                    scanning the pages at an inhuman rate. As you pass by, he flashes you a brief smile. You exit the inn
                    and walk around towards the back, where you think you saw the figure.
                    
                    As you round the corner, you see that the old man that guided you earlier is tending to the horses
                    in the stable. He does not seem to notice you yet, as he brushes the dirt and hay off of himself.
                    After a brief glance around, he transforms right in front of your eyes into a young man. He then
                    begins to move towards where you are hiding, presumably to enter the inn. As he approaches, he steps
                    in front of one of the lanterns lighting the outside of the inn, illuminating his face in the
                    darkness. You gasp, as you recognize the face. It is Devlin's.
                    
                    Do you walk towards this person?
                    Enter Yes or No.
                    """;
            case "confrontShapeshifter" -> """
                    You start walking towards the Devlin look-alike, trying to keep your expression as neutral as
                    possible. Devlin's look-alike nods at you, and you think that this version likely doesn't know your
                    name. Playing dumb, you say, "It's good to see you again, Devlin. You get around pretty fast.
                    I could have sworn I just saw you behind the podium at the front entrance."
                    
                    The shapeshifter nods emphatically, the same way the real Devlin did when you first met him.
                    """;
            case "headbackInn" -> """
                    Confused, you follow the shapeshifter back inside. Devlin is no longer behind the desk. The
                    shapeshifter goes behind the desk, sits down, picks up the red book, and starts scanning through it
                    with rapid speed. Too perplexed to even offer this version of Devlin a smile, you head back upstairs
                    to your room.
                    """;
            case "headbackInn2" -> """
                    You turn back around quietly, placing your feet carefully on the snow. You swing the inn's door open,
                    and see that no one is behind the desk. Perplexed, you start walking upstairs, then turn around on
                    the third step as you hear the front door open behind you. Glancing over your shoulder, you see
                    that Devlin's look-alike has entered. He walks behind the desk, and begins to flip through the same
                    red book that the other version of him was doing earlier. You bite your lip.
                    """;
            case "morningCall" -> """
                    You are awakened by the sound of paper sliding across the floorboards underneath your door. Your
                    feet reluctantly slide out from underneath the covers, and you open the note. It reads:
                    """;
            case "morningMessage" -> """
                    If you would, please join some of the other guests and myself in the lobby for some freshly prepared
                    breakfast at your earliest convenience.
                    
                    Forever yours,
                    Devlin
                    """;
            case "skepticalMessage" -> """
                    The events of last night still replaying in your head, you get dressed and make your way downstairs.
                    You're not sure which room Devlin could easily prepare breakfast, but after stepping off the staircase,
                    you notice an opening in the wall behind the desk that you were certain was not there before. You
                    lower your head to pass through the opening. On the other side, a sprawling birchwood table has
                    all sorts of pastries and fruit organized with a sort of off-putting precision. It is as if not a
                    single item on the table is out of place or has been touched.
                    """;
            case "normalMessage" -> """
                    Excited to see what Devlin has prepared for you, you get dressed and make your way downstairs.
                    You're not sure where Devlin could have easily prepare breakfast, but after stepping off the staircase,
                    you notice an opening in the wall behind the desk that you were certain was not there before. You
                    lower your head to pass through the opening. On the other side, a sprawling birchwood table has
                    all sorts of pastries and fruit organized with a sort of off-putting precision. It is as if not a
                    single item on the table is out of place or has been touched.
                    """;
            case "patrice&OldMan" -> """
                    You take a seat at the table across from Patrice. She flashes you a weary smile, the bags under
                    her eyes telling their own story. Next to her sits the old man you saw last night. He waves at you
                    and says, "Try the barley toast with jam! It's heavenly!"
                    
                    Sitting at the far end of the table is a brown-haired teenage girl, her arms crossed in defiance.
                    She casts a petrifying glare in your direction, then lets out a soft "hmph". She adjusts the grey
                    bow in her hair, which matches the same color lace tied around her neck.
                    
                    Devlin is standing behind the girl, preparing something on the stove. He briefly glances over his
                    shoulder. "Oh! Looks like we're all here. Excellent. Well, not all of us..." Devlin trails off.
                    "Ah! But that's why we're here, is it not?" He seemed pleasantly surprised with his segue.
                    """;
            case "patriceOnly" -> """
                    You take a seat at the table across from Patrice. She flashes you a weary smile, the bags under
                    her eyes telling their own story. Next to her sits the old man you saw before entering the inn yesterday.
                    He waves at you and says, "Try the barley toast with jam! It's heavenly!"
                    
                    Sitting at the far end of the table is a brown-haired teenage girl, her arms crossed in defiance.
                    She casts a petrifying glare in your direction, then lets out a soft "hmph". She adjusts the grey
                    bow in her hair, which matches the same color lace tied around her neck.
                    
                    Devlin is standing behind the girl, preparing something on the stove. He briefly glances over his
                    shoulder. "Oh! Looks like we're all here. Excellent. Well, not all of us..." Devlin trails off.
                    "Ah! But that's why we're here, is it not?" He seemed pleasantly surprised with his own segue.
                    """;
            case "nobodyKnows" -> """
                    You take a seat at the table across from a woman wearing a lavender jacket. Her face says that
                    sleepless nights are the norm, the bags under her eyes telling the same story. Next to her sits the
                    old man you saw before entering the inn yesterday. He waves at you and says, "Try the barley toast
                    with jam! It's heavenly!"
                    
                    Sitting at the far end of the table is a brown-haired teenage girl, her arms crossed in defiance.
                    She casts a petrifying glare in your direction, then lets out a soft "hmph". She adjusts the grey
                    bow in her hair, which matches the same color lace tied around her neck.
                    
                    Devlin is standing behind the girl, preparing something on the stove. He briefly glances over his
                    shoulder. "Oh! Looks like we're all here. Excellent. Well, not all of us..." Devlin trails off.
                    "Ah! But that's why we're here, is it not?" He seemed pleasantly surprised with his own segue.
                    """;
            case "devlinReveal" -> """
                    Devlin's expression quickly darkens. "Two of the guests are missing. It's not simply a case of
                    them getting up and leaving at the end of the night - that happens all the time. The peculiar facts
                    are these. First, all of their baggage is still in their rooms. Second, there is only one way in
                    and out of Mistwood Inn: the front door. I was monitoring it the entire night. The windows do not
                    open, nor had any of them been broken. Third, even though these two guests arrived separately,
                    they vanished simultaneously."
                    """;
            case "accuseDaria" -> """
                    "I saw everything. Everything." The girl glares at you maliciously, but says nothing. You continue.
                    "There were two guests would not stop harassing her, almost talking about her like she was some sort
                    of dumb plaything. They were talking about bringing her to some academy..."
                    
                    "They wanted to force me to use my Gift as part of their Military Academy," the girl says. "It's
                    not the first time they've come after me. They wanted to see my Gift in action, so I showed them..."
                    she trails off.
                    
                    Enter 1: Interject and explain exactly what you saw happen last night
                    Enter 2: Say nothing
                    """;
            case "vanishingEnding" -> """
                    You think back to what you saw last night - the tendrils of fog shooting out from the girl's room,
                    almost with a mind of their own, taking hold of the two women. "You mean you killed them,"
                    you say.
                    
                    The girl begins to laugh softly. "Kill?! No, no. What you saw was something entirely different.
                    You see, my Gift just makes people disappear." She begins to laugh louder, and she does, fog begins
                    to surround her body. After a few seconds, the fog begins to coalesce into two human-shaped forms:
                    a short woman and a sturdy woman. They writhe uncontrollably. Everyone around the table takes a
                    step back in horror. Then, before you can react quick enough, the formless right hand of the
                    shorter fog figure reaches out towards you.
                    
                    Her foggy hand wraps around your own, sending a cold sensation throughout your body. Your entire body
                    becomes paralyzed. You can only watch as your own body begins to transform into ethereal particles,
                    molecules being rearranged at the molecular level.
                    
                    However, you remain entirely calm. For this girl has no idea of your Gift. She watches as you begin
                    to disappear faster than the fog that is overtaking you. Soon, you are in a completely different
                    room. You sit up straight in your chair and reflect on how many times your Gift - the ability
                    to create a clone of yourself and control it remotely - has saved your life.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Vanishing Ending". There are multiple endings
                    to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "runAwayEnding" -> """
                    "I saw what you did to them!" Patrice speaks up. "You're a killer. Those women were ensnared by some
                    sort of fog creature. And I can only imagine you must have created that!"
                    
                    The girl begins to laugh softly. "Kill?! No, no. What you saw was something entirely different.
                    You see, my Gift just makes people...disappear." She begins to laugh louder, and she does, fog begins
                    to surround her body. After a few seconds, the fog begins to coalesce into two human-shaped forms:
                    a short woman and a sturdy woman. They writhe uncontrollably. Everyone around the table takes a
                    step back in horror.
                    
                    The girl snaps, and the shorter fog figure extends its formless hand towards Patrice. You watch
                    as particle by particle of Patrice's body is transformed into an ethereal fog. To your surprise,
                    Patrice begins laughing, tears springing to her eyes. "Ah! To live again. How exciting! Thank you,
                    young woman, for reminding me what it is like."
                    
                    You exchange glances with Devlin and the old man. Your eyes conversate briefly, then the three of you
                    simultaneously run out of the inn, not looking back even once.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Runaway Ending". There are multiple endings
                    to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "runAwayEnding2" -> """
                    "I saw what you did to them!" The woman wearing the lavender coat speaks up. "You're a killer.
                    Those women were ensnared by some sort of fog creature. And I can only imagine you must have
                    created it!"
                    
                    The girl begins to laugh softly. "Kill?! No, no. What you saw was something entirely different.
                    You see, my Gift just makes people...disappear." She begins to laugh louder, and she does, fog begins
                    to surround her body. After a few seconds, the fog begins to coalesce into two human-shaped forms:
                    a short woman and a sturdy woman. They writhe uncontrollably. Everyone around the table takes a
                    step back in horror.
                    
                    The girl snaps, and the shorter fog figure extends its formless hand towards Patrice. You watch
                    as particle by particle of the woman's body is transformed into an ethereal fog. To your surprise,
                    Patrice begins laughing, tears springing to her eyes. "Ah! To live again. How exciting! Thank you,
                    young woman, for reminding me what it is like."
                    
                    You exchange glances with Devlin and the old man. Your eyes conversate briefly, then the three of you
                    simultaneously run out of the inn, not looking back even once.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Runaway Ending". There are multiple endings
                    to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "accuseShapeshifter" -> """
                    "Actually, Devlin, I did see something strange," you respond, maintaining eye contact with the
                    innkeeper. "Last night, I went to the stables to go check on my horse. Then, right in front of my
                    eyes, I saw this old man here," you gesture towards the old man sitting next you, "transform
                    from himself into you."
                    
                    Devlin and the old man do not flinch. "I can explain why you saw what you saw," Devlin says.
                    """;
            case "devlinTellsTruth" -> """
                    Devlin stands up. "The truth is, I haven't been perfectly honest with you, or anyone here, about
                    my Gift," Devlin says. "I do not, in fact, have an encyclopedic memory. My actual gift is much
                    more powerful than that." He pauses. "I am able to control what people see for very brief moments
                    of time. However, there are three conditions that I have to fulfill for me to do that.
                    
                    "First, I have to pick a central 'home base' to focus my powers on. In other words, I cannot use
                    my powers outside of Mistwood Inn. Second, I can only change peoples' perception of things who are
                    within this inn and the immediate surrounding forest. Third, I can only control the thoughts of one
                    person at a time."
                    
                    You begin to second guess everything you've seen since you arrived at Mistwood Inn. How extensive
                    is Devlin's power? Are the people sitting around the kitchen table with you actually there?
                    """;
            case "distortedEnding" -> """
                    You blink once, and suddenly you are standing in the middle of the birchwood forest. Behind you,
                    you hear a voice say, "Lost, are we? Not the first, not the last. Please, follow me. The Mistwood Inn
                    is not much farther ahead. Best we get there before the snow picks up." You search the old man's
                    face for any signs that this is the same man that you were just sitting next to at the kitchen
                    table seconds ago. A knowing twinkle in his right eye glints with a certain self-awareness.
                    
                    "Devlin and I don't trust you, traveler. Next time, don't forget about me." With that, the old man
                    turns and walks back into the forest, leaving you unsure of where to go next.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Distorted Ending". There are multiple endings
                    to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "beginningoftheEnding" -> """
                    "All of this is for good reason, though. You see, the truth is that Prince Dallio does pass through
                    this forest quite often, preferring to change appearances at will. To protect his identity, he
                    enlisted me to disorient anyone who seems suspicious after I tell them about his passing
                    through here. However, we don't think you're one of those people. You're after something else entirely.
                    The Permanence Stone."
                    
                    Seeing your startled reaction, Devlin says, "Not to worry. We have no intent in stopping your
                    pursuit. In fact, we are a sort of guardian for the stone. However, the Stone does not show itself
                    to all who desire it. What we'll have to do is the following. I will use my powers of distortion to
                    make it seem like you are outside the inn once again. Jeb," Devlin gestures to the old man, "will
                    make sure to guide you to the Inn once again. You will remember nothing from before, although I sense
                    that, for some reason, that won't be a problem for you. So let me say this - once you are inside the Inn,
                    try to do as little as possible. The Stone should present itself to you in that case."
                    
                    You nod, and only have a few seconds to make sense of what Devlin said before you find yourself
                    in the birchwood forest once again.
                    
                    -------------------------------------------- THE END --------------------------------------------
                    You have reached the end of this storyline. This is the "Beginning of the Ending". There are multiple
                    endings to the game, only one of which is the "True Ending" (not this one! sorry). Armed with your
                    knowledge from this playthrough, go forth again and find the True Ending!
                    """;
            case "patriceSkeptical" -> """
                    Patrice glances at you suspiciously. "You didn't strike me as a liar at first," she says
                    to you.
                    
                    You hold your ground. "How would you know that I'm lying?" you retort.
                    
                    Patrice's face suddenly goes pale, as it dawns on her that she would have to be the one to explain
                    what you both saw. Fearing that she'd become another target of the girl, she quickly gets up from the table
                    and exits the inn. The remaining people at the table exchange glances, but nothing is said.
                    """;
            case "permStoneDiscussion" -> """
                    Devlin nods, then proceeds to look at the other people around the table. "Anyone else notice anything
                    awry last evening?"
                    
                    No one says a word.
                    
                    "Well, I'll have to do some investigation on my own, then. I'm sorry to have worried any of you."
                    
                    "Wait," says the girl, her tone commanding. "I want to have a discussion about the Permanence Stone."
                    
                    The old man and Devlin exchange worried glances. "What about it?" Devlin asks.
                    
                    "I know you use it, old man. I saw you disappear when this traveler," she says, gesturing to you,
                    "walked into the inn before the storm rolled in. But you shouldn't still be able to use your Gift at your
                    age. So please, tell us where it is. I don't want have to resort to...other means to obtain it."
                    """;
            case "oldManExplanation" -> """
                    "So I've been found out. Very perceptive of you, young lady," the old man says with a wry smile.
                    "I will tell you where the stone is. But please promise me that you won't cause harm to innocent
                    people with that Gift of yours anymore," the old man says with a knowing eye.
                    
                    The girl nods. The old man continues, "There is, in fact, no such thing as the Permanence Stone.
                    Many acknowledge the fact that peoples' Gifts expire over time, but no one ever questions why. I
                    have spent my entire life searching for that reason. And it was not until I met a young boy named
                    Prince Dallio when I found my answer. The young prince was so full of life, so blissful and carefree.
                    He was scared of growing older, as he knew that it meant he would lose his Gift. I had already
                    begin to see mine ebb away.
                    
                    But there was something about the prince's candor and desire to stay a child that I reflected on.
                    I began to resist the mindset that my Gift had ebbed away due to my physical age. I was still
                    perfectly capable of incorporating youthful energy into my every day life. Over time, I began to
                    notice that I was able to use my Gift in small bursts. I was overcome with joy."
                    
                    You are skeptical of the old man's tale. A simple shift in mindset is all it takes to keep one's
                    Gift forever. You look closer at the old man's face, though, and see how content he seems. It is
                    a genuine sort of happiness, not a feigned one steeped in depression.
                    
                    You deactivate your Gift - the ability to create an exact clone of yourself and control it remotely -
                    and sit up straight in your chair, feeling a surge of inspiration and inquisitiveness you haven't
                    felt in years.
                    """;
            case "trueEnding" -> """
                    -------------------------------------------- THE END --------------------------------------------
                    Congratulations! You have reached the True Ending. Mistwood Inn thanks you for staying with us.
                    We hope you enjoyed our hospitality.
                    """;
            default -> "";
        };
    }
}
