package makeDog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("멍멍이", "말티즈");
        Dog dog2 = new Dog("초코", "진돗개");
        Dog dog3 = new Dog("뭉치", "푸들");

        System.out.println("첫번째 개의 이름과 종은: " + dog1.name + ", " + dog1.breed);
        System.out.println("두번째 개의 이름과 종은: " + dog2.name + ", " + dog2.breed);
        System.out.println("세번째 개의 이름과 종은: " + dog3.name + ", " + dog3.breed);

    }
}
