// way of interface in dart

main(List<String> args) {
  var bird = Bird();
  bird.fly();
  var chicken = Chicken();
  chicken.fly();
  var eagle = Eagle();
  eagle.fly();
}

class Flyable{
  void fly(){
    print("Flying...");
  }
} 

class Chicken implements Flyable{
  @override
  void fly() {
    print("3 feets above the ground");
  }

}

class Eagle implements Flyable{
  @override
  void fly() {
    print("Flying likes an Eagle...");
  }

}

class Bird extends Flyable{

}