package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex8 {
    @Test
    void 맵_테스트_짝수_홀수() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> evenOddNumbers = numbers.stream()
                .map(n -> {
                    if (n % 2 == 0) {
                        return "짝수";
                    } else {
                        return "홀수";
                    }
                })
                // 여기에 코드 작성
                .toList();

        assertThat(evenOddNumbers).isEqualTo(List.of("홀수", "짝수", "홀수", "짝수", "홀수"));
    }
}
