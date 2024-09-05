import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectionSort selectionSort = new selectionSort();
        bubbleSort bubbleSort = new bubbleSort();
        insertionSort insertionSort = new insertionSort();
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        //i/p 13 46 24 52 20 9
        //selectionSort.selectionSort(arr);
        //bubbleSort.bubbleSort(arr);
        insertionSort.insertionSort(arr);
    }
}