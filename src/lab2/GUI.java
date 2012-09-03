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
    
    
    public String inputPlayersName(){
        System.out.println("Please enter your name");
        //needs validation
        return keyboard.nextLine();
    }
    
    
    public int inputNumOfPlayers(){
        System.out.println("Please enter the number of players");
        //needs validation
        return keyboard.nextInt();
    }
    
    public String displayMove(int space){
        GameBoard board = new GameBoard();
        return board.getSpaceDirection(space);
    }
    
    public void move(int roll){
        System.out.println("Move ahead " + roll + " spaces");
    }
}
