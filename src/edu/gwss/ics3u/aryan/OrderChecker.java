/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3u.aryan;

import java.util.Scanner;

/**
 *
 * @author 1GHAHREMANZA
 */
public class OrderChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of bolts: ");
        int numOfBolts = input.nextInt();
        System.out.print("Number of nuts");
        int numOfNuts = input.nextInt();
        System.out.print("Number of washers ");
        int numOfWashers = input.nextInt();
        if ((numOfNuts == numOfBolts) && (numOfWashers * 2) >= numOfBolts) {
            System.out.print("Order is OK");
        } else if (numOfNuts != numOfBolts) {
            if (numOfNuts > numOfBolts) {
                System.out.print("Check the Order: too few bolts");
            } else {
                System.out.print("Check the Order: too few nuts");
            }
          else if ((numOfWashers * 2) >= numOfBolts) {

        }
          }
        }
    }
}
