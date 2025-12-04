package easy;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 1) continue;

            if (n == 0) break;

            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == length - 1 || flowerbed[i + 1] == 0;

            if (left && right) {
                n--;
                flowerbed[i] = 1;
            }
        }

        return n == 0;
    }
}
