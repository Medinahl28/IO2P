package com.company;

public class Guns {
    public String weaponType;

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public static void howItWorks() {
        System.out.println("It works when a bullet strikes through someone's body");
    }

    public static void main(String[] args) {
        System.out.println("One of the deadliest weapons in the world");
        Guns weaponType = new Guns();
        weaponType.setWeaponType("Short-ranged weapon");
        Guns.howItWorks();
        System.out.println("It's a " + weaponType.getWeaponType());
        System.out.println("But I'm only presents military gun as an example");
        militaryGun longgun = new militaryGun();
        System.out.println(longgun.getGunModel1());
        System.out.println("Long gun has a longer distance between front and rear sights");
        militaryGun rifle = new militaryGun();
        System.out.println(rifle.getGunModel2());
        System.out.println("Rifles are typically designed to be held with both hands and braced firmly against the shooter's shoulder via a buttstock for stability during shooting");
        militaryGun shotgun = new militaryGun();
        System.out.println(rifle.getGunModel3());
        System.out.println(shotgun.getGunModel3());
        System.out.println("Shotgun is a long-barreled firearm designed to shoot a straight-walled cartridge known as a shotshell,");
    }
}
