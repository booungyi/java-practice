package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
public class StringFunctionTest {

    @Test
    void name() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("김씨");

        numbers.get(0);

        numbers.set(0, "박씨");

        numbers.remove(0);
        System.out.println(numbers.get(0));
    }
}
