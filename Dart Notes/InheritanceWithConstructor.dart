// inheritance with constructors

main(List<String> args) {
  var cat = Cat("Lucky", 2, "Ginger", "Female");
  cat.sex = "Male";
  print(cat.name);
  print(cat.age);
  print(cat.colour);
  print(cat.sex);
}

class Animal{
  var name;
  var age;
  var colour;
  // 1 default constructor 
  // Animal(){
  //   print("Animal constructor");
  // }
  Animal(var name, var age, var colour){
    this.name = name;
    this.age = age;
    this.colour = colour;
  }
}

class Cat extends Animal{
  var sex;
  Cat(var name,var age,var colour, var sex) : super(name, age, colour){
    this.sex = sex;
    print("Cat constructor");
  }
}