package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;


public class MapCRUD {
    @Test
    void test() {

        // 여기 아래에 코드 추가
        HashMap<String, String> 영한사전 = new HashMap<>();
        영한사전.put("apple","사과");
        영한사전.put("book", "책");
        영한사전.put("car", "자동차");

        // 테스트 코드
        assertThat(영한사전).containsEntry("apple", "사과")
                .containsEntry("book", "책")
                .containsEntry("car", "자동차");

    }
}
