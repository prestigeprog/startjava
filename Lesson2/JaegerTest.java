public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);
        System.out.println(jaegerOne.getMark() + " " + jaegerOne.getOrigin() + " " + jaegerOne.getModelName());

        jaegerOne.scanKaiju();
        jaegerOne.move();

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.850f);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);
        System.out.println(jaegerTwo.getMark() + " " + jaegerTwo.getOrigin() + " " + jaegerTwo.getModelName());

        jaegerTwo.useVortexCannon();
        jaegerTwo.drift();
    }
}