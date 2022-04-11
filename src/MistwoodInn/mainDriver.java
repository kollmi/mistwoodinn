package MistwoodInn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();
        Narrative narrativeHost = new Narrative();
        System.out.println(narrativeHost.getNarrative("intro1"));
        System.out.println(narrativeHost.getNarrative("intro2"));
        System.out.println("Do you go back outside to look for the old man? (Enter Yes or No)");

        while(true){
            String oldManAnswer = input.nextLine();
            if (oldManAnswer.equals("Yes")) {
                System.out.println(narrativeHost.getNarrative("oldManCheck"));
                inventory.add("Silver coin");
                //System.out.println(inventory.contains("Silver coin"));
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

    }
}
