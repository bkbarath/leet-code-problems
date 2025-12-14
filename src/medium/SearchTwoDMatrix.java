package medium;

public class SearchTwoDMatrix {

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3)); // true
    }

    // Time complexity: O(log(m*n)) where m is the number of rows and n is the number of columns
    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
