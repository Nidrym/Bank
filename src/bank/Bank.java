package bank;

import bank.office.CooperatorBank.Cooperator;
import bank.office.Office;
import bank.bankomat.Bankomat;

public class Bank {
    private String name;
    private Bankomat atm;
    private Office office;
    private Cooperator cotridnik;

    public Bank(String name) {
        this.name = name;
        atm = new Bankomat(true, "true", "закончилась бумага", "клавиатура", 127000, "rub");
        office = new Office(12, 1, 800, 2200);
    }

    public static void main(String[] args) {
        Bank alfha = buildBank();

        int c = alfha.atm.getCash();   //в круглых скобках параметр

        alfha.atm.getPrintCheck();

        System.out.println(c);
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();

    }

    private static Bank buildBank() {
        Bank alfha = new Bank("alfhaBank");
        return alfha;
    }
}
