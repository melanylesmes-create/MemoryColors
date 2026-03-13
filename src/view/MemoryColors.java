
package view;

import java.util.Scanner;
import model.Matrix;

public class MemoryColors {

    public static void main(String[] args) {
      Matrix matrix;
      matrix = new Matrix();
      Scanner write = new Scanner(System.in);
      //para inicializar un metodo toca llamarlo
      matrix.colorAdd();
      matrix.randomColor();
      matrix.createMatrix();
      matrix.seeMatrix();
      
        System.out.println("Escriba el numero de la carta");
        int position1 = write.nextInt();
        System.out.println("Escriba el numero de la carta");
        int position2 = write.nextInt();
        matrix.compareColor(position1, position2);
    }
    
}
