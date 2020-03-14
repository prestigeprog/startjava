public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.sex = 'm';
        wolf1.name = "jacob";
        wolf1.weight = 120;
        wolf1.age = 23;
        wolf1.color = "black";

        System.out.println(wolf1.sex);
        System.out.println(wolf1.name);
        System.out.println(wolf1.weight);
        System.out.println(wolf1.age);
        System.out.println(wolf1.color);

        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.go();
        wolf1.hunt();
    }
}
class Wolf {   
    char sex;
    String name;
    int weight;
    int age;
    String color;

    void sit() {
    }
    void run() {
    }
    void howl() {
    }
    void go() {
    }
    void hunt() {
    }

}

