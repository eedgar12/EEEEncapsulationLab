/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Toshiba laptop
 */
public class Game {
    GUI gui = new GUI();
    GameBoard gameBoard = new GameBoard();
    GameCharacter player1 = new GameCharacter();
    GameCharacter player2 = new GameCharacter();
    GameDie die = new GameDie();
    
    private boolean gameWon = false;
    private int roll;
    public void startGame(){
        
        
        getPlayer1Name();
        getPlayer2Name();
        
        //While someone has not won yet,
            gui.displayCurrentSpace(player1.getCurrentSpace());
            roll = die.roll();
            gui.displayMove(player1.getCurrentSpace(), roll);
            player1.move(roll);
            gui.displayInstruction(gameBoard.getGuiInstruction(player1.getCurrentSpace()));
            player1.move(gameBoard.getMoveDirection(player1.getCurrentSpace()));
            gui.displayCurrentSpace(player1.getCurrentSpace());
            
            //Move
        
    }
    
//    private int getNumOfPlayers(){
//        numOfPlayers = gui.inputNumOfPlayers();
//        return numOfPlayers;
//    }
    
    private void getPlayer1Name(){
        player1.setName(gui.inputPlayerName());
        
    }
    private void getPlayer2Name(){
        player1.setName(gui.inputPlayerName());
        
    }
    
    private boolean isGameWon(){
        //if (player1.position == 19 || player2.position == 19){
        //return true;
        //else return false;
        return false;
    }
    
}
