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
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    } 

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        this.armor = armor;
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

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
    this.modelName = modelName;
    this.mark = mark;
    this.origin = origin;
    this.height = height;
    this.weight = weight;
    this.speed = speed;
    this.strength = strength;
    this.armor = armor;
    }
}