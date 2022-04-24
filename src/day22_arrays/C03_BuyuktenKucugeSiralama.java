package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
  // public static void main(String[] args) {
  //     // verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun

  //     int arr[]={3,5,6,1,9,45,25,4,9,0};
  //     terstenSiralaYazdir(arr); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

  // }

  // public static void terstenSiralaYazdir(int[] arr) {

  //     Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
  //     int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  //     for (int i = 0; i <arr.length ; i++) {
  //         tersArr[i]= arr[arr.length-1-i] ;
  //     }
  //     System.out.println(Arrays.toString(tersArr));
  // }

    public static void main(String[] args) {

        // verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun

            int arr[]={3,5,6,1,9,45,25,4,9,0};

            Arrays.sort(arr);
            terstenSiralaYazdir(arr);


    }

    private static void terstenSiralaYazdir(int[] arr) {

        int tersArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
