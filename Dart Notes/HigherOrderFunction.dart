// higher order function

main(List<String> args) {
  performTask();
}

Function performTask(){
  return (int number) => number * 4;
}