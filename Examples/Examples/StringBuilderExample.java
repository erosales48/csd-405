package Examples;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        System.out.println(sb.toString());  // Output: Hello World!

        sb.insert(6, "Beautiful ");
        System.out.println(sb.toString());  // Output: Hello Beautiful World!

        sb.delete(6, 16);
        System.out.println(sb.toString());  // Output: Hello World!
    }
}
