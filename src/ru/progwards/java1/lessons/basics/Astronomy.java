package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static double sphereSquare(Double r) {
        double area;
        area = 4 * Math.PI * (Math.pow(r, 2));
        return area;
    }

    public static Double earthSquare() {
        return sphereSquare(6371.2);
    }

    public static Double mercurySquare() {
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare() {
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury() {
        return earthSquare()/mercurySquare();
    }

    public static Double earthVsJupiter() {
        return earthSquare()/jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

}

