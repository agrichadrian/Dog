package Dog;

public class MainTestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Naruto",2);
        Dog d2 = new Dog("JoJo",7);
        Dog d3 = new Dog("Stalin");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
