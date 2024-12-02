package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex2 {
    @Test
    void 필터_테스트_짝수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream().filter(n ->  n % 2 == 0 ).toList();

                assertThat(evenNumbers).isEqualTo(List.of(2, 4, 6, 8, 10));
    }
}
