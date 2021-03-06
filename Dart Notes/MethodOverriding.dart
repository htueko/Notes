// overriding

class Animal{
  String name;
  String colour;
  int age;
  void eat(){
    print("$name is eating...");
  }
  void speak(){
    print("$name is speaking");
  }
}

class Cat extends Animal{
  @override
    void speak() {
      super.speak();
      print("$name is meowing...");
    }
}

main(List<String> args) {
  var cat = Cat();
  cat.name = "Snowy";
  cat.eat();
  cat.speak();
}