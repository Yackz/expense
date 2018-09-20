package csku;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter the type : income , expenses , edit , slip or exit : " );
            String input = scanner.next();
            if (input.equals("income")){
                System.out.println("Enter date (ex. 10/9/61) : ");
                String date = scanner.next();
                System.out.println("Exter a description : ");
                String descrip = scanner.next();
                System.out.println("Enter a money : ");
                int inputMoney = scanner.nextInt();
                account.income(descrip,inputMoney,date);
                System.out.println("You account have " + account.getBalanceMoney());
            }else if (input.equals("expense")){
                System.out.println("Enter date (ex. 10/9/61) : ");
                String date = scanner.next();
                System.out.println("Exter a description : ");
                String descrip = scanner.next();
                System.out.println("Enter a money : ");
                int inputMoney = scanner.nextInt();
                account.expense(descrip,inputMoney,date);
                System.out.println("You account have " + account.getBalanceMoney());
            }else if (input.equals("exit")){
                System.out.println("Program is closed.");
                System.exit(0);
            }else if (input.equals("slip")){
                System.out.println(account.resultHistory());
                System.out.println("You account have " + account.getBalanceMoney());
            }else if (input.equals("edit")){
                System.out.println("Enter type of money : ");
                String type = scanner.next();
                System.out.println("Enter date (ex. 10/9/61) : ");
                String date = scanner.next();
                System.out.println("Exter a description : ");
                String descrip = scanner.next();
                System.out.println("Enter a money : ");
                int inputMoney = scanner.nextInt();
                account.checkEdit(type,descrip,inputMoney,date);
                if (account.getEdit()){
                    System.out.println("Enter new type of money : ");
                    String newType = scanner.next();
                    System.out.println("Enter new date (ex. 10/9/61) : ");
                    String newDate = scanner.next();
                    System.out.println("Exter a new description : ");
                    String newDescrip = scanner.next();
                    System.out.println("Enter a new money : ");
                    int newMoney = scanner.nextInt();
                    account.editMoney(newType,newDescrip,newMoney,newDate);
                    System.out.println("You account have " + account.getBalanceMoney());

                }else {
                    System.out.println("Edit Error");
                }

            }
            else {
                System.out.println("Invalid type.");
            }
        }

    }
    public void readFiles(String filename, Account account) {
        Scanner in;
        try {
            in = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e1) {
            System.out.println("Error opening accounts file.");
            return;
        }

        while (in.hasNext())
        {
            String type = in.next();
            String date = in.next();
            String des = in.next();
            int money = in.nextInt();
            if (type.equals("income")){
                account.income(des,money,date);
            }else {
                account.expense(des,money,date);
            }

        }
        in.close();
    }


}
