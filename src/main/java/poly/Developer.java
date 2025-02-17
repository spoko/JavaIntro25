package poly;

public class Developer extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (!programingLanguage.isEmpty()){
            this.programingLanguage = programingLanguage;
        }else {
            System.out.println("Error: Invalid entry for programing language!");
        }
    }

    public Developer(String name, String startDate, double salary, String programingLanguage) {
        //System.out.println("sdfgsdf"); first line of code must be calling the super constructor
        super(name, startDate, salary);
        setProgramingLanguage(programingLanguage);
    }

    @Override
    protected void calculateBonus() {
        System.out.printf("%s has %.2f bonus.%n", super.getName(), 1000.5678);
    }

    @Override
    public void supportSomeone() {
        System.out.printf("%s is helping with a lot of code examples.", super.getName());
    }

    @Override
    public String giveFeedback() {
        return "You are doing well!";
    }
}
