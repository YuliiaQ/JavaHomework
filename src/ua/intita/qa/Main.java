package ua.intita.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        EvenOrOdd.evenOrOdd(arr, n);
        BiggestOrSmallestNumber.biggestOrSmallest(arr, n);
        DivideByThreeAndNine.divide(arr, n);
        ThreeDigitsWithNoRepetition.noRepet(arr,n);
        BubbleSort.fromMinToMax(arr, n);
        BubbleSort2.fromMaxtoMin(arr,n);
        FindPrimitive.primitive(arr, n);
        TheShortestAndLongest.longAndShort(arr, n);
    }
}

