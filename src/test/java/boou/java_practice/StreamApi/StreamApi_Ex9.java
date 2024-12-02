package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex9 {
    @Test
    void 필터_맵_테스트1() {
        // given
        List<Integer> prices = Arrays.asList(1000, 25000, 30000, 15000, 5000, 40000);

        // when
        List<Double> discountedPrices = prices.stream()
                .filter(n -> n>20000)
                .map(n-> n*0.9)
                .toList();

        // then
        assertThat(discountedPrices).hasSize(3);
        assertThat(discountedPrices).isEqualTo(List.of(22500.0, 27000.0, 36000.0));
    }
}
