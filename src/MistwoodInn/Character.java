package MistwoodInn;

public class Character {
    String charName;
    Character(String charName){
        this.charName = charName;
    }
    public String getShortBio(){
        return switch (charName){
            case "Devlin" -> "Mistwood Inn's friendly round-the-clock innkeeper";
            case "Ange" -> "A short, middle-aged detective with jet-black hair";
            case "Daria" -> "A 14-year old girl who just wants to be left alone";
            default -> "";
        };
    }
}
