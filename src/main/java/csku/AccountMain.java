package csku;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter the type : income , expenses , slip or exit : " );
            String input = scanner.next();
            if (input.equals("income")){
                System.out.println("Exter a description : ");
                String descrip = scanner.next();
                System.out.println("Enter a money : ");
                int inputMoney = scanner.nextInt();
                account.income(descrip,inputMoney);
                System.out.println("You account have " + account.getBalanceMoney());
            }else if (input.equals("expense")){
                System.out.println("Exter a description : ");
                String descrip = scanner.next();
                System.out.println("Enter a money : ");
                int inputMoney = scanner.nextInt();
                account.expense(descrip,inputMoney);
                System.out.println("You account have " + account.getBalanceMoney());
            }else if (input.equals("exit")){
                System.out.println("Program is closed.");
                System.exit(0);
            }else if (input.equals("slip")){
                System.out.println(account.resultHistory());
                System.out.println("You account have " + account.getBalanceMoney());
            }
            else {
                System.out.println("Invalid type.");
            }
        }

    }
}
