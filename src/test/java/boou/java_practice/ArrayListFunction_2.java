package boou.java_practice;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
public class ArrayListFunction_2 {
    @Test
    void test() {

        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return
    }

    double getAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        double sum2 = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }

}
