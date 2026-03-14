
package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Matrix {
    private Color color;
    private Color [][] board;
    private String [] colorName;
    private String [] randomColor;
    private int correctAcumulator = 0;

    public int getCorrectAcumulator() {
        return correctAcumulator;
    }

    public void setCorrectAcumulator(int correctAcumulator) {
        this.correctAcumulator = correctAcumulator;
    }
    
    public void colorAdd(){
        colorName =new String[] {"Blue","Blue","Red","Red",
                                "Orange","Orange","Yellow","Yellow"
                                ,"Green","Green"};
    }
    
    public void randomColor(){
         ArrayList<String> list = new ArrayList<>();
        //pasar el arreglo a la lista porque el Collection funciona solo con listas
        for(int i = 0; i < colorName.length; i++){
            list.add(colorName[i]);
        }
        //mezclar los colores, sin repetir los mismos colores 3 veces
        Collections.shuffle(list);
        randomColor = new String[list.size()];
        //pasar la lista al arreglo
        for(int i = 0; i < list.size(); i++){
        randomColor[i] = list.get(i);
        }
    }
    
    public void createMatrix(){
        board = new Color [2][5];
        int index=0;        
        for(int row = 0; row < board.length; row++){
            for(int colum=0; colum < board[row].length; colum++){
                //Como randomColor no es de tipo Color se coloca el  index
                board[row][colum]=new Color(randomColor[index]);
                System.out.print(board[row][colum] + " ");
                index++; 
            }
            System.out.println(" ");
        }
    }
    
    public void seeMatrix(){
         int number=0;
         for(int row = 0; row < board.length; row++){
            for(int colum = 0; colum < board[row].length; colum++){
                //Numero que se visualizara en consola
                System.out.print(number + " ");
                number ++;
            }
            System.out.println(" ");
        }
     }
     
    public void modificMatrix(){
         for(int row = 0; row < board.length; row++){
            for(int colum = 0; colum < board[row].length; colum++){
                //Para hallar el valor numerico de consola
                int position = row * 5 + colum;
               
                if(board[row][colum]==null){
                    System.out.print("x ");
                }else
                    System.out.print(position + " ");
            }
            System.out.println(" ");
        }
    }
     
    public boolean compareColor(int position1, int position2){
        /* Row se divide por 5 para hallar la fila 0 o la fila 1*/
        // Column se le saca el mod de 5 para hallar la columna con el residuo
        int row1 = position1 / 5;
        int column1 = position1 % 5;        
        int row2 = position2 / 5;
        int column2 = position2 % 5;        
        /*Los valores es colocan en el board o tablero*/
        Color color1 = board [row1][column1];
        Color color2 = board [row2][column2];
        
        if(color1.toString().equals(color2.toString())){
            board[row1][column1]=null;
            board[row2][column2]=null;
            System.out.println("Pareja encontrada!");
            correctAcumulatorColor();
            modificMatrix();
            return true;
        }else
            System.out.println("No son iguales");
            return false;
    }
     
    public void correctAcumulatorColor(){
        correctAcumulator++;
    }
   
}
