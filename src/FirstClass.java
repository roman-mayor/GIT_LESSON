public class FirstClass {
    public static void main(String[] args) {
        System.out.println("this is first class");
        System.out.println("this is change"); //new changes
        NewClass nc = new NewClass();
        System.out.println(nc.s); //new changes 2.0
    }
}

class NewClass{
    final String s = "GIT";
}
