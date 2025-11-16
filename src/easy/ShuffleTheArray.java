package easy;

//  shuffle the array
public class ShuffleTheArray {

    // function to shuffle the array
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length]; // create new array to store shuffled value
        int index = 0; // index of shuffled value

        for (int i = 0; i < n; i++) { // run the loop until the `n`
            shuffle[index++] = nums[i]; // store i'th value initially which is Xi
            shuffle[index++] = nums[i + n]; // store i+n'th value in following which is Yi
        }

        return shuffle; // return the shuffled store array which is look like Xi, Yi, Xi+1, Yi+1
    }
}
