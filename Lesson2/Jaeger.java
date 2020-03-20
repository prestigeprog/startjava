public class Jaeger {
    private String modelName;

    public String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String mark;

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    private String origin;

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    private float height;

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    } 

    private float weight;

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }


    private int speed;

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }


    private int strength;

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    private int armor;

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
}