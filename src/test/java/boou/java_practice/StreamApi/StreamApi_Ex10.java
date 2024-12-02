package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex10 {
    @Test
    void 필터_맵_테스트2() {
        // given
        List<String> names = Arrays.asList("Kim", "Park", "Lee", "Choi", "Jung", "Kang");

        // when
        List<String> upperCasedNames = names.stream()
                .filter(n -> n.length() >= 4)
                .map(n-> n.toUpperCase())
                .toList();

        // then
        assertThat(upperCasedNames).hasSize(4);
        assertThat(upperCasedNames).isEqualTo(List.of("PARK", "CHOI", "JUNG", "KANG"));
    }
}
