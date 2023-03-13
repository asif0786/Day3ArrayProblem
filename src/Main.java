//1) Java Program to print the elements of an array
public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[] {2,4,5,6,7};
        System.out.println("Elements of given array: ");
        //Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }  ;
    }
}