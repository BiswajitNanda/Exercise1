package Mainclasses;

public class Light {

    private boolean Switchedon=true; // Maintains the flag
    private String colour; // Keeps colour info
    private int number=1;  // Number of lights

    // Constructor with the light attribute


    public String getColour() {
        return colour;
    }


    public void setColour(String s) {
        colour = s.toLowerCase();
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number=number;
    }

    public boolean getSwitchedon() {
        return Switchedon;
    }


    private void setSwitchedon(boolean b) {
        Switchedon = b;
    }


    public void turnOffLight() {
        Switchedon=false;
    }


    public void turnOnLight() {
        Switchedon=true;
    }


    public void switchLight() {
        Switchedon=!Switchedon;
    }
}
