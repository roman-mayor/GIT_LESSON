import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("this is first class");
        System.out.println("this is change!"); //new changes

        String s = "GIT";
        String[]array = s.split("");
        for (String string : array) {
            System.out.print(string + " ");
        }
        NewClass nc = new NewClass();
        System.out.println(nc.s); //new changes 2.0
    }
}

class NewClass{
    final String s = "GIT";
}

class SecondClass{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,4));
        for (Integer i : list) {
            System.out.println(++i);
        }
    }
}
