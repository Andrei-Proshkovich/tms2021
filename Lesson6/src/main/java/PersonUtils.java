

public class PersonUtils {
    private static final String MALE = "male";

    public static Person[] createPersons() {
        Person[] people = new Person[6];
        {
            Person person = new Person("Konstantin2", 23, MALE, new Address("Belarus", "Minsk"));
            people[0] = person;
        }
        {
            Person person = new Person("Александр", 25, MALE, new Address("Belarus", "Minsk"));
            people[1] = person;
        }
        {
            Person person = new Person("Александр", 26, MALE, new Address("Litva", "Kaunas"));
            people[2] = person;
        }
        {
            Person person = new Person("Вадим", 17, MALE, new Address("Belarus", "Vitebsk"));
            people[3] = person;
        }
        {
            Person person = new Person("Дима", 19, MALE, new Address("Belarus", "Grodno"));
            people[4] = person;
        }
        {
            Person person = new Person("Sveta", 19, Person.FEMALE, new Address("Belarus", "Grodno"));
            people[5] = person;
        }
        return people;
    }
}
