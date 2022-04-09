package com.company;

public class avatar {

    public static void bending() {
        System.out.println("Waterbending");
    }
    public static void bending(int fire) {
        for (fire = 0; fire < 15; fire++) {
            System.out.println("Firebending");
        }
    }
    public static void bending(double earthbending) {
        for (int e = 1; e < 6; e++) {
            System.out.println("Earthbending");
        }
    }

    public static void main(String[] args) {
        bending(); //calls waterbending method
        bending(9); //calls firebending method
        bending(1.0); //calls earthbending method
    }
}
