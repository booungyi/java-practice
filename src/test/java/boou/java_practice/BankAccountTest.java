package boou.java_practice;
// src/test/java/javapractice/BankAccountTest.java

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {


    @Test
    void 생성테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(0), "이효리");
        assertThat(계좌1.accountNumber).isEqualTo("111-1111-1111");
        assertThat(계좌1.balance).isEqualTo(new Money(0));
        assertThat(계좌1.owner).isEqualTo("이효리");

        BankAccount 계좌2 = new BankAccount("222-2222-2222", new Money(0), "이지은");
        assertThat(계좌2.accountNumber).isEqualTo("222-2222-2222");
        assertThat(계좌2.balance).isEqualTo(new Money(0));
        assertThat(계좌2.owner).isEqualTo("이지은");
    }

    @Test
    void 입출금테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(0), "이효리");
        BankAccount 계좌2 = new BankAccount("222-2222-2222", new Money(0), "이지은");

        계좌1.deposit(new Money(1000));
        assertThat(계좌1.balance).isEqualTo(new Money(1000));

        int 월급 = 300;
        계좌1.withdraw(new Money(월급));
        계좌2.deposit(new Money(월급));
        assertThat(계좌1.balance).isEqualTo(new Money(700));
        assertThat(계좌2.balance).isEqualTo(new Money(300));
    }

    @Test
    void 출금테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(1000), "이효리");
        계좌1.deposit(new Money(500));
        assertThat(계좌1.balance).isEqualTo(new Money(1500));
        계좌1.withdraw(new Money(300));
        assertThat(계좌1.balance).isEqualTo(new Money(1200));
    }

    @Test
    void 머니출금테스트() {
        BankAccount 계좌1 = new BankAccount("111-1111-1111", new Money(1000), "이지은");
        계좌1.deposit(new Money(100));
        assertThat(계좌1.balance).isEqualTo(new Money(1100));
    }
}
