package LinkedList.Teory;

public class App {
    public static void main(String[] args) {

        LinkedList<Person> people = new LinkedList<>();
        Person person = new Person(10, "A");
        people.insert(person);
        people.insert(new Person(20, "B"));
        people.insert(new Person(30, "C"));
        people.insert(new Person(40, "D"));


        people.traverse();
        System.out.println("*****************************");
        people.remove(person);
        people.traverse();

    }
}
