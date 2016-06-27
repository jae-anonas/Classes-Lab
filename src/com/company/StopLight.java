package com.company;

/**
 * Created by roosevelt on 6/27/16.
 *
 ##### StopLight Class

 - Create a StopLight class with the following global variable: lightColor
 - Create a constructor that sets the lightColor to a value of your choice.
 - Create the following methods that accept no input:
 `isRed`, `isYellow`, `isGreen`.
 - Implement the methods to return true when the lightColor matches the color of the method. i.e; isRed() should return true if lightColor is red.
 - Create a method `setLightColor`, that accepts a parameter to change the lightColor variable. Make sure to handle when the wrong input is given to the method.

 */

public class StopLight {
    String mLightColor;

    public StopLight (String lightColor){
        mLightColor = lightColor.toLowerCase();
    }

    public boolean isRed(){
        return mLightColor.equals("red");
    }

    public boolean isGreen(){
        return mLightColor.equals("green");
    }

    public boolean isYellow(){
        return mLightColor.equals("yellow");

    }

    public void setLightColor(String lightColor){
        String color = lightColor.toLowerCase();
        if (color.equals("red") || color.equals("yellow") || color.equals("green"))
            mLightColor = color;
        else
            System.out.println("Color not accepted.");
    }

}
