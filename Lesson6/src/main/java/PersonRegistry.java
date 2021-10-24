import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PersonRegistry {

    public Person[] persons;

    public Person[] getAllPersons() {
        return persons;
    }


    public List<Person> getPeople(Address address) {//количество людей проживющих по адресу
        //можно ли с массивом сделать?
        List<Person> peopleList = new ArrayList<>();
        for (Person person : persons) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                peopleList.add(person);
            }
        }
        return peopleList;
    }


}
