package makeDog;

public class Dog {

    private final String name;
    private final String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String step() {
        System.out.println(name + "가 걸어갑니다.");
        return name;
    }
}
