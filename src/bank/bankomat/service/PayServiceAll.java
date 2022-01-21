package bank.bankomat.service;

public class PayServiceAll implements IService{
    private String organization;
    private int personalAccount; //лицивой счет
    private float sum;
    private String name;
    private String surname; //фамилия
    private String address;

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setPersonalAccount(int personalAccount) {
        this.personalAccount = personalAccount;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setNumber(int number) {

    }
}
