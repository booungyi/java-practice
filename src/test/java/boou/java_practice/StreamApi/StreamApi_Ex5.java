package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex5 {
    @Test
    void 필터_테스트_두_글자_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("이") && n.length() == 2).toList();

                assertThat(filteredNames).isEqualTo(List.of("이도"));
    }
}
