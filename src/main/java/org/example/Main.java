package org.example;
import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock>0 && clock<8 ||clock>20 && clock<24) {
                    if (isBarking) {
                        return true;
                    } else {
                        return false;
                    }

             }else if(clock<0 || clock>23){
                return false;
        }else{
            return false;
        }

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge<20&& firstAge>12||
                secondAge<20&&secondAge>12||
                thirdAge<20 &&thirdAge>12){
            return true;
        }else{
            return false;

        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer == true) {
            if (temp < 46 && temp > 24) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp < 36 && temp >24) {
                return true;
            } else {
                return false;
            }


        }

    }

    public static double area(double width, double height) {
        if(width<0||height<0){
            return -1;
        }else{
            return width*height;
        }

    }

    public static double area(double radius) {
if (radius<0){
    return -1;
}else{
    System.out.print(PI);
    return radius*radius*Math.PI;

}
    }
}

