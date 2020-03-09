public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 24;
        
        if (age > 20) {
        	System.out.println("more than 20");
        }


        boolean isHeManOrWoman = true;
       
        if (isHeManOrWoman == true) {
        	System.out.println("man");
        }
        if (isHeManOrWoman == false) {
        	System.out.println("woman");
        }


         double height = 1.92d;

        if ( height < 1.80) {
        	System.out.println("gnome");
        } else
        	System.out.println("giant");
		


		String name = "sergo";

        if (name.startsWith("m")) {
        	System.out.println("name starts with M");
        } else if (name.startsWith("i")) {
        	System.out.println("name starts with I");
        } else
        	System.out.println("not I and M");

    }
}