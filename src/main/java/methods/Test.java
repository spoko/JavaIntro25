package methods;

public class Test {

    public static void main(String[] args) {
        Student pesho = new Student();
        pesho.setName("Pesho");
        pesho.setFacultyNumber(12354);
        pesho.setFaculty("FMI");
        pesho.setUniversity("Sofia");

        int numberOfSubjects = pesho.getNumberOfSubjects();

        System.out.println(numberOfSubjects);
        pesho.getNumberOfSubjects(8);

        pesho.printDetails();

        pesho.selectDayOff(1);

        Student gosho = new Student("Georgy", "Sofia", "FMI", 55546);

        gosho.printDetails();

        System.out.println(sum(multiply(2, 2), sum(5, 5)));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}
