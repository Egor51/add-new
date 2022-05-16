package com.company;

import com.company.weapon.*;

public class Player {
    public static Weapon[] weaponSlots;


    public Player() {

        weaponSlots = new Weapon[]{

                new BigGun(),
                new WaterPistol(),
                new Avtomat(),
                new RPG(),
                new Slingshot(),
                new Pistol(),

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 1 | slot >= 7) {
            System.out.println("Error");
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            weapon.shot();
            System.out.println(weapon.shot());

        }
    }
}