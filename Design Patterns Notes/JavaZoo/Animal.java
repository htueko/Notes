public abstract class Animal {

    String name;
    String color;
    int age;
    String sex;

    public Animal(){
        // empty constructor
    }

    public Animal(String name, String color, int age, String sex){
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    public void eat(){
        System.out.println(name + " can eat");
    }

    public void sleep(){
        System.out.println(name + " can sleep");
    }

    public abstract void move();

    @Override
    public String toString() {
        return name + " name,\n " +
        age + " years old,\n" + 
        color + " colour,\n" +
        sex + " sex.";
    }

}