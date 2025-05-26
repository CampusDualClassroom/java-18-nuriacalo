package com.campusdual.classroom;

import com.campusdual.util.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise18 {

    public static int[] createAndInitializeArray(int num) {
        int[] numberArray = new int[num];
        for (int i = 0; i < num; i++) {
            numberArray[i] = Utils.integer("Enter a number: ");
        }
        return numberArray;
    }

    public static void showInlineArray(int[] lineaArray) {
        for (int i = 0; i < lineaArray.length; i++) {
            System.out.println(lineaArray[i]);
        }
    }

    public static void main(String[] args) {
        int[] newArray = new int[]{1, 2, 4, 6, 8, 3};
        createAndInitializeArray(8);
        showInlineArray(newArray);
    }
}
