package easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {

        return IntStream.range(1, n + 1).mapToObj(i -> {
                    if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
                    else if (i % 3 == 0) return "Fizz";
                    else if (i % 5 == 0) return "Buzz";
                    else return Integer.toString(i);
                }
        ).collect(Collectors.toList());
    }
}
