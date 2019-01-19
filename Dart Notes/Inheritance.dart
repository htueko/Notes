
class Animal{
  var name;
  var age;
  var colour;

  void eat(){
    print("$name is eating...");
    print("$name is $age years old.");
  }
  void sleep(){
    print("$name is sleeping...");
    print("$name is $age years old.");
  }
}

class Cat extends Animal{
  void meow(){
    print("meow...");
  }
}

class Dog extends Animal{
  void bark(){
    print("wolf...");
  }
}

void main(List<String> args) {
  var dog = Dog();
  var cat = Cat();
  dog.name = "Bobby";
  dog.age = 12;
  dog.colour = "Brown";
  dog.eat();
  dog.sleep();
  dog.bark();
  cat.name = "Snowy";
  cat.age = 8;
  cat.colour = "Tabby";
  cat.eat();
  cat.sleep();
  cat.meow();
  print(dog.toString());
  print(cat.toString());
  print(dog.hashCode);
  print(cat.hashCode);
}