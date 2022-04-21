package MistwoodInn;

public class Item {
    Item(){}
    public String getItemInfo(String item){
        return switch (item){
            case "Letter" -> """
                    You unravel the letter, its worn parchment making a crinkling noise. Written haphazardly in ink
                    is the following:
                    
                    My kin in blood,
                    Seek the Mistwood Inn. My friends at the Conservatory tell me it is the last place Prince
                    Dallio visited before he disappeared. We have reason to believe he was seeking the Permanence
                    Stone there. Be wary - he still may be hiding among the travelers.
                    
                    Find the Permanence Stone, and we can restore Mother's Gift to what it once was.
                    -E
                    """;
            case "Room 9 Key" -> "A small, metal key that opens the door to Room 9 at the Mistwood Inn.\n";
            case "Silver coin" -> "A silver coin that has the face of an old woman on one side and a tree on the other.\n";
            case "Rations" -> "Food and water for your journey, including a loaf of bread your cousin baked for you\n";
            default -> "";
        };
    }

}
