public class Fish extends Animal{

    public Fish(String name, String color, int age, String sex){
        super(name, color, age, sex);
    }

    public void swim(){
        System.out.println(name + " swimming...");
    }

    @Override
    public void move() {
        System.out.println(name + " is flapping wings, Oops here is fish.");
    }

}