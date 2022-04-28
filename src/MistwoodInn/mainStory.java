package MistwoodInn;

import java.util.ArrayList;
import java.util.Scanner;

public class mainStory {
    public static void main(String[] args){
        //setup
        Scanner input = new Scanner(System.in);
        ArrayList<String> bag = new ArrayList<>();
        bag.add("Letter");
        bag.add("Rations");

        boolean witness = false;
        boolean encounter = false;
        boolean patrice = false;

        //begin story
        Narrative narrativeHost = new Narrative();
        System.out.println(narrativeHost.printNarrative("intro1"));
        System.out.println(narrativeHost.printNarrative("intro2"));
        System.out.println("Do you go back outside to look for the old man? (Enter Yes or No)");

        while(true){
            String oldManAnswer = input.nextLine();
            if (oldManAnswer.equals("Yes")) {
                System.out.println(narrativeHost.printNarrative("oldManCheck"));
                bag.add("Silver coin");
                //if(bag.contains("Silver coin"));
                System.out.println(narrativeHost.printNarrative("enterInn"));
                break;
            }
            else if (oldManAnswer.equals("No")) {
                System.out.println(narrativeHost.printNarrative("enterInn"));
                break;
            }
            else{
                System.out.println("Invalid input. Please enter Yes or No.");
            }
        }
        String name = input.nextLine();
        System.out.println("\"Ah, I'm so glad you'll be joining us, " + name + ".\"");
        System.out.println("Devlin simply stares back at you, not writing anything down.");
        System.out.println(narrativeHost.printNarrative("devlinIntro"));

        System.out.println(narrativeHost.printNarrative("devlinIntro2"));
        bag.add("Room 9 Key");
        System.out.println("Room 9 Key added to your bag");
        System.out.println("What do you do now?");

        System.out.println("Enter 1: Head upstairs to your room");
        System.out.println("Enter 2: Ask Devlin for more information about the inn");

        //inn backstory
        while(true){
            String introChoice = input.nextLine();
            if(introChoice.equals("1")){
                System.out.println(narrativeHost.printNarrative("climbStairs"));
                break;
            }
            else if(introChoice.equals("2")){
                System.out.println(narrativeHost.printNarrative("innBackstory"));
                System.out.println(narrativeHost.printNarrative("innBackstory2"));
                while(true){
                    String innChoice = input.nextLine();
                    if (innChoice.equals("1")){
                        System.out.println(narrativeHost.printNarrative("climbStairs"));
                        break;
                    }
                    else if (innChoice.equals("2")) {
                        System.out.println(narrativeHost.printNarrative("innBackstory3"));
                        System.out.println(narrativeHost.printNarrative("climbStairs"));
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
        System.out.println(narrativeHost.printNarrative("turnCorner"));
        System.out.println("What do you say back?");
        String angeResponse = input.nextLine();
        if (angeResponse.contains("alone") || angeResponse.contains("ALONE")){
            System.out.println(narrativeHost.printNarrative("angeReply1"));
        }
        else {
            System.out.println(narrativeHost.printNarrative("angeReply2"));
        }
        System.out.println(narrativeHost.printNarrative("enterRoom"));
        System.out.println("Bag contents: " + bag);

        //bag check
        while(true){
            System.out.println("Enter the name of an item in your bag to inspect it further.");
            System.out.println("If you are done inspecting your bag, enter Done");
            String bagCheck = input.nextLine();
            Item item1 = new Item();
            if (bag.contains(bagCheck)){
                System.out.println(item1.getItemInfo(bagCheck));
            }
            else if (bagCheck.equals("Done")){
                break;
            }
            else {
                System.out.println("Incorrect input. Please enter a valid item or Done");
            }
        }

        /*large conditional statement tree
        main events:
        - Daria makes Ange and eyepatch woman disappear (witness = true)
        - you go to bed
        - you meet Patrice
        - you end up stranded in the woods
        - you meet a shapeshifter near the stables
        * */
        System.out.println(narrativeHost.printNarrative("roomDecision"));

        while(true){
            String roomChoice = input.nextLine();
            if (roomChoice.equals("1")){
                System.out.println(narrativeHost.printNarrative("mistRollsIn"));
                while(true){
                    String goDownstairs = input.nextLine();
                    //Daria arc
                    if (goDownstairs.equals("1")){
                        System.out.println(narrativeHost.printNarrative("nightNoise"));
                        while(true){
                            String nightNoise = input.nextLine();
                            if(nightNoise.equals("1")){
                                System.out.println(narrativeHost.printNarrative("inspectNoise"));
                                while (true){
                                    String intervention = input.nextLine();
                                    if(intervention.equals("Yes")){
                                        System.out.println(narrativeHost.printNarrative("interveneYes"));
                                        while(true){
                                            String leaveInn = input.nextLine();
                                            if(leaveInn.equals("Yes")){
                                                System.out.println(narrativeHost.printNarrative("strandedEnding"));
                                                break;
                                            }
                                            else if (leaveInn.equals("No")){
                                                System.out.println(narrativeHost.printNarrative("daria"));
                                                witness = true;
                                                System.out.println(narrativeHost.printNarrative("scared"));
                                                break;
                                            }
                                            else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                        }
                                        break;
                                    }
                                    else if (intervention.equals("No")){
                                        System.out.println(narrativeHost.printNarrative("interveneNo"));
                                        break;
                                    }
                                    else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                }
                                break;
                            }
                            else if(nightNoise.equals("2")){
                                System.out.println(narrativeHost.printNarrative("ignoreNoise"));
                                break;
                            }
                            else{System.out.println("Incorrect input. Please enter 1 or 2.");}
                        }
                        break;
                        //Daria arc end
                    }
                    else if (goDownstairs.equals("2")){
                        System.out.println(narrativeHost.printNarrative("room10"));
                        System.out.println(narrativeHost.printNarrative("patriceIntro"));
                        patrice = true;
                        //supposed to go downstairs
                        System.out.println(narrativeHost.printNarrative("continueDownstairs"));
                        while(true){
                            String confrontChoice = input.nextLine();
                            if (confrontChoice.equals("Yes")){
                                System.out.println(narrativeHost.printNarrative("confrontShapeshifter"));
                                encounter = true;
                                System.out.println("It's great to see you again, " + name + "!");
                                System.out.println(narrativeHost.printNarrative("headbackInn"));
                                System.out.println(narrativeHost.printNarrative("nightNoise"));
                                while(true){
                                    String nightNoise = input.nextLine();
                                    if(nightNoise.equals("1")){
                                        System.out.println(narrativeHost.printNarrative("inspectNoise"));
                                        while (true){
                                            String intervention = input.nextLine();
                                            if(intervention.equals("Yes")){
                                                System.out.println(narrativeHost.printNarrative("interveneYes"));
                                                while(true){
                                                    String leaveInn = input.nextLine();
                                                    if(leaveInn.equals("Yes")){
                                                        System.out.println(narrativeHost.printNarrative("strandedEnding"));
                                                        break;
                                                    }
                                                    else if (leaveInn.equals("No")){
                                                        System.out.println(narrativeHost.printNarrative("daria"));
                                                        witness = true;
                                                        System.out.println(narrativeHost.printNarrative("scared"));
                                                        break;
                                                    }
                                                    else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                                }
                                                break;
                                            }
                                            else if (intervention.equals("No")){
                                                System.out.println(narrativeHost.printNarrative("interveneNo"));
                                                break;
                                            }
                                            else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                        }
                                        break;
                                    }
                                    else if(nightNoise.equals("2")){
                                        System.out.println(narrativeHost.printNarrative("ignoreNoise"));
                                        break;
                                    }
                                    else{System.out.println("Incorrect input. Please enter 1 or 2.");}
                                }
                                break;
                            }
                            else if (confrontChoice.equals("No")){
                                System.out.println(narrativeHost.printNarrative("headbackInn2"));
                                System.out.print("As you head back upstairs, you hear Devlin's look-alike say, \"");
                                System.out.print(name + ", let me know if you need anything!\"\n");
                                System.out.println("Flustered, you head back upstairs to your room.\n");
                                System.out.println(narrativeHost.printNarrative("nightNoise"));
                                while(true){
                                    String nightNoise = input.nextLine();
                                    if(nightNoise.equals("1")){
                                        System.out.println(narrativeHost.printNarrative("inspectNoise"));
                                        while (true){
                                            String intervention = input.nextLine();
                                            if(intervention.equals("Yes")){
                                                System.out.println(narrativeHost.printNarrative("interveneYes"));
                                                while(true){
                                                    String leaveInn = input.nextLine();
                                                    if(leaveInn.equals("Yes")){
                                                        System.out.println(narrativeHost.printNarrative("strandedEnding"));
                                                        break;
                                                    }
                                                    else if (leaveInn.equals("No")){
                                                        System.out.println(narrativeHost.printNarrative("daria"));
                                                        witness = true;
                                                        System.out.println(narrativeHost.printNarrative("scared"));
                                                        break;
                                                    }
                                                    else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                                }
                                                break;
                                            }
                                            else if (intervention.equals("No")){
                                                System.out.println(narrativeHost.printNarrative("interveneNo"));
                                                break;
                                            }
                                            else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                        }
                                        break;
                                    }
                                    else if(nightNoise.equals("2")){
                                        System.out.println(narrativeHost.printNarrative("ignoreNoise"));
                                        break;
                                    }
                                    else{System.out.println("Incorrect input. Please enter 1 or 2.");}
                                }
                                break;
                            }
                            else{
                                System.out.println("Incorrect input. Please enter Yes or No.");
                            }
                        }
                        break;
                    }
                    else{System.out.println("Incorrect input. Please enter 1 or 2.");}
                }
                break;
            }
            else if (roomChoice.equals("2")){
                System.out.println(narrativeHost.printNarrative("room10"));
                System.out.println(narrativeHost.printNarrative("patriceIntro"));
                patrice = true;
                //repeat Daria arc
                System.out.println(narrativeHost.printNarrative("nightNoise"));
                while(true){
                    String nightNoise = input.nextLine();
                    if(nightNoise.equals("1")){
                        System.out.println(narrativeHost.printNarrative("inspectNoise"));
                        while (true){
                            String intervention = input.nextLine();
                            if(intervention.equals("Yes")){
                                System.out.println(narrativeHost.printNarrative("interveneYes"));
                                while(true){
                                    String leaveInn = input.nextLine();
                                    if(leaveInn.equals("Yes")){
                                        System.out.println(narrativeHost.printNarrative("strandedEnding"));
                                        break;
                                    }
                                    else if (leaveInn.equals("No")){
                                        System.out.println(narrativeHost.printNarrative("daria"));
                                        witness = true;
                                        System.out.println(narrativeHost.printNarrative("scared"));
                                        break;
                                    }
                                    else{System.out.println("Incorrect input. Please enter Yes or No.");}
                                }
                                break;
                            }
                            else if (intervention.equals("No")){
                                System.out.println(narrativeHost.printNarrative("interveneNo"));
                                break;
                            }
                            else{System.out.println("Incorrect input. Please enter Yes or No.");}
                        }
                        break;
                    }
                    else if(nightNoise.equals("2")){
                        System.out.println(narrativeHost.printNarrative("ignoreNoise"));
                        break;
                    }
                    else{System.out.println("Incorrect input. Please enter 1 or 2.");}
                }
                break;
            }
            else {
                System.out.println("Incorrect input. Please enter 1 or 2.");
            }
        }
        // end of large conditional statement tree

        // second day
        System.out.println(narrativeHost.printNarrative("morningCall"));
        System.out.println("Dearest " + name + ",");
        //message varies based on previous nights' events
        if (!encounter & !witness) System.out.println(narrativeHost.printNarrative("normalMessage"));
        else System.out.println(narrativeHost.printNarrative("skepticalMessage"));

        //your knowledge of the guests sitting at table also varies based on the previous night's events
        if (patrice & encounter)System.out.println(narrativeHost.printNarrative("patrice&OldMan"));
        else if (patrice & !encounter)System.out.println(narrativeHost.printNarrative("patriceOnly"));
        else System.out.println(narrativeHost.printNarrative("nobodyKnows"));

        System.out.println(narrativeHost.printNarrative("devlinReveal"));
        System.out.println(name + ", I'll start with you. Did you notice anything strange last night?");
        //beginning of another conditional choice tree that varies based on events of previous night
    }
}
