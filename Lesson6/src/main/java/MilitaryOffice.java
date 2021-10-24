import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;


    public int countOfRecruits() {
        Person[] allPersons = personRegistry.getAllPersons();
        int count = 0;
        for (Person person : allPersons) {
            int age = person.getAge();
            if (age >= 18 && age < 27 && Person.MALE.equals(person.getGender())) {
                count++;
            }
        }
        return count;
    }

    public int findCountOfRecruitsByName(String name) {
        Person[] allPersons = personRegistry.getAllPersons();
        int countName = 0;

        for (Person person : allPersons) {
            String names = person.getName();
            if (person.getName().equals(name)) {
                countName++;
            }
        }
        return countName;
    }

    public int findCountOfRecruitsByAges() {
        Person[] allPersons = personRegistry.getAllPersons();
        int counter = 0;
        for (Person person : allPersons) {
            int age = person.getAge();
            if (age >= 25 && age <= 27 && Person.MALE.equals(person.getGender())) {
                counter++;
            }
        }
        return counter;
    }


    public int findCountOfRecruitsMinsk(String city) {
        Person[] allPersons = personRegistry.getAllPersons();
        int countLiveInMinsk = 0;
        for (Person person : allPersons) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCity().equals(city)) {
                countLiveInMinsk++;
            }
        }
        return countLiveInMinsk;
    }


}

//        Необходимо написать военкомат.
//        1) Создаем класс военкомат MilitaryOffice
//        2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
//        3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
//        4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
//
//        Военкомат должен уметь:
//        a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//        T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//        (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
//        б) вывести количество годных призывников в городе Минске.
//        в) вывести количество призывников от 25 до 27 лет
//        г) вывести количество призывников у которых имя Александр.
//
//        5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
// ArrayList<Person> personRegistry = new ArrayList<>();
//   personRegistry.add(new Person("Artem", 28, "male", new Address("Belarus", "Krichev")))