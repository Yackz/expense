package csku;

import csku.console.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTestAccount {


    Account account;

    @BeforeEach
    void init(){
        account=new Account();
        account.income("init",100,"19/1/61");
    }

    @Test
    void testIncome(){
        account.income("income",500,"20/1/61");
        assertEquals(600,account.getBalanceMoney());
    }

    //normal expense
    @Test
    void testExpense(){
        account.expense("expense",50,"21/1/61");
        assertEquals(50,account.getBalanceMoney());
    }

    //expense more than balance
    @Test
    void testExpenseMoreThanMoney(){
        account.expense("ExpenseMoreThanMoney",500,"22/1/61");
        assertEquals(-400,account.getBalanceMoney());
    }

    @Test
    void checkEdit(){
        account.checkEdit("income","init",100,"19/1/61");
        assertEquals(true,account.getEdit());
    }

    @Test
    void editData(){
        account.checkEdit("income","init",100,"19/1/61");
        account.editMoney("income","editTest",200,"26/1/61");
        assertEquals(200,account.getBalanceMoney());
    }
}



