package Lesson9.task2;


public class Human {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }


    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }


    public void putOnAll() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOffAll() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

}
