package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ClassTest {
    @Test
    void name() {
        Map<String, String> user1 = new HashMap<>();
        Person person1 = new Person();
//        person1.name = "김성락"; //Test 에서 main Java 패키지 안에들어있는 class 호출시 변수를 가져올때 문제가생김

    }
}
