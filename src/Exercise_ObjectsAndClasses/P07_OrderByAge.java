package Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P07_OrderByAge {

    public static class Person {
        private String name;
        private String id;
        private int age;

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;


        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String persinInformation = scanner.nextLine();
        List<Person> listOfPeople = new ArrayList<>();
        while (!persinInformation.equals("End")) {
            String name = persinInformation.split(" ")[0];
            String id = persinInformation.split(" ")[1];
            int age = Integer.parseInt(persinInformation.split(" ")[2]);

            Person person = new Person(name, id, age);
            listOfPeople.add(person);
            persinInformation = scanner.nextLine();
        }
        listOfPeople.sort(Comparator.comparing(Person::getAge));
        for (Person person : listOfPeople) {
            System.out.println(person);
        }
    }
}
