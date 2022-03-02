package interfaces_abstractClasses;

public class Company {

    public static void main(String[] args) {


        Employee numberBot = new Accountant(
                "accountantBot","Accounting"
        );

        Employee cleanerBot = new Custodian("cleanerbot","Maintenance");

        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println("numberBot.name = " + numberBot.getName());
        System.out.println("cleanerBot.work() = " + cleanerBot.work());
        System.out.println("cleanerBot.name = " + cleanerBot.getName());
        System.out.println("cleanerBot.getDepartment() = " + cleanerBot.getDepartment());
        System.out.println("numberBot.dailyPay() =  " + numberBot.dailyPay());




    }
}
