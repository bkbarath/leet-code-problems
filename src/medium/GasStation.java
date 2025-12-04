package medium;

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int start = 0;
        int tank = 0;
        int n = gas.length;

        for (int i = 0; i < n; i++) {

            int gain = gas[i] - cost[i];

            total = total + gain;
            tank = tank + gain;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total < 0) return -1;

        return start;
    }
}
