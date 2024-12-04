package boou.java_practice.StreamApi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamApi_Ex11 {
    @Test
    void map으로_정보_제외() {
        Map<String, String> user1 = new HashMap<>();
        user1.put("id", "dora");
        user1.put("nickname", "도라에몽");
        user1.put("password", "dora123");

        Map<String, String> user2 = new HashMap<>();
        user2.put("id", "njk");
        user2.put("nickname", "진구");
        user2.put("password", "jk123");

        Map<String, String> user3 = new HashMap<>();
        user3.put("id", "bisil");
        user3.put("nickname", "비실이");
        user3.put("password", "bs123");

        ArrayList<Map<String, String>> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        List<Map<String, String>> newUsers = users.stream()
                .map(기존맵 -> {Map<String, String> 새로운맵 = new HashMap<>();
                    // 여기에 코드를 입력하세요
                 기존맵.forEach((key, value) -> {if (!key.equals("password")){새로운맵.put(key, value);}});
                 return 새로운맵;
    })
                .toList();

        // 아래 테스트를 통과해야 합니다
        assertThat(newUsers.get(0).get("password")).isNull();
        assertThat(newUsers.get(1).get("password")).isNull();
        assertThat(newUsers.get(2).get("password")).isNull();
    }
}
