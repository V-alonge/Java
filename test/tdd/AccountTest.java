package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {

//          given
        Account cassandraAccount = new Account();

//          when I deposit 5000
        cassandraAccount.deposit(5_000);

//          check that balance is 5000
        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(5_000, cassandraAccountBalance);
    }

    @Test
    public void depositTwice(){
//        given there is an account with an initial balance of 4000, when I deposit 2000 check that balance is 6000

        Account cassandraAccount = new Account();

        cassandraAccount.deposit(4_000);

        cassandraAccount.deposit(2_000);

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(6_000, cassandraAccountBalance);

    }

    @Test
    public void depositNegativeValueAmountTest(){
        Account cassandraAccount = new Account();

        cassandraAccount.deposit(4_000);

        cassandraAccount.deposit(-1_000);

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(4_000, cassandraAccountBalance);

    }

    @Test
    public void withdrawTest(){
        Account cassandraAccount = new Account();

        cassandraAccount.deposit(5_000);

        cassandraAccount.withdraw(1_000, "1233");

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(5_000, cassandraAccountBalance);
    }

    @Test
    public void withdrawTestTwice(){
        Account cassandraAccount = new Account();

        cassandraAccount.deposit(1_000);

        cassandraAccount.withdraw(1_000, "1234");

        cassandraAccount.withdraw(1_000, "1234");

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(0, cassandraAccountBalance);
    }

    @Test
    public void withdrawNegativeValueInTest() {
        Account cassandraAccount = new Account();

        cassandraAccount.deposit(5_000);

        cassandraAccount.withdraw(1_000, "1234");

        cassandraAccount.withdraw(1_000, "1234");

        cassandraAccount.withdraw(-1_000, "1234");

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(3_000, cassandraAccountBalance);
    }

    @Test
    public void withdrawWithPin(){
        Account cassandraAccount = new Account();

        cassandraAccount.deposit(50_000);

        cassandraAccount.withdraw(25_000,"1234");

        int cassandraAccountBalance = cassandraAccount.getBalance();

        assertEquals(25_000, cassandraAccountBalance);

    }
}
