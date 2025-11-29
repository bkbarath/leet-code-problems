package medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    // 3ms - 1ms solution
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                while (left < right && height[left] <= minHeight)
                    left++;
            } else {
                while (left < right && height[right] <= minHeight)
                    right--;
            }
        }

        return maxArea;
    }

    // 5ms solution
    public static int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
