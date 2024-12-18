package Ex2_Restaurant;

public class Manager extends Employee{

    private int salary;
    public Manager (int s){
        salary = s;
    }
    public double getPay(){
        double monthlypay = salary/12;
        double tax = monthlypay * 0.2;

        taxesCollected += tax;
        return  monthlypay - tax;
    }


}
