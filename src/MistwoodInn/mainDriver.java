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
        System.out.println("Do you go back outside to look for the old man? (Enter Yes or No)");
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
        System.out.println("Devlin simply stares back at you, not writing anything down.");
        System.out.println(narrativeHost.getNarrative("devlinIntro"));
        //late night his personality changes??
        System.out.println(narrativeHost.getNarrative("devlinIntro2"));
        System.out.println("What do you do now?");
        //will need to implement error handler here as well
        System.out.println("Enter 1: Head upstairs to your room");
        System.out.println("Enter 2: Ask Devlin for more information about the inn");
        int introChoice = input.nextInt();
        //inn backstory
        if(introChoice == 1){
            System.out.println(narrativeHost.getNarrative("climbStairs"));
        }
        else if(introChoice == 2){
            System.out.println(narrativeHost.getNarrative("innBackstory"));
            System.out.println(narrativeHost.getNarrative("innBackstory2"));
            int innChoice = input.nextInt();
            //another try catch needed
            if (innChoice == 1){
                System.out.println(narrativeHost.getNarrative("innBackstory3"));
            }
            else if (innChoice == 2) {
                System.out.println(narrativeHost.getNarrative("climbStairs"));
            }
        }




    }
}
