package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 4
        // Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
        //положительных или отрицательных.

        int [][] array = { {-1, 3, 5, -9, 4},
                             {5, 1, -6, 4, 7} };

        int positive_numbers = 0;
        int negative_numbers = 0;

        for (int a[] : array) {
            for (int b : a) {
                if (b >= 0) {
                    positive_numbers++;
                } else {
                    negative_numbers++;
                }
            }
        }
                    System.out.println("Positive numbers are " + positive_numbers + "Negative numbers: " + negative_numbers);

                    if (positive_numbers > negative_numbers) {
                        System.out.println("More positive numbers");
                    } else if (positive_numbers < negative_numbers) {
                        System.out.println("More negative numbers");
                    } else {
                        System.out.println("Positive numbers = negative numbers");
                    }
                }
            }

