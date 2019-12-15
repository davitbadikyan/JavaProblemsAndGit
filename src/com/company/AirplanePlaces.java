package com.company;

import java.util.Scanner;

public class AirplanePlaces {
    private static String[][] airplanePlaces;
    private static String[] letters = new String[]{"A", "B", "C", "D", "E", "F"};
    private static int letterIndex = 0;
    private static int placeNumber = 1;

    public static void main(String[] args) {
        // creating the places of airplane
        airplanePlaces = new String[10][6];
        for (int i = 0; i <= airplanePlaces.length - 1; i++) {
            for (int j = 0; j <= airplanePlaces[i].length - 1; j++) {
                airplanePlaces[i][j] = letters[letterIndex] + Integer.toString(placeNumber);
                System.out.print(airplanePlaces[i][j] + " ");
                letterIndex++;
            }
            placeNumber++;
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input occupied places: ");
        String occupiedPlaces = scanner.nextLine();

//        for (int i = 0; i <= airplanePlaces.length - 1; i++) {
//            for (int j = 0; j == 2 || j == 4; j++) {
//                if (occupiedPlaces != airplanePlaces[i][j] && (occupiedPlaces != airplanePlaces[i][j - 1] || occupiedPlaces != airplanePlaces[i][j + 1])) {
//                    System.out.println();
//                }
//
//            }
        }
    }



