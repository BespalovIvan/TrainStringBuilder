public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.insert(0,"World",0,5);
        System.out.println(builder);
    }
}