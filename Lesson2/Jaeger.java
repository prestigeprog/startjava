public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("No symbols");
        }
        this.modelName = modelName;
    }

    public boolean drift() {
        System.out.println("You are in drift!");
        return true;
    }

    public void move() {
        System.out.println("You did 5 steps!");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
    }
}