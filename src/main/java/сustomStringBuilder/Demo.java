package сustomStringBuilder;

public class Demo {
    public static void main(String[] args) {
        CustomStringBuilder builder = new CustomStringBuilder();

        builder.append("Hello");
        builder.append(" Java");
        builder.append("!");

        System.out.println(builder);

        builder.undo();
        System.out.println(builder);

        builder.undo();
        System.out.println(builder);
    }
}
