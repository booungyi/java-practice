package boou.java_practice;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MapEx_2 {
    public static void main(String[] args) {
        Map<String, Integer> productStock = new HashMap<>();
        productStock.put("갤럭시 S24", 8);
        productStock.put("삼다수 2L", 20);
        productStock.put("칙촉 오리지널 6+2입 120g", 10);
        productStock.put("M4 맥북 프로", 5);

        // 아래에 코드를 작성해 주세요
        // 🚫 productStock.put("갤럭시 S24", 7);
        // 🚫 productStock.put("M4 맥북 프로", 4);

        productStock.put("갤럭시 S24", productStock.get("갤럭시 S24") - 1);
        productStock.put("M4 맥북 프로", productStock.get("M4 맥북 프로") - 1);
        // 아래 테스트를 통과해야 합니다
        assertThat(productStock.get("갤럭시 S24")).isEqualTo(7);
        assertThat(productStock.get("M4 맥북 프로")).isEqualTo(4);

    }
}
