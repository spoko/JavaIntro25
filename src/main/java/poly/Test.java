package poly;

public class Test {
    public static void main(String[] args) {
        //Employee employee = new Employee("Petar", "2001/01/01", 5353.25); we cannot create object from an abstract class

        Developer dev1 = new Developer("Ivan", "2001/01/01", 5353.25, "JAVA");

        dev1.calculateBonus();

        QualityAssurance qa1 = new QualityAssurance("Petar", "2001/01/01",
                6565.8585, true);

        QualityAssurance qa2 = new QualityAssurance("Damla", "2025/05/01",
                6565.8585, false);

        qa1.calculateBonus();
        qa2.calculateBonus();

        System.out.println(dev1.giveFeedback());
        System.out.println(qa1.giveFeedback());
        System.out.println(qa1.giveFeedback(qa2));

        dev1.fillInPresentSheets();
        qa2.fillInPresentSheets();
    }
}
