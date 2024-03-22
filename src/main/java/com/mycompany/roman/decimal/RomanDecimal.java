/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roman.decimal;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class RomanDecimal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        StringBuilder roman = new StringBuilder();

        int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; decimal > 0; i++) {
            while (decimal >= decimals[i]) {
                roman.append(numerals[i]);
                decimal -= decimals[i];
            }
        }

        // Print Roman numera
        System.out.println("Roman numeral: " + roman);
        
    }
}
