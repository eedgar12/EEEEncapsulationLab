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
    private GameCharacter playerWon;
    
    
    
    public void startGame(){
        
        
        getPlayer1Name();
        getPlayer2Name();
        
        while (!isGameWon()){
            System.out.println("\n" + player1.getName() + "'s turn");
            gui.displayCurrentSpace(player1.getCurrentSpace());
            gui.roll();
            roll = die.roll();
            gui.displayMove(player1.getCurrentSpace(), roll);
            player1.move(roll);
            gui.displayInstruction(gameBoard.getGuiInstruction(player1.getCurrentSpace()));
            player1.move(gameBoard.getMoveDirection(player1.getCurrentSpace()));
            gui.displayCurrentSpace(player1.getCurrentSpace());
            
            System.out.println("\n" + player2.getName() + "'s turn");
            gui.displayCurrentSpace(player2.getCurrentSpace());
            gui.roll();
            roll = die.roll();
            gui.displayMove(player2.getCurrentSpace(), roll);
            player2.move(roll);
            gui.displayInstruction(gameBoard.getGuiInstruction(player2.getCurrentSpace()));
            player2.move(gameBoard.getMoveDirection(player2.getCurrentSpace()));
            gui.displayCurrentSpace(player2.getCurrentSpace());
        }
            
        System.out.println("Congratulations " + playerWon.getName() +
                " You just won!");
        
    }
    
    
    
//    private int getNumOfPlayers(){
//        numOfPlayers = gui.inputNumOfPlayers();
//        return numOfPlayers;
//    }
    
    public void getPlayer1Name(){
        player1.setName(gui.inputPlayerName());
        
    }
    
    public void getPlayer2Name(){
        player2.setName(gui.inputPlayerName());
        
    }
    
    public boolean isGameWon(){
        if (player1.getCurrentSpace() == 19){
            setPlayerWon(player1);
            return true;
        }
        else if (player2.getCurrentSpace() == 19){
            setPlayerWon(player2);
            return true;
        }
        else {
           return false; 
        }
        
    }

    public GameCharacter getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(GameCharacter playerWon) {
        this.playerWon = playerWon;
    }
    
    
    
}
