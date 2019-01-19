// closures

main(List<String> args) {

  String message = "Hello World";
  Function showMessage = (){
    message = "Welcome Dart";
    print(message);
  }; 
  print(message);
  showMessage();

  Function speak = () {
    String msg = "Hello";
    Function spoke = (){
      msg = "Did I just said Hello?";
      print(msg);
    };
    return spoke;
  };
  var saySomething = speak();
  saySomething();
}

