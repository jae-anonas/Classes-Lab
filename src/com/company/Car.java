package com.company;

/**
 * Created by roosevelt on 6/27/16.
 *
 ##### Car Class
 - Create a Car class with the following global variables: color, brand, topSpeed
 - Create a constructor that assigns values to the color, brand, and topSpeed variables.
 - Implement `go`, `slow`, and `stop` methods that print something out. (You can print whatever is appropriate for the methods)
 - Create individual getter methods that print out the color, brand, and topSpeed of the car.
 - Create individual setter methods that set the color, brand, and topSpeed of the car.

 */
public class Car {
    String mColor;
    String mBrand;
    double mTopSpeed;
    boolean mIsReckless;

    public Car(String color, String brand, double topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
        mIsReckless = false;
    }

    public void go(){
        System.out.println(mColor + " " + mBrand + " is moving....");
    }
    public void stop(){
        System.out.println(mColor + " " + mBrand + " is stopping....");
    }
    public void slow(){
        System.out.println(mColor + " " + mBrand + " is slowing down....");
    }

    public String getColor(){
        System.out.println("My color is " + mColor);
        return mColor;
    }

    public String getBrand(){
        System.out.println("My brand is " + mBrand);
        return mBrand;
    }

    public double getTopSpeed(){
        System.out.println("My top speed is " + mTopSpeed);
        return mTopSpeed;
    }

    public boolean isReckless(){
        return mIsReckless;
    }

    public void setColor(String color){
        mColor = color;
    }

    public void setBrand(String brand){
        mBrand = brand;
    }

    public void setTopSpeed(double topSpeed){
        mTopSpeed = topSpeed;
    }

    public void setIsReckless(boolean reckless){
        mIsReckless = reckless;
    }

}
