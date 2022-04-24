package day23_multiDimensionalArrays;

public class C10_MDArraysOdevSoru2 {

    public static void main(String[] args) {

        // Asagidaki multi dimensional array in ic array lerindeki
        // son elemanlarinin carpimini ekrana yazdiran bir program yaziniz{{1,2,3},{4,5},{6}}

        int arr[][] = {{1,2,3},{4,5},{6}};

        arrSonElemanCarp(arr);
    }

    private static void arrSonElemanCarp(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            carpim *= arr[i][arr[i].length-1];

        }
        System.out.println("Son elemanlarin carpimi : " + carpim); // 90
    }
}
