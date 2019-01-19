public class Bird extends Animal{

    public Bird(String name, String color, int age, String sex){
        super(name, color, age, sex);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

}