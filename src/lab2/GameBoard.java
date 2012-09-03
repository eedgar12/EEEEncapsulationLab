/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public class GameBoard {
    private String spaceDirection[] = {"1 - Go!","2 - Go forward 2 spaces", 
            "3 - Go back 1 space", "4 - Stay put", "5 - Go to space number 9", 
            "6 - Go back 2 spaces", "7 - Go back to Go!", "8 - Go forward 5 spaces",
            "9 - Go forward 1 space", "10 - Dont move!", "11 - Go to space number 15",
            "12 - Go back 3 spaces", "13 - Go to space number 4", 
            "14 - Go forward 4 spaces", "15 - Go back 2 spaces", "16 - Stay put",
            "15 - Go back 5 spaces", "16 - Go back 3 spaces",
            "17 - Go forward 2 spaces", "18 - Go to space number 10", 
            "19 - Go back 1 space", "20 - You Win!!!"};
            
    private int moveDirection[] = {0, 2, -1, 0, 4, -2, -6, 5, 1, 0, 4, -3, -9, 4, 
            -2, 0, -5, -3, 2, -8, -1, 0};
    
    public String getSpaceDirection(int space){
        return spaceDirection[space];
    }
    
    public int getMoveDirection(int space){
        return moveDirection[space];
    }
}
