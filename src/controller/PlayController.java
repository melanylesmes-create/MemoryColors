
package controller;

import java.util.Scanner;
import model.Matrix;
import model.Player;
import model.Score;

public class PlayController {
   private Player player;
   private Score score;
   private Matrix matrix;   
   Scanner write = new Scanner(System.in);
   
   public PlayController(Player player, Matrix matrix, Score score){
        this.player = player;
        this.matrix = matrix;
        this.score = score;
   }
   
    public void startGame(Player player, Matrix matrix, Score score){ 

        do{
            System.out.println("==============================");
            System.out.println("Write your (1r)first option number");
            int position1 = write.nextInt();
            System.out.println("Write your (2d)second option number");
            int position2 = write.nextInt();
            boolean match  =matrix.compareColor(position1, position2);
            correctOrIncorrectMatch(match,score);
        }while(matrix.getCorrectAcumulator()<5);
   }

   
   public void correctOrIncorrectMatch(boolean match, Score score){
       if(match==true){
           score.addScore();
           System.out.println("Your win " + score.getAcumulatorScore());
           if(score.getAcumulatorScore()==50){
               player.showWinner(score.getAcumulatorScore());
           }
       }
       if(match==false){
           score.decreaseAttemp();
           System.out.println("Your lost 1 attemp " + score.getAttempCounter());
            if(score.getAttempCounter()==0){
               player.showLoser(score.getAttempCounter());
           }
       }
   }
    
   public void finishGame(){}
   
}
