package boou.java_practice;
import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Codingtest {

    public int even(int n) {
        int x;
        for (x = 1; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return x;
    }

    @Test
    void name() {

        int 결과1 = even(10);
        assertThat(even(10)).isEqualTo(3);
    }
}
