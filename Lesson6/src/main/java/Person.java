import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
class Person {
    private String name;
    private int age;
    private String gender = FEMALE;
    private Address address;
    public static final String MALE = "male";
    public static final String FEMALE = "female";


    public void setName(String name) {
        if (age > 18) {
            this.name = name;
        } else {
            System.out.println("когда 18 будет приходите");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}

