package Bank.Office;

import Bank.Office.CooperatorBank.Cooperator;
import Bank.Office.OtdelCredit.Credit;
import Bank.Office.OtdelDebitOpiration.DebitOperation;

public class Office  {
    private int cashBox;
    private int terminalQueue;  //терминал электройной очереди
    private int openWork;
    private int closeWork;
    private Cooperator cotridnik;
    private Credit otdelCredit;
    private DebitOperation otdelDebit;

    public Office(int cashBox, int terminalQueue, int openWork, int closeWork) {
        this.cashBox = cashBox;
        this.terminalQueue = terminalQueue;
        this.openWork = openWork;
        this.closeWork = closeWork;
        cotridnik = new Cooperator(8,"man","Roman","Abramovich",26);
        otdelCredit = new Credit(1000,2200,true);
        otdelDebit = new DebitOperation();
        }

        public int getTerminalQueue() {
            for (int c = terminalQueue; ; c++){
                System.out.println("Ваш номер:" + c);
            break;}
            return terminalQueue++;
        }


}
