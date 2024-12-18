package Ex2_Restaurant;

public class Worker extends Employee{
public double wage;
public double numHours;

public Worker(double w ){
    wage = w;
    numHours = 160 * Math.random();


}
public double getPay() {
double monthlypay = numHours * wage;
double tax = monthlypay * 0.2;

taxesCollected += tax;
    return  monthlypay - tax;

}




}
