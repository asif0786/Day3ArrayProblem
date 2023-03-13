//3) Java Program to print the largest element in an array
import java.util.Arrays;
import java.util.Scanner;
public class LargestElementArray {
    public static void main(String[] args) {

        //Take n number of input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i<n; i++){
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Largest element is "+arr[n-1]);
        }

}
