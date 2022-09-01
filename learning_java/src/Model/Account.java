package Model;

public class Account {
    private String accountName;
    private double salary;

    public Account() {
    }
    public Account(String accountName, Double salary) {
        this.accountName = accountName;
        if(salary == null) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double deposit(double amount) {
        return this.salary += amount;
    }
    public double withdraw(double amount) {
        double resultSalary = amount - 5;
        return this.salary -= resultSalary;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
