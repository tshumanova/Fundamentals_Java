package Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P03_OpinionPoll {
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();
        int lines = Integer.parseInt(scanner.nextLine());
        for (int line = 1; line <= lines; line++) {
            String personalInformation = scanner.nextLine();
            String name = personalInformation.split(" ")[0];
            int age = Integer.parseInt(personalInformation.split(" ")[1]);
            Person person = new Person(name, age);
            if (age > 30) {
                listOfPeople.add(person);

            }
        }


        for (Person person : listOfPeople) {
            System.out.println(person.getName() + " - " + person.getAge());

        }
    }
}
