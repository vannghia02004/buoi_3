/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu: ");

        if (scanner.hasNextInt()) {
            System.out.println("Ban nhap ky tu khong phai la chuoi.");
        } else {
            String input = scanner.nextLine();
            System.out.println("Ban da nhap chuoi: " + input);
        }
    }
}
