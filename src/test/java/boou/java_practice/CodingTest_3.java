package boou.java_practice;

import java.util.*;
import java.util.stream.Collectors;

public class CodingTest_3 {

    public String biggest(int[] numbers) {
        List<String> list = Arrays.stream(numbers)
                .boxed()
                .map(n -> String.valueOf(n))
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.toList());
        if (list.get(0).equals("0")) {
            return "0";
        }
        return String.join("", list);
    }
}

