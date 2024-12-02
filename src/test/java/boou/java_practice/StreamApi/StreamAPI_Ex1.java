package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamAPI_Ex1 {
    @Test
    void 필터_테스트_40보다_작은_수() {
        List<Integer> scores = List.of(100, 60, 35, 70, 38, 80);

        List<Integer> scoresBelow40 = scores.stream()
                .filter(n->n<40)
                .toList();

        System.out.println(scoresBelow40);
        assertThat(scoresBelow40).isEqualTo(List.of(35, 38));

    }
}
