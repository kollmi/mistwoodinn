package MistwoodInn;

public class Item {
    Item(){}
    public String getItemInfo(String item){
        return switch (item){
            case "Letter" -> "A letter";
            case "Room 9 Key" -> "playboi carti!";
            case "Silver coin" -> "a coin";
            case "Rations" -> "Food and water for your journey, including a loaf of bread your cousin baked for you";
            default -> "";
        };
    }

}
