
package com.aslan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        int kenar1,kenar2,kenar3;
        double u;
        double alan = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin 1. Kenarýný  giriniz : ");
       kenar1 = scanner.nextInt();
        System.out.println("Üçgenin 2. Kenarýný  giriniz : ");
        kenar2= scanner.nextInt();
        System.out.println("Üçgenin 3. Kenarýný  giriniz : ");
        kenar3= scanner.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alaný = " + alan);

    }
}
