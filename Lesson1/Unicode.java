import java.io.IOException;

public class Unicode {
    public static void main(String[] args) throws Exception {
            System.out.println("Unicode");
        for (int i = 33; i < 127; i++) {
            char chUnicode = (char) i;
            System.out.println(chUnicode);
        }
    }
}