import java.util.HashSet;

public class main {
    public static void main(String[] args ){
        HashSet<String> ai = new HashSet<>();
        ai.add("2");
        ai.add("20");
        ai.add("10");
        System.out.println(ai);
        System.out.println(ai.contains("2"));
        ai.remove(20);
        System.out.println(ai);
    }
}
