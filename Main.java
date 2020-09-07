import java.util.Scanner;
package com.hcl2;
public class AccountDetails{
    protected String account_name;
    protected String account_number;
    protected Double balance;
    public AccountDetails(String account_name,String account_number,Double balance) {
        super();
        this.account_name=account_name;
        this.account_number=account_number;
        this.balance=balance;
    }
    public String getAccount_name(){
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }
    public String getAccount_number(){
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public Double getBalance()
    {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
public class SavingsAccount extends AccountDetails {
    public Double minimum_balance;

    public SavingsAccount(String account_name, String account_number, int balance, Double minimum_balance) {
        super(account_name, account_number, balance);
        this.minimum_balance = minimum_balance;
    }

    public Double getMinimum_balance() {
        return minimum_balance;
    }

    public void setMinimum_balance() {
        this.minimum_balance = minimum_balance;
    }
}
public class FixedAccount extends SavingsAccount{
      int long_period;
    public FixedAccount(String account_name, String account_number, Double balance, Double minimum_balance,int long_period)
    {
        super(account_name, account_number, balance,minimum_balance);
        this.long_period=long_period;
    }
    public int getLong_period(){
        return long_period;
    }
    public void setLong_period(int long_period){
        this.long_period=long_period;
    }
    protected void display()
    {
        System.out.println(super.account_name);
        System.out.println(super.account_number);
        System.out.println(super.balance);
        System.out.println(super.minimum_balance);
        System.out.println(long_period);
    }
}
    public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner input=new Scanner(System.in);
        String output;
        output= input.nextLine();
        String s[10]=output.split(",");
            FixedAccount fa = new FixedAccount(s[0], s[1], s[2], s[3],s[4]);
            fa.display();
    }
}
