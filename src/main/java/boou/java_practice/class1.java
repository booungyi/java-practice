package boou.java_practice;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class class1 {
//    public static void main(String[] args) {
//        Author author1 = new Author("aka");
//        Publisher publisher1 = new Publisher("zin","akazin");
//        Book book1 = new Book(publisher1, 122, "zin", author1);
//        System.out.println(book1.id);//122
//        System.out.println(book1.publisher);//boou.java_practice.Publisher@3941a79c
        //지금 book 에서는 publisher 에 주소가 연결이 돼있음
        //접근은 안된다
        //애초에 new Book(pusblisher1,id:222,title:"zin",author1); 에서
        //222 그리고 zin 은 book class 에서 변수를 선언한거지만
        //publisher1 그리고 author1 은 각각의 클래스를 참조 만 한거기 때문에??
        //그러면 아래는 왜됨
        //접근 방식의 차이
//        author1.author = "aka";
//        author1.dateOfBirth = LocalDate.of(2000, 10, 10);
//        System.out.println(book1.author.author); //aka
//        System.out.println(book1.author.dateOfBirth);
//        System.out.println(book1.publisher.publisher);
//        System.out.println(book1.publisher.name);


        Money money = new Money(9);
//        ArrayList<Integer> lottoNumber = new ArrayList<>();
//
//        int lottoNumbers1 = 1;
//        int lottoNumbers2 = 13;
//        int lottoNumbers3 = 16;
//        int lottoNumbers4 = 33;
//        int lottoNumbers5 = 43;
//        int lottoNumbers6 = 45;

//        Random random = new Random();
//        int randomNumber = random.nextInt(47);
//
//        LottoNumbers lottoNumbers = new LottoNumbers(randomNumber);
//        System.out.println(lottoNumbers.lottoNumber);
//        lottoNumbers.lottoNumber = 999; // 에러가 생기지않음;
//        System.out.println(lottoNumbers.lottoNumber);
//
//        Author 한강작가 = new Author("한강");
//        System.out.println(한강작가.name);
//        한강작가.author = "lsd2ddsasd";
//        System.out.println(한강작가.author);
//    }

}
