package bank.bankomat;

public class Bankomat{
    private boolean cartRead;
    private String videoCamera;
    private String printCheck; //печать чека
    private String keyBoard;
    private int cash; //выдача валюты
    private String value; // Валюта


    public Bankomat(boolean cartRead, String videoCamera, String printCheck, String keyBoard, int cash, String value) {
        this.cartRead = cartRead;
        this.videoCamera = videoCamera;
        this.printCheck = printCheck;
        this.keyBoard = keyBoard;
        this.cash = cash;
        this.value = value;
    }


    public int getCash() {

        return cash;
    }

    public boolean isCartRead() {       // можно описать работу с картой банкомата, только я пока что не знаю как это сделать
        return cartRead;
    }

    public void getPrintCheck(){           //По идеи после выдачи чека возвращает карту, только я пока что не знаю как это сделать
        if (cartRead==true)
        System.out.println("Распечатывает чек");
        else System.out.println("Вставте карту");
    }



    public void payService() {
        System.out.println("Оплатить услу");
    }

    public void translatePay() {
        System.out.println("Перевести средства");
    }

    public String balanceCart = "Баланс карты" + " " + cash;


    public void value() {
        System.out.println("Перевести средства");
    }

//    String acceptanceOfContactlessCards; //работа с бесконтактными картам


}
