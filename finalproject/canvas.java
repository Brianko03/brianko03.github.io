PImage imgGSW = loadImage("warriorslogo.jpg");
PImage imgHR = loadImage("houston");
void setup(){
 size (400, 400);
  background (0, 0, 0);
}

void draw (){
  smallBracket(40, 90);
  smallBracket(40, 255);
  bigBracket(95, 117.5);
  reflectedSmall(305, 90);
  reflectedSmall(305, 255);
  reflectedBig(250, 117.5);
  line(150, 200, 250, 200);
}
void smallBracket(x, y){
  fill(255, 255, 255)
  line(x, y, x + 55, y);
  stroke(255);
  line(x + 55, y, x + 55, y + 65);
  stroke(255);
  line(x, y + 65, x + 55, y +65);
}
void bigBracket(x, y){
  fill(255, 255, 255)
  line(x, y, x + 55, y);
  stroke(255);
  line(x + 55, y, x + 55, y + 170);
  stroke(255);
  line(x, y + 170, x + 55, y + 170);
}
void reflectedSmall(x, y){
  fill(255, 255, 255)
  line(x, y, x + 55, y);
  stroke(255);
  line(x, y, x, y + 65);
  stroke(255);
  line(x, y + 65, x + 55, y +65);
}
void reflectedBig(x, y){
  fill(255, 255, 255)
  line(x, y, x + 55, y);
  stroke(255);
  line(x, y, x, y + 170);
  stroke(255);
  line(x, y + 170, x + 55, y + 170);
}
