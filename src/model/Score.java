
package model;

public class Score {
    private int attempCounter=3;
    private int acumulatorScore;

    public int getAttempCounter() {
        return attempCounter;
    }

    public void setAttempCounter(int attempCounter) {
        this.attempCounter = attempCounter;
    }

    public int getAcumulatorScore() {
        return acumulatorScore;
    }

    public void setAcumulatorScore(int acumulatorScore) {
        this.acumulatorScore = acumulatorScore;
    }
    
    public void decreaseAttemp(){
        attempCounter--;
    }
    
    public void addScore(){
        acumulatorScore= acumulatorScore + 10;
    }

}
