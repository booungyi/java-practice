package boou.java_practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaPracticeApplicationTests {

	@Test
	void contextLoads() {
		System.out.println();
	}

	public class Index_ex {
		Boolean specialChars(String str) {
			//8 자리 확인

			Boolean pass;
			if (str.length() > 8) {
				pass = true;
			} else {
				pass = false;
			}
			System.out.println("pass = " + pass);
			return pass;
		}
	}

}
