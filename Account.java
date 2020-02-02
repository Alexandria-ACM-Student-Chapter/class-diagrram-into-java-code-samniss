package com.company;

public class Account
{


    private int id;
    private String name;
    private int balance =0;
    public Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount){
        if (amount<=balance){
            balance = balance-amount;
        }
        else {
            System.out.println("Amount exceeds balance");

        }
        return balance;
    }
    public int transferTo(Account m, int amount){
        if (amount<=balance){
            m.balance = m.balance + amount;
            balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeds balance");

        }
        return balance;
    }
    public static void main(String[] args) {
        Account v = new Account(1234,"mohamed",3000);
        Account b = new Account(1235,"ahmed",4500);
        System.out.println(v.getId());
        System.out.println(v.debit(100));
        System.out.println(v.transferTo(b,2900));
    }

    public String toString() {
        return "Account[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
