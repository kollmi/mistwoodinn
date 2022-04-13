package MistwoodInn;

import java.util.ArrayList;
import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> bag = new ArrayList<>();
        bag.add("Letter");
        Narrative narrativeHost = new Narrative();
        System.out.println(narrativeHost.getNarrative("intro1"));
        System.out.println(narrativeHost.getNarrative("intro2"));
        System.out.println("Do you go back outside to look for the old man? (Enter Yes or No)");

        while(true){
            String oldManAnswer = input.nextLine();
            if (oldManAnswer.equals("Yes")) {
                System.out.println(narrativeHost.getNarrative("oldManCheck"));
                bag.add("Silver coin");
                //if(bag.contains("Silver coin"));
                System.out.println(narrativeHost.getNarrative("enterInn"));
                break;
            }
            else if (oldManAnswer.equals("No")) {
                System.out.println(narrativeHost.getNarrative("enterInn"));
                break;
            }
            else{
                System.out.println("Invalid input. Please enter Yes or No.");
            }
        }
        String name = input.nextLine();
        System.out.println("\"Ah, I'm so glad you'll be joining us, " + name + ".\"");
        System.out.println("Devlin simply stares back at you, not writing anything down.");
        System.out.println(narrativeHost.getNarrative("devlinIntro"));

        System.out.println(narrativeHost.getNarrative("devlinIntro2"));
        bag.add("Room 9 Key");
        System.out.println("Room 9 Key added to your bag");
        System.out.println("What do you do now?");

        System.out.println("Enter 1: Head upstairs to your room");
        System.out.println("Enter 2: Ask Devlin for more information about the inn");

        //inn backstory
        while(true){
            String introChoice = input.nextLine();
            if(introChoice.equals("1")){
                System.out.println(narrativeHost.getNarrative("climbStairs"));
                break;
            }
            else if(introChoice.equals("2")){
                System.out.println(narrativeHost.getNarrative("innBackstory"));
                System.out.println(narrativeHost.getNarrative("innBackstory2"));
                while(true){
                    String innChoice = input.nextLine();
                    if (innChoice.equals("1")){
                        System.out.println(narrativeHost.getNarrative("climbStairs"));
                        break;
                    }
                    else if (innChoice.equals("2")) {
                        System.out.println(narrativeHost.getNarrative("innBackstory3"));
                        System.out.println(narrativeHost.getNarrative("climbStairs"));
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please enter 1 or 2.");
                    }
                }
               break;
            }
            else{
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }
        //enter room
        System.out.println(narrativeHost.getNarrative("turnCorner"));
        System.out.println("What do you say back?");
        String angeResponse = input.nextLine();
        if (angeResponse.contains("alone") || angeResponse.contains("ALONE")){
            System.out.println(narrativeHost.getNarrative("angeReply1"));
        }
        else {
            System.out.println(narrativeHost.getNarrative("angeReply2"));
        }
        System.out.println(narrativeHost.getNarrative("enterRoom"));
        System.out.println("Bag contents: " + bag);
        //bag check
        System.out.println("Enter the name of an item to inspect it further.");
        System.out.println("If you are done inspecting items, enter 2.");
        while(true){
            String bagCheck = input.nextLine();
            Item item1 = new Item();
            if (bag.contains(bagCheck)){
                System.out.println(item1.getItemInfo(bagCheck));
            }
            else if (bagCheck.equals("2")){
                break;
            }
            else {
                System.out.println("Incorrect input. Please enter either an item or 2.");
            }
        }
    }
}
