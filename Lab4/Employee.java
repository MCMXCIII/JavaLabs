import jdk.nashorn.internal.scripts.JO;

import java.util.Date;

public class Employee {
    //date construct
    Date date = new Date();
    //init vars
    String name;
    Date hireDate;


    //1st constructor
    public Employee(){
        name = "No Name";
        hireDate = new Date();
    }

    //setters and getters

    //name getter
    public String getName(){
        return name;
    }

    //name setter
    public void setName(String name){
            this.name = name;
    }

    //Date setter
    public Date getHireDate (){
        return date;
    }

    //Date getter
    public void setHireDate(Date date){
        this.date = date;
    }

//main with parameters passed
    public static void main(String[] args){
        HourlyEmployee JoeWorker = new HourlyEmployee("Joe Worker",50.50,160.0);

        JoeWorker.setName("Joe Worker");
        JoeWorker.setwageRate(50.50);
        JoeWorker.setHours(160);
        System.out.println("Joe's Longer name is: "+ JoeWorker.getName());
        System.out.println("Changing joe's name to joesephine");
        JoeWorker.setName("Josephine");
        System.out.println("joe's record is as follows: " + JoeWorker.getName() + " " + JoeWorker.getHireDate() + "\n$" + JoeWorker.getwageRate() + " per hour for " + JoeWorker.hours +  " hours");
    }

}
