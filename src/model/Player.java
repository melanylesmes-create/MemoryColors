
package model;

public class Player {
    private String namePlayer;
    private Score score;

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
    
    public void showWinner(int finalScore){
        System.out.println("****congratulations " + namePlayer +" *****");
        System.out.println("your total score is " + finalScore);
    }
    public void showLoser(int attemptsLeft){
        System.out.println("**** GAME OVER " +namePlayer +" *****");
    }
}
