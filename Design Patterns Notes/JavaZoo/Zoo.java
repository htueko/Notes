public class Zoo{

    public static void main(String[] args) {
        
        Bird eagle = new Bird("eagle", "brown", 12, "male");
        Fish fishy = new Fish("fishy", "golden", 4, "female");
        eagle.eat();
        eagle.sleep();
        eagle.toString();

        fishy.eat();
        fishy.sleep();
        fishy.swim();
        fishy.toString();

        Chicken chicken = new Chicken("chick", "red green", 5, "male");
        chicken.sleep();
        chicken.eat();
        chicken.toString();

        Sparrow sparrow = new Sparrow("jack", "dark brown", 2, "female");
        sparrow.fly();
        sparrow.toString();

        Animal flappy = new Sparrow("Flappy Sparrow", "Spinkle", 3, "male");
        flappy.eat();
        flappy.move();
        
        fishy.move();
        chicken.move();

        System.out.println("------------------------");

        moveAnimals(eagle);
        moveAnimals(fishy);
        moveAnimals(chicken);
        moveAnimals(sparrow);
        moveAnimals(flappy);

    }

    public static void moveAnimals(Animal animal) {
        animal.move();
    }

}