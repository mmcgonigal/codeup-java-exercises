package interfaces_abstractClasses;

public class Custodian extends Employee{


    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return"Maintain the building";
    }


    public String morningMeeting() {
        return "Custodians have direct report to the head of Maintenance  and schedule meeting as necessary";
    }


    public String lunchTime() {
        return "lunch is from 12:30 pm to 1:30 pm";
    }


    public int dailyPay() {
        return 120;
    }


    public int getPaid() {
        return 2400;
    }
}
