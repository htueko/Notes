// lambda

import 'dart:core';



main(List<String> args) {
  subtractTwoNumbers(1,2);
  mulitplyTwoNumbers(1,2);
}

// normal function
int addTwoNumbers(var i, var j) {
  return i +j;
}

// lambda function style one
Function subtractTwoNumbers = (var i, var j){
  var result = i - j;
  print(result);
};

// lambda function sytle two
Function mulitplyTwoNumbers = (int i, int j) => print(i * j);