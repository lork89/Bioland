/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioland;

import java.util.Scanner;

/**
 *
 * @author lork8
 */
public class Bioland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        getTitle();
        mainMenu();
        playerStats();
        pharmacyStore();

    }

    public static void getTitle() {
        for (int i = 0; i < 23; i++) {

            System.out.print("*");

        }
        System.out.println("");
        System.out.println("\tBIOLAND");

        for (int i = 0; i < 23; i++) {

            System.out.print("*");

        }
        System.out.println("\n\n Press ENTER to start");

    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        String playerName;

        System.out.print("You wake up in a dark room, injured and half dead. \n"
                + "You've lost some what of your memories and can't remember much. \n\n"
                + "Enter player name: ");
        playerName = input.nextLine();

        System.out.print("\nThankfully, you still remember your name.\n"
                + "You picked yourself off the ground.\n"
                + "You noticed blood running down your head.\n"
                + "You'll need to patch up your injuries or you'll really die.\n\n");

    }

    public static void playerStats() {
        int playerHP = 50, playerAtk = 1, playerDef = 0;

        System.out.println("Player Status"
                + "\nHealth Point: " + playerHP
                + "\nAttack Points: " + playerAtk
                + "\nDefense Points: " + playerDef);
    }
    public static void pharmacyStore(){
        Scanner input = new Scanner(System.in);
        int selectChoice;
        System.out.println("\nYou arrived at the pharmacy store. \n" 
            + "What do you want to do? \n"
        +   "1: Find first aid kit\n"
        +   "2: Wonder around the store\n"
        +   "3: Leave\n");
        selectChoice = input.nextInt();
        
        switch(selectChoice){
            case 1:
                System.out.println("You hear noises in the bathroom.\n"
                        + "You go and check out the noises.\nYou found Tim the stranger"
                        + "and befriended him.\nTim helps you bandage your head injury.\n");
                System.out.println("HP + 25\n" 
                    + "Attack +1\n");
                break;
            case 2:
                System.out.println("You wonder off not knowing what you're doing.\n"
                        + "You continue to bleed and can't find anything useful for"
                        + "your injuries.\n");
                System.out.println("HP -15");
                break;
            case 3: pharmacyStore();
        }
        
        
        
    }
}
