package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex12 {
    @Test
    void map으로_키_변환() {
        Map<String, String> user1 = new HashMap<>();
        user1.put("id", "dora");
        user1.put("nickname", "도라에몽");

        Map<String, String> user2 = new HashMap<>();
        user2.put("id", "njk");
        user2.put("nickname", "진구");

        Map<String, String> user3 = new HashMap<>();
        user3.put("id", "bisil");
        user3.put("nickname", "비실이");

        ArrayList<Map<String, String>> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        List<Map<String, String>> newUsers = users.stream()
                .map(기존맵 -> {
                    Map<String, String> 새로운맵 = new HashMap<>();
                    // 여기에 코드 입력
                    새로운맵.put("id", 기존맵.get("id"));
                    새로운맵.put("username", 기존맵.get("nickname"));
                    return 새로운맵;
                })
                .toList();

        // 아래 테스트를 통과해야 합니다
        assertThat(newUsers.get(0).get("username")).isNotNull();
        assertThat(newUsers.get(1).get("username")).isNotNull();
        assertThat(newUsers.get(2).get("username")).isNotNull();
    }
}
