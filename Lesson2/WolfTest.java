public class WolfTest {
    public static void main(String[] args) throws Exception {
        Wolf wolf = new Wolf();
        wolf.sex = 'm';
        wolf.name = "jacob";
        wolf.weight = 120;
        wolf.age = 23;
        wolf.color = "black";

        System.out.println(wolf.sex);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.go();
        wolf.hunt();
    }
}