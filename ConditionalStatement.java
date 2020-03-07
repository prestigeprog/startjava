public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 24;
        boolean sex = true;
        double height = 1.92d;
        String name = "sergo";
        if (age>20){
        	System.out.println("more than 20");
        }
        if (sex==true){
        	System.out.println("man");
        }
        if (sex==false){
        	System.out.println("woman");
        }
        if ( height<1.80){
        	System.out.println("gnome");
        }
        else
        	System.out.println("giant");


        if (name.startsWith("m")){
        	System.out.println("name starts with M");
        }
        else if (name.startsWith("i")){
        	System.out.println("name starts with I");
        }
        else
        	System.out.println("not I and M");

    }
}