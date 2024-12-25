package Stack.Theory;

public class App {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("AAA");
        names.push("BBB");
        names.push("CCC");

//        while (!names.isEmpty()) {
//            System.out.println(names.pop());
//        }
        System.out.println(names.size());
    }
}
