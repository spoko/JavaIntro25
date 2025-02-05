package methods;

public class Student {
    //instance variable i.e. future object characteristics
    private int facultyNumber;
    private String faculty;
    private String university;
    private String name;

    //setters nad getters i.e. special methods
    public int getFacultyNumber() {
        return facultyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid value for name!");
        }
    }

    public void setFacultyNumber(int facultyNumber) {
        if(facultyNumber >= 100){
            this.facultyNumber = facultyNumber;
        }else {
            System.out.println("Error: invalid value for faculty number!");
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (!faculty.isEmpty()){
            this.faculty = faculty;
        }else {
            System.out.println("Error: invalid value for faculty!");
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        if (!university.isEmpty()){
            this.university = university;
        }else {
            System.out.println("Error: invalid value for university!");
        }
    }

    //constructors
    public Student(String name, String university, String faculty, int facultyNumber){
        setName(name);
        setUniversity(university);
        setFaculty(faculty);
        setFacultyNumber(facultyNumber);
    }

    public Student(){

    }

    //methods i.e. actions:
    public void getNumberOfSubjects(int numberOfMandatorySubjects){
        System.out.println(numberOfMandatorySubjects + 2);
    }


    public int getNumberOfSubjects(){
        return (5 + 2);
    }

    public void selectDayOff(int dayOff) {
        switch (dayOff) {
            case 1 -> System.out.printf("%s has selected day off to be Monday.%n", name);
            case 5 -> System.out.printf("%s has selected day off to be Friday.%n", name);
            default -> System.out.println("Invalid entry! Please select...");
        }
    }

    //method overload
    public void selectDayOff(PossibleDayOff day){
        switch (day){
            case MON -> System.out.printf("%s has selected day off to be Monday.%n", name);
            case THU -> System.out.printf("%s has selected day off to be Thursday.%n", name);
            case FRI -> System.out.printf("%s has selected day off to be Friday.%n", name);
            default -> System.out.println("Invalid entry! Please select...");
        }
    }

    public void printDetails(){
        System.out.printf("Student name is %s. " +
                "Student is learning in %s. More specifically in %s with faculty number of %d%n",
                name, university, faculty, facultyNumber);
    }
}
