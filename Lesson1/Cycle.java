public class Cycle {	
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }
       
        int counter = 10;
        int result = 0;
        do {
            if (numbers2 % 2 != 0) {
                result += counter;
            } 
            numbers2++;
        } while (numbers2 <= 20);
            System.out.println(result);
    }
}