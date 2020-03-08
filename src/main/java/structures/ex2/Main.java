package structures.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Offer o1 = new Offer("kredki", 2.5);
        Offer o2 = new Offer("lalka", 11.8);
        Offer o3 = new Offer("piłka", 4.9);
        Offer o4 = new Offer("auto", 22.6);
        Offer o5 = new Offer("wiaderko", 3.4);

        List<Offer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);

        list.forEach(System.out::println);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("What's your choice");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("list")) {
                list.forEach(System.out::println);

            } else if (choice.equalsIgnoreCase(" sort decreasing")) {
                Collections.sort(list, new OfferComparator(true));
            } else if (choice.equalsIgnoreCase("sort increasing")) {
                Collections.sort(list, new OfferComparator(false));
            } else if (choice.startsWith("add")) {
                //TODO: dodawanie produktów
//                // drugi sposób
//                String[] words = choice.split(" ");
//                String name = words[1];
//                Double price = Double.parseDouble(words[2]);
//                Offer offer = new Offer(name, price);
//                list.add(offer);
//                System.out.println("Added" + offer);
                list.add(new Offer(scanner.nextLine(), Double.valueOf(scanner.nextLine())));
            } else if (!choice.equalsIgnoreCase("quit")) {
                System.err.println("Unknown choice");
            }
        } while (!choice.equalsIgnoreCase("quit"));


    }
}
