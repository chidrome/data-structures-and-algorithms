/*
Paolo Chidrome
Program to reverse an array.
ArrayReverse.java
 */
import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    int[] resultArr = new int[inputArray.length];
    for (int i = 0; i < inputArray.length; i++) resultArr[i] = inputArray[inputArray.length -i -1];
    return resultArr;
  }
    
}