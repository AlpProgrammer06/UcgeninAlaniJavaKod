
package com.aslan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        int kenar1,kenar2,kenar3;
        double u;
        double alan = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("��genin 1. Kenar�n�  giriniz : ");
       kenar1 = scanner.nextInt();
        System.out.println("��genin 2. Kenar�n�  giriniz : ");
        kenar2= scanner.nextInt();
        System.out.println("��genin 3. Kenar�n�  giriniz : ");
        kenar3= scanner.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("��genin alan� = " + alan);

    }
}
