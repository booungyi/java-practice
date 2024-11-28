package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_product1 {
    @Test
    void test() {
        HashMap<String, String> product1 = new HashMap<>();
        product1.put("상품명", "코멧 니트릴장갑 화이트");
        product1.put("상품 가격", "6540원");
        product1.put("카테고리", "주방용품");

        HashMap<String, String> product2 = new HashMap<>();
        product2.put("상품명", "라운드랩 1025 독도 로션,400ml 1개");
        product2.put("상품 가격", "6540원");
        product2.put("카테고리", "주방용품");

        HashMap<String, String> product3 = new HashMap<>();
        product3.put("상품명", "삼양 불닭볶음면 큰컵 105g,16개");
        product3.put("상품 가격", "17110"+"원");
        product3.put("카테고리", "식품");

        ArrayList<HashMap<String, String>> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (HashMap<String, String> product : products) {
            System.out.println("-----");
            System.out.println(product.get("상품명"));
            System.out.println("$" + product.get("상품 가격"));
            System.out.println(product.get("카테고리"));
        }

    }
}
