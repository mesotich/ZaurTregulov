package spring_introduction;

public class Person {

    private Pet pet;

    public Person() {
    }

    public Person(Pet pet) {
        System.out.println("Person been is created");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callMyPet() {
        System.out.println("Hello, me lovely pet!");
        pet.say();
    }
}
