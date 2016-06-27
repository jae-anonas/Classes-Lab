package com.company;

/*

##### Main Java Class
- Instantiate a `StopLight` object in the Main.java class using the constructor you created in the `StopLight` class.
- Instantiate a `Car` object in the *Main.java* class using the constructor you created in the `Car` class.
- In the Main.java class, create a loop(while, do while, for loop; your choice) that runs 30 times.
- Inside the loop; change the lightColor of the `StopLight` object in the correct sequence and have the `Car` object react accordingly to the `StopLight` lightColor using the `Car` object's methods for each iteration. (Each time you loop back, change the lightColor)

**Bonus:**
- Have 20 cars react to the stop light.
- Randomly have a car run the red light.

 */

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        StopLight stpLight = new StopLight("red");
        //Car myCar = new Car("green blue", "Buick LeSabre", 150.0);

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            carList.add(new Car(getRandomCarColor(), getRandomCarBrand(), 125.0));

        int getRandomCar = (new SecureRandom()).nextInt() % 19;
        carList.get(getRandomCar).setIsReckless(true);

        System.out.println("Reckless car is the " + carList.get(getRandomCar).getColor() + " " + carList.get(getRandomCar).getBrand());


        for (int i = 0; i < 10; i++) {
            String lightColor = getRandomLightColor();
            System.out.println("\n**********Setting stoplight color to: " + lightColor + " ****************\n");
            stpLight.setLightColor(lightColor);
            for (Car myCar:carList) {
                if (stpLight.isGreen())
                    myCar.go();
                else if (stpLight.isYellow())
                    myCar.slow();
                else if (stpLight.isRed()){
                    if(myCar.isReckless())
                        myCar.go();
                    else
                        myCar.stop();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static String getRandomLightColor(){
        Random randomNum = new SecureRandom();
        int num = randomNum.nextInt() % 3;

        switch (num){
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "yellow";
            default:
                return "yellow";
        }
    }

    public static String getRandomCarColor(){
        Random randomNum = new SecureRandom();
        int num = randomNum.nextInt() % 10;

        switch (num){
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "yellow";
            case 3:
                return "blue";
            case 4:
                return "orange";
            case 5:
                return "purple";
            case 6:
                return "violet";
            case 7:
                return "black";
            case 8:
                return "white";
            default:
                return "gray";
        }
    }

    public static String getRandomCarBrand(){
        Random randomNum = new SecureRandom();
        int num = randomNum.nextInt() % 10;

        switch (num){
            case 0:
                return "Toyota";
            case 1:
                return "Honda";
            case 2:
                return "Mitsubishi";
            case 3:
                return "Ford";
            case 4:
                return "Dodge";
            case 5:
                return "Mazda";
            case 6:
                return "Audi";
            case 7:
                return "Ferrari";
            case 8:
                return "Porsche";
            default:
                return "Volkswagen";
        }
    }
}
