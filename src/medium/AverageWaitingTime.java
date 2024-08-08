package medium;

import java.util.HashMap;

public class AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        long nextWaitingTime = 0;
        long nextIdleTime = 0;
        for (int[] customer : customers) {
            //find next idle time
            // get which of the time is higher if the customer arrive time or the current idle time.
            // add the current customer idle time to calculate the total time of completion for the current customer
            nextIdleTime = Math.max(customer[0], nextIdleTime) + customer[1];
            //add into next waiting time from subtracting
            //total idle time to customer arrive time
            nextWaitingTime += nextIdleTime - customer[0];
        }
        return (double) nextWaitingTime / customers.length;

    }

    public static void main(String[] args) {
        AverageWaitingTime averageWaitingTime = new AverageWaitingTime();
        int[][] cus = new int[][]{{1, 2, 4}, {2, 5, 3}};
        System.out.println(averageWaitingTime.averageWaitingTime(cus));
    }
}
