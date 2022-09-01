import Model.Account;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        String numerConta;
        double salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero da sua conta: ");
        numerConta = scanner.nextLine();
        System.out.println("Digite seu salário: ");
        salary = scanner.nextDouble();
        Account account = new Account(numerConta, salary);
        System.out.println(account.toString());
        account.deposit(5000);
        System.out.println(account.toString());
        account.withdraw(7000);
        System.out.println(account.toString());
    }
}
