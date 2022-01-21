package bank.bankomat.service;

public class PayMobile implements IService {

    private int number;
    private int sum;
    private String operator;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}