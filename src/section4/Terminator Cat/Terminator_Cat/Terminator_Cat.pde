PImage catPic;
int x=333;
int y=211;
int acceleration=5;
void setup() {
  size(800, 750);
  catPic = loadImage("bigeyedcat.png");
  catPic.resize(800, 750);
  background(catPic);
}
void draw() {
  if (x>=800){
    x=333;
    y=211;
    background(catPic);
  }
  if (mousePressed) {

    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  noStroke();
  fill(#FF0000);
  ellipse(x + 213, y, 99, 99);
  ellipse(x, y, 99, 99);
}
void keyPressed() {

  x+=2*acceleration;

  y+=2*acceleration;
  
}
