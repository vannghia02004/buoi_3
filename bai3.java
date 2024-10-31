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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so: ");

        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            System.out.println("Ban da nhap so: " + input);
           
        } else {
            System.out.println("Ban da khong nhap so nguyen. ");
        }
    }
}
