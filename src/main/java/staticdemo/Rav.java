package staticdemo;

public class Rav extends Car{
    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Rav(String color, String engineType) {
        super(color, engineType);
    }

    public void printRavDetails(){
        System.out.println("Blah blah");
    }
}
