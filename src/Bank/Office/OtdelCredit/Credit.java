package Bank.Office.OtdelCredit;

import Bank.Office.CooperatorBank.Cooperator;

public class Credit {
    private int openWork;
    private int closeWork;
    private String mortgage; //Ипотека
    private String potrebCredit;
    private String leasing;
    private Cooperator cotridnik;
    private boolean arm;

    public Credit(int openWork, int closeWork, boolean arm) {
        this.openWork = openWork;
        this.closeWork = closeWork;
        cotridnik = new Cooperator(8, "man", "Ivan", "Grenev", 31);
        this.arm = arm;
    }

    public String getMortgage() {
        return mortgage;
    }

    public String getPotrebCredit() {
        return potrebCredit;
    }

    public String getLeasing() {
        return leasing;
    }

    public void сonsultationCoopiratorBank() {

    }
}
