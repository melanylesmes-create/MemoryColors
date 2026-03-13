
package model;

public class Color {
    private String nameColor;

    public Color(String nameColor) {
        this.nameColor = nameColor;
    }
    
    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    } 
    @Override
public String toString() {
    return nameColor;
}
}
