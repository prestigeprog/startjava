public class Cycle {	
    public static void main(String[] args) {
       int numbers1 = 0;
       for (int i = 0;i <= 20; i++) {
       	System.out.println(numbers1);
       	numbers1++;
       }

       int numbers2 = 6;
       while (numbers2 >= -6) {
       	System.out.println(numbers2);
       	numbers2 = numbers2 - 2;
       }
       
       int numbers3 = 10;
       int temp = 0;
       do {
       	if (numbers3 % 2 !=0) {
       		temp = temp + numbers3;
       		numbers3++;
       	} else {
       		numbers3++;
       	}
       } while (numbers3 <= 20);
       System.out.println(temp);
	}
}

