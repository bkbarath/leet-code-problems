package medium;

import java.util.*;

public class InsertDeleteGetRandom {
    private List<Integer> nums;
    private Map<Integer, Integer> valToIndex;
    private Random random;

    public InsertDeleteGetRandom() {
        nums = new ArrayList<>();
        valToIndex = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        // Add the new element at the end of the list
        valToIndex.put(val, nums.size());
        nums.add(val);
        return true;

    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        // Get the index of the element to remove
        int index = valToIndex.get(val);
        int lastElement = nums.get(nums.size() - 1);

        // Move the last element to the place of the element to delete
        nums.set(index, lastElement);
        valToIndex.put(lastElement, index);

        // Remove the last element
        nums.remove(nums.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }


}
