package csku;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefAccount {

    Account account;


    @Before
    public void init(){
        account=new Account();
    }

    @Given("a user have (\\d+) in balance")
    public void a_user_have_in_balance(int balance){
        account = new Account(balance);
    }


    @When("I earned (\\d+) from (.*) at (.*)")
    public void i_earned_from(int income, String desc,String date){
        account.income(desc, income,date);
    }

    @When("I expense a money amount (\\d+) from (.*) at (.*)")
    public void i_expense_a_money(int expense, String desc,String date){
        account.expense(desc,expense,date);
    }


    @When("I expense a money more than balance amount (\\d+) from (.*) at (.*)")
    public void i_expense_a_money_more_than_balance(int expense, String desc,String date){
        account.expense(desc,expense,date);
    }

    @When("I edit a money amount 200 from (.*) to (.*) amount (\\d+) at (.*)")
    public void edit_income(int expense, String desc,String date,String type){
        account.editMoney(type,desc,expense,date);
    }

    @When("I edit a money amount 200 from (.*) to (.*)amount (\\d+) at (.*)")
    public void edit_expense(int expense, String desc,String date,String type){
        account.editMoney(type,desc,expense,date);
    }
    @Then("I have balance amount (.*)")
    public void balance_is_minus(int balance){
        assertEquals(balance, account.getBalanceMoney());
//        account .getBalanceMoney();
    }


}

