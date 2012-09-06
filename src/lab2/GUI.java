/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Toshiba laptop
 */
public class GUI {
    Scanner keyboard = new Scanner(System.in);
    
    
    public String inputPlayerName(int playerNum){
        System.out.println("Player " + (playerNum + 1) + ": Please enter your name");
        //needs validation
     //  String response = keyboard.nextLine();
//        if (!(response == null)){
//          return response;  
//        }
//        
//        else{
//            System.out.println("Null error in inputPlayerName");
//            return "Error";
//        }
        return keyboard.nextLine();
    }
    
    
    public int inputNumOfPlayers(){
        System.out.println("Please enter the number of players");
        //needs validation
        return keyboard.nextInt();
    }
    
//    public void displayMove(int currentSpace, int spacesToMove){
//        int responce = currentSpace + spacesToMove;
//        System.out.println("Your character moved " + responce + " space{s)");
//        
//    }
    
    public void displayInstruction(String spaceInstruction){
        System.out.println(spaceInstruction);
    }
    
    public void move(int roll){
        System.out.println("Move ahead " + roll + " spaces");
    }
    
    public void displayCurrentSpace(int space){
        System.out.println("You are on space " + (space + 1));
    }
    
    public void roll(){
        System.out.println("Rolling...");
    }
    
    
}
