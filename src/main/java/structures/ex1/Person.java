package structures.ex1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(Person person) {
//       // inny sposób
//        int result = Integer.compare(age, person.getAge());
//        if (result != 0) {
//            return result;
//        }
        return Integer.compare(age, person.getAge());
    }
}
