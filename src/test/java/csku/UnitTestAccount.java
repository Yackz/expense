package csku;

import csku.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTestAccount {


    Account account;

    @BeforeEach
    void init(){
        account=new Account();
        account.income("init",100);
    }

    @Test
    void testIncome(){
        account.income("income",500);
        assertEquals(600,account.getBalanceMoney());
    }

    //normal expense
    @Test
    void testExpense(){
        account.expense("expense",50);
        assertEquals(50,account.getBalanceMoney());
    }

    //expense more than balance
    @Test
    void testExpenseMoreThanMoney(){
        account.expense("ExpenseMoreThanMoney",500);
        assertEquals(-400,account.getBalanceMoney());
    }
}



