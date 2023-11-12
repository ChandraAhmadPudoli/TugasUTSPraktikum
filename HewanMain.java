package UTS;

import java.util.Scanner;

public class HewanMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = input.nextLine();

        Hewan hewan;
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak dikenal.");
            return;
        }

        hewan.bersuara();

        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah hewan mamalia.");
        } else {
            System.out.println("Hewan ini bukan hewan mamalia.");
        }
    }
}