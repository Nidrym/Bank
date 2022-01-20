package Bank;

import Bank.Office.CooperatorBank.Cooperator;
import Bank.Office.Office;
import Bank.Bankomat.Bankomat;

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
        Bank alfha = new Bank("Bank") {
        };

        int c = alfha.atm.getCash();   //в круглых скобках параметр

        alfha.atm.getPrintCheck();

        System.out.println(c);
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();
        alfha.office.getTerminalQueue();

    }
}
