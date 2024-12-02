package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex7 {
    @Test
    void 맵_테스트_대문자화() {
        List<String> companies = List.of("google", "apple", "netflix");
        List<String> upperCasedCompanies = companies
                .stream()
                .map(n -> n.toUpperCase())
                .toList();

        assertThat(upperCasedCompanies).isEqualTo(List.of("GOOGLE", "APPLE", "NETFLIX"));
    }

}
