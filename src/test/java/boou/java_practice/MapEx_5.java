package boou.java_practice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

public class MapEx_5 {
    @Test
    void test() {


        assertThat(List(1)).isFalse();
        assertThat(List(2)).isTrue();
        assertThat(List(3)).isTrue();



    }

    Boolean List(Integer n) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer lis : list) {
            if (list.contains(n)) {
                return true;
            }
        }
        return false;
    }
}
