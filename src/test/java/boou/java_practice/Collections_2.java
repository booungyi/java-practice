package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Collections_2 {
    @Test
    void myFrequencyTest() {
        ArrayList<String> 이름목록 = new ArrayList<>();
        이름목록.add("박효신"); // 박효신 1명
        이름목록.add("이지은");
        이름목록.add("이지은"); // 이지은 2명
        이름목록.add("하현우");
        이름목록.add("하현우");
        이름목록.add("하현우"); // 하현우 3명

        int 박효신_인원수 = myFrequency(이름목록, "박효신");
        int 이지은_인원수 = myFrequency(이름목록, "이지은");
        int 하현우_인원수 = myFrequency(이름목록, "하현우");

        assertThat(박효신_인원수).isEqualTo(1); // 1명
        assertThat(이지은_인원수).isEqualTo(2); // 2명
        assertThat(하현우_인원수).isEqualTo(3); // 3명
    }

    int myFrequency(List<String> namelist, String name) {
        int add = 0;
        for (String names : namelist) {
            if (names.equals(name)) {
                add++;
            }
        }
        return add;
    }
}
