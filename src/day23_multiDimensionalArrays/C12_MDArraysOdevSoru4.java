package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C12_MDArraysOdevSoru4 {

    public static void main(String[] args) {

        // Asagidaki multi dimensional array in ic array lerindeki tum elemanlarinin toplamini
        // birer birer bulan ve herbir sonucu yeni bir array in elemani yapan ve yeni array i
        // ekrana yazdiran bir proram yaziniz   {{1,2,3},{4,5},{6,7}}


        int arr[][] = {{1,2,3},{4,5},{6,7}};

        elemanToplaArrayYazdir(arr);


    }

    private static void elemanToplaArrayYazdir(int[][] arr) {

        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {

                arr2[i] += arr[i][j];

            }

        }
        System.out.println(Arrays.toString(arr2)); // [6,9,13]
    }
}
