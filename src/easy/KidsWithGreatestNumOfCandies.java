package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumOfCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandiesSol2(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;
        List<Boolean> booleanList = new ArrayList<>();
        boolean lessCandy = false;
        int i = 0;

        while (i < n) {
            int value = candies[i] + extraCandies;

            for (int j = 0; j < n; j++) {
                if (value < candies[j]) {
                    booleanList.add(false);
                    lessCandy = true;
                    break;
                }
            }
            if (!lessCandy)
                booleanList.add(true);
            i++;
            lessCandy = false;
        }

        return booleanList;
    }

    public static List<Boolean> kidsWithCandiesSol2(int[] candies, int extraCandies) {

        int n = candies.length;
        List<Boolean> booleanList = new ArrayList<>();
        int maxCandies = 0;

        for (int i = 0; i < n; i++) {
            if (maxCandies < candies[i]) {
                maxCandies = candies[i];
            }
        }

        for (int candy : candies) {
            booleanList.add(maxCandies <= candy + extraCandies);
        }

        return booleanList;
    }
}
