package bank.bankomat.service;

public interface IService {

    void setNumber(int number);

    default void printInfo(){
        System.out.println("Базовая информация о деньгах");
    }
    default void printInfo(int sum){
        System.out.println("Базовая информация о деньгах с суммой:"+ sum);
    }
}
