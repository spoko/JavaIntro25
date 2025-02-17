package poly;

public class QualityAssurance extends Employee{
    public boolean hasISTQB;//no need this to be private

    public QualityAssurance(String name, String startDate, double salary, boolean hasISTQB) {
        super(name, startDate, salary);
        this.hasISTQB = hasISTQB;
    }

    @Override
    protected void calculateBonus() {
        if (hasISTQB){
            System.out.printf("%s has %.2f bonus.%n", super.getName(), getSalary() * 2);
        }else {
            System.out.printf("%s has %.2f bonus.%n", super.getName(), getSalary());
        }
    }

    //polymorphism - method override
    @Override
    public void supportSomeone() {
        System.out.printf("%s is helping with a lot of test examples.", super.getName());
    }

    @Override
    public String giveFeedback() {
        return "You shall work harder.";
    }

    //polymorphism - method overload
    public String giveFeedback(Employee employee){
        return String.format("%s is getting better.", employee.getName());
    }
}
