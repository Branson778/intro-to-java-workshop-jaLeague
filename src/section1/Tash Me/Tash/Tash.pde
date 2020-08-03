PImage mustache;
PImage smile;
void setup() {
 smile = loadImage("smile.jpg");
 mustache = loadImage("tash.png");
 size(800,800);
 smile.resize(width,height);
}

void draw() {
background(smile); 
if(mousePressed){
image(mustache, 300,350);
}}
