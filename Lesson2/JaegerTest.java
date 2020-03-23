public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        System.out.println(jaegerOne.getMark() + " " + jaegerOne.getOrigin() + " " + jaegerOne.getModelName());

        jaegerOne.scanKaiju();
        jaegerOne.move();

        Jaeger jaegerTwo = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9);
        System.out.println(jaegerTwo.getMark() + " " + jaegerTwo.getOrigin() + " " + jaegerTwo.getModelName());

        jaegerTwo.useVortexCannon();
        jaegerTwo.drift();
    }
}