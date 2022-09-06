package com.tutorial;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //memori
        Scanner inputTopo = new Scanner(System.in);
        char operator;
        String inputUser;
        double a,b,hasil;

        //input
        System.out.print("Masukkan nilai a = ");
        a = inputTopo.nextDouble();
        System.out.print("Pilih perhitungan = ");
        operator = inputTopo.next().charAt(0); //sc next untuk tipe data char
        System.out.print("Masukkan nilai b = ");
        b = inputTopo.nextDouble();
        System.out.println(" ");

        //rumus
        inputUser = a + " " + operator + " " + b;

        //output beserta if else
        System.out.println("Perhitungan dari = " + inputUser);

        if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasilnya "+hasil);
        } else if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasilnya "+hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasilnya "+hasil);
        } else if (operator == '/') {
            hasil = a / b;
            System.out.println("Hasilnya "+hasil);
        }else {
            System.out.println("!!!Error harap input operator yang benar!!!");
        }
    }
}
