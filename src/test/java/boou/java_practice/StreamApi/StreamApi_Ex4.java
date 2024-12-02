package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex4 {
    @Test
    void 필터_테스트_이씨_이름() {
        List<String> names = List.of("왕건", "이성계", "이방원", "박새로이", "이도");

        List<String> filteredNames = names.stream().filter(n -> n.startsWith("이")).toList();
        

                assertThat(filteredNames).isEqualTo(List.of("이성계", "이방원", "이도"));
    }
}
