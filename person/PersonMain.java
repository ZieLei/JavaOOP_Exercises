package person;

public class PersonMain {
    public static void main(String[] args) {
        
        Person person1 = new Person("John", 4);

        System.out.println("Person: " + person1.getName() + " Age: " + person1.getAge());
    }
}
