public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, String color, int age, String sex){
        super(name, color, age, sex);
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly high and quick");
    }

}