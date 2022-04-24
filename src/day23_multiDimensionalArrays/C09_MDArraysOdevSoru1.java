package day23_multiDimensionalArrays;

public class C09_MDArraysOdevSoru1 {

    public static void main(String[] args) {

        // Asagidaki multi dimensional array in tum elemanlarinin carpimini
        // ekrana yazdiran bir method yaziniz. {{1,2,3},{4,5,6}}

        int arr[][] = {{1,2,3},{4,5,6}};

        arrElemanlariniCarp(arr);


    }

    private static void arrElemanlariniCarp(int[][] arr) {
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim *= arr[i][j];

            }

            }
        System.out.println("Tum elemanlarinin carpimi : " +carpim); // 720

        }



}
