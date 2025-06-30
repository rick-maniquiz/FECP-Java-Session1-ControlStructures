package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membershipStatus = scanner.nextLine();
        float membershipPrice = 0.0f;
        switch (membershipStatus.toLowerCase()){
            case "regular":{
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                if (age < 18){
                    membershipPrice = 50.0f;
                } else if (age >= 18 && age <= 64) {
                    membershipPrice = 100.0f;
                } else {
                    membershipPrice = 75.0f;
                }
                break;
            }
            case "vip":{
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                if (age < 18){
                    membershipPrice = 75.0f;
                } else if (age >= 18 && age <= 64) {
                    membershipPrice = 150.0f;
                } else {
                    membershipPrice = 112.5f;
                }
                break;
            }
            case "premium":{
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                if (age < 18){
                    membershipPrice = 100.0f;
                } else if (age >= 18 && age <= 64) {
                    membershipPrice = 200.0f;
                } else {
                    membershipPrice = 150.0f;
                }
                break;
            }
            default:
                System.out.print("Invalid membership status entered.");
                return;
        }
        System.out.print("Price: $" + String.format("%.2f", membershipPrice));
    }
}