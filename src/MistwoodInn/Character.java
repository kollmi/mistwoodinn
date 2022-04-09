package MistwoodInn;

public class Character {
    String charName;
    Character(String charName){
        this.charName = charName;
    }
    public String getShortBio(){
        return switch (charName){
            case "Devlin" -> "Mistwood Inn's round-the-clock concierge";
            case "Jakob" -> "A weary traveler from Alabastia";
            default -> "Nobody";
        };
    }
}
