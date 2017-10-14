import java.util.Date;

//Hourly employee with extend on Employee
public class HourlyEmployee extends Employee {
    double wageRate = 0;
    double hours = 0;


    //1st constructor
    public HourlyEmployee(String name,double wageRate, double hours) {
        wageRate = 0;
        hours = 0;
        super.getName();
        super.getHireDate();

    }

    //wageRate Getter
    public double getwageRate(){
        return wageRate;
    }

    //wageRate Setter
    public void setwageRate(double wageRate){
        this.wageRate = wageRate;
    }

    //hours Getter
    public double getHours(){
        return hours;
    }

    //hours Setter
    public void setHours(double hours){
        this.hours = hours;
    }

}
