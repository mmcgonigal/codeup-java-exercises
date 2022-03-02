package interfaces_abstractClasses;

public class Accountant extends Employee{


    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work(){
        return "TPS Reports drafted";
    }


    public String morningMeeting() {
        return "Accounts have morning meeting between 8: 15 and 8:45";
    }


    public String lunchTime() {
        return "An account takes their lunch from 12 pm to 1pm";
    }


    public int dailyPay() {
        return 400;
    }

    @Override
    public int getPaid() {
        return 8000;
    }
}
