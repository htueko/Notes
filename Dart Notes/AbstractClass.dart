// abstract class 

main(List<String> args) {
  var canvas = Canvas();
  canvas.draw();
  canvas.normalDraw();
}

abstract class Shape{
  int x;
  int y;
  void draw();
  void normalDraw(){
    print("Start from $x to $y");
  }
}

class Canvas extends Shape{
  @override
  void draw() {
    print("Drawing the shape of the canvas");
  }

}
  
