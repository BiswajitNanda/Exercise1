package Mainclasses;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AllLights {
    private ArrayList<Light> lights;
    private String[] listOfColours;


    public void Holdon(int milliseconds) throws java.lang.InterruptedException
    {
        Thread.sleep(milliseconds);
    }

    public AllLights() throws java.lang.InterruptedException{
        lights = new ArrayList<Light>();
        listOfColours = new String[]{"Red", "Green", "White","Red", "Green", "White","Red", "Green", "White","Red", "Green", "White","Red", "Green", "White","Red", "Green", "White","Red", "Green"};


        for (int i = 0; i < listOfColours.length; i++) {

            Light o = new Light();
            o.setColour(listOfColours[i]);
            o.setNumber(i+1);
            lights.add(o);

        }

        for (int i = 0; i < lights.size(); i++) {

            System.out.println("Light "+" "+lights.get(i).getNumber()+" "+lights.get(i).getColour()+" "+lights.get(i).getSwitchedon());
            Holdon(5000);
            lights.get(i).switchLight();
            System.out.println("Light "+" "+lights.get(i).getNumber()+" "+lights.get(i).getColour()+" "+lights.get(i).getSwitchedon());

        }

        // Sequence algorithm

        for (int i = 0; i < lights.size(); i++) {

            if (lights.get(i).getColour().equalsIgnoreCase("Red")) {
                lights.get(i).turnOnLight();
                System.out.println("Light " + " " + lights.get(i).getNumber() + " " + lights.get(i).getColour() + " " + lights.get(i).getSwitchedon());
            }
        }
            Holdon(1000);

        for (int i = 0; i < lights.size(); i++) {

            if (lights.get(i).getColour().equalsIgnoreCase("Green")) {
                lights.get(i).turnOnLight();
                System.out.println("Light " + " " + lights.get(i).getNumber() + " " + lights.get(i).getColour() + " " + lights.get(i).getSwitchedon());
            }
        }
            Holdon(1000);

        for (int i = 0; i < lights.size(); i++) {

            if(lights.get(i).getColour().equalsIgnoreCase("White"))
            {
                lights.get(i).turnOnLight();
                System.out.println("Light "+" "+lights.get(i).getNumber()+" "+lights.get(i).getColour()+" "+lights.get(i).getSwitchedon());
            }


        }





    }

}
