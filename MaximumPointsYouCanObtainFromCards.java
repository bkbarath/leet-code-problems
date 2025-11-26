package medium;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
//        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int[] cardPoints = {96, 90, 41, 82, 39, 74, 64, 50, 30};
        int k = 8;
        System.out.println(maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int rightSum = 0, leftSum = 0, n = cardPoints.length, max = 0;

        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        max = leftSum;

        int rightIndex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;

            max = Math.max(max, leftSum + rightSum);
        }

        return max;
    }
}
