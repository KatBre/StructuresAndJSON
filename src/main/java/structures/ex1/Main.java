package structures.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Jurek", "Ogórek", 23);
        Person p2 = new Person("Marta", "Nowak", 48);
        Person p3 = new Person("Ola", "Fasola", 54);
        Person p4 = new Person("Marian", "Kowalski", 38);
        Person p5 = new Person("Antoni", "Bomba", 12);
        Person p6 = new Person("Franek", "Kimono", 74);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.forEach(System.out::println);
        System.out.println();

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return Integer.compare(p1.getAge(), p2.getAge());
//            }
//        });

        Collections.sort(list); // w przypadku comparable nie jest wymagany comparator

        list.forEach(System.out::println);
        System.out.println();
    }
}