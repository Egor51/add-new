package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        int slot;

        System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти%n", player.getSlotsCount());

        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == -1) {
                System.out.println("Game over");
                break;
            }
            player.shotWithWeapon(slot);

        }
    }
}



