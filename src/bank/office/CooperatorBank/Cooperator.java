package bank.office.CooperatorBank;

public class Cooperator {
    private int workTime;
    private String gender;
    private String name;
    private String family;
    private int age;

    public Cooperator(int workTime, String gender, String name, String family, int age) {
        this.workTime = workTime;
        this.gender = gender;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public void workInOtdelCredit(){}
    public void workInOtdelDebitOpiration(){}
    public int obed(){
        return workTime;
    }

}
