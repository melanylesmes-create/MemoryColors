
package view;

import controller.PlayController;
import java.util.Scanner;
import model.Matrix;
import model.Player;
import model.Score;

public class MemoryColors {

    public static void main(String[] args) { 
      Scanner write = new Scanner(System.in);

      Matrix matrix = new Matrix();
      Score score =new Score();
      
      String namePlayer;
      System.out.println("---------Welcome to Memory Colors---------");
      System.out.println("Write your Nickname or name :D");
      namePlayer = write.next();
      Player player = new Player(namePlayer); 
      PlayController playController = new PlayController(player,matrix,score);
      matrix.colorAdd();
      matrix.randomColor();
      matrix.createMatrix();
      matrix.seeMatrix();
      
      playController.startGame(player,matrix,score);
    
}}
