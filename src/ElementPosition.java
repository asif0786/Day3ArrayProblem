//4) Java Program to print the smallest element in an array
//9) Java Program to sort the elements of an array in ascending order
//10) Find 2nd Largest Number in an Array
import java.util.Arrays;
import java.util.Scanner;

    public class ElementPosition {
        public static void main(String[] args) {
            System.out.print("Enter Length of Array: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                System.out.print("Enter Value: ");
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Smallest element is "+arr[0]);
            // Printing the array after sorting in ascending order
            System.out.println("Modified arr[] : "+ Arrays.toString(arr));
            System.out.println();

            System.out.println("Second Greatest element is "+arr[n-2]);
        }
    }

