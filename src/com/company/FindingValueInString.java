package com.company;

import javax.lang.model.util.Types;
import java.util.Scanner;

public class FindingValueInString {
    private static String occupiedSpaces= "A1 H6 C3 D1 E4";
    private static String place;

    public static void FindPlace(String enteredPlace) {
        place = enteredPlace;
        if (occupiedSpaces.contains(place)) {
            System.out.println("This place is already occupied");
        } else {
            System.out.println("You can take it its free");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your place: ");
        String place = scanner.nextLine();
        FindPlace(place);
    }
}

