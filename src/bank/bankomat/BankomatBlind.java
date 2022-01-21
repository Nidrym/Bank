package bank.bankomat;

public class BankomatBlind extends Bankomat {
    private String headphones;
    private String voiceHelp;

    public BankomatBlind(boolean cartRead, String videoCamera, String printCheck, String keyBoard, int cash, String value) {
        super(cartRead, videoCamera, printCheck, keyBoard, cash, value);
    }

    public void Headphones() {
        System.out.printf("Наушники");
    }

    public void voiceHelp() {
        System.out.printf("Голосовой помощник");
    }

}
