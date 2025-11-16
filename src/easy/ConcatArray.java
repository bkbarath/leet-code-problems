package easy;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;


// function to concat two arrays in this problem we have 3 solutions
public class ConcatArray {

    // 0ms - most optimized
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; // length of array
        int[] arr = new int[2 * n]; // create new array with concat length

        System.arraycopy(nums, 0, arr, 0, n); // copy for the first time in the arr
        System.arraycopy(nums, 0, arr, n, n); // copy the nums for the second time from end of first array

        return arr; // return concat array
    }

    // 2ms - solution 2
    public int[] getConcatenationSol2(int[] nums) {
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray(); // using int stream concat the arrays
    }

    // 1ms - solution 3
    public int[] getConcatenationSol3(int[] nums) {
        int n = nums.length; // length of array
        int[] arr = new int[2 * n]; // create new array with concat length

        // run the loop through the lenght of nums
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i]; // store the array in the first half
            arr[i + n] = nums[i]; // store the from second half
        }

        return arr; // return the concat array
    }
}
