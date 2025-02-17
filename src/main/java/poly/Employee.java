package poly;

import poly.actions.ManagerActions;
import poly.actions.SeniorActions;

public abstract class Employee implements SeniorActions, ManagerActions {
    //characteristics
    private String name;
    private String startDate;
    private double salary;

    //Setters na getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid entry for name!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.isEmpty()){
            this.startDate = startDate;
        }else {
            System.out.println("Error: invalid entry for start date!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary  >= 1077){
            this.salary = salary;
        }else {
            System.out.println("Error: invalid entry for salary!");
        }
    }

    //constructor
    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }

    protected abstract void calculateBonus();

    @Override
    public void fillInPresentSheets() {
        System.out.printf("%s is filling the sheets.%n",name);
    }
}
