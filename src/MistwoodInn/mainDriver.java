package MistwoodInn;

import java.util.ArrayList;
import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();
        Narrative narrativeHost = new Narrative();
        System.out.println(narrativeHost.getNarrative("intro1"));
        System.out.println(narrativeHost.getNarrative("intro2"));
        System.out.println("Do you go back outside to look for the old man? (Yes/No)");
        String oldManAnswer = input.nextLine();
        //should implement try catch here
        if (oldManAnswer.equals("Yes")){
            System.out.println(narrativeHost.getNarrative("oldManCheck"));
            inventory.add("Silver coin");
            //System.out.println(inventory.contains("Silver coin"));
            System.out.println(narrativeHost.getNarrative("enterInn"));
        }
        else if (oldManAnswer.equals("No")){
            System.out.println(narrativeHost.getNarrative("enterInn"));
        }
        String name = input.nextLine();
        System.out.println("'Ah, I'm so glad you'll be joining us, " + name + ".'");
        //late night his personality changes
        System.out.println(narrativeHost.getNarrative("devlinIntro"));
        System.out.println("What do you do now?");
        while (true){
            //will need to implement error handler here as well
            System.out.println("Enter 1: Go drop your things off in your room");
            System.out.println("Enter 2: Ask Devlin about the inn's history");
            System.out.println("Enter 3: Head down the hallway to your left (without going upstairs)");
            int introChoice = input.nextInt();

            if(introChoice == 1){
                System.out.println(narrativeHost.getNarrative("climbStairs"));
            }
            else if(introChoice == 2){
                System.out.println(narrativeHost.getNarrative("innHistory"));
            }
            else if(introChoice == 3){
                System.out.println(narrativeHost.getNarrative("firstFloorHallway"));
            }
        }



    }
}
