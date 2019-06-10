PImage imgGSW = loadImage("Pictures/warriorslogo.jpg");
PImage imgHR = loadImage("Pictures/houstonlogo.jpg");
PImage imgB = loadImage("Pictures/blazerslogo.jpg");
PImage imgBu = loadImage("Pictures/buckslogo.jpeg");
PImage imgR = loadImage("Pictures/raptorslogo.png");
PImage imgN = loadImage("Pictures/nuggetslogo.png");
PImage imgC = loadImage("Pictures/celticslogo.jpg");
PImage imgS = loadImage("Pictures/76logo.png");

void setup(){
 size (400, 400);
 background (0, 0, 0);
}

int GSx = 40;
int GSy = 90;
int Bx = 40;
int By = 255;
int buX = 360;
int buY = 90;
int rX = 360;
int rY = 320;
int hX = 40;
int hY = 155;
int nX = 40;
int nY = 320;
int cX = 360;
int cY = 155;
int sX = 360;
int sY = 255;

void draw (){
  imageMode(CENTER);
  background(0, 0, 0);
  smallBracket(40, 90);
  smallBracket(40, 255);
  bigBracket(95, 117.5);
  reflectedSmall(305, 90);
  reflectedSmall(305, 255);
  reflectedBig(250, 117.5);
  line(150, 200, 250, 200);
  image(imgGSW, GSx, GSy, 40, 40);
  image(imgB, Bx, By, 40, 40);
  image(imgBu, buX, buY, 40, 40);
  image(imgR, rX, rY, 40, 40);
  image(imgHR, hX, hY, 40, 40);
  image(imgN, nX, nY, 40, 40);
  image(imgC, cX, cY, 40, 40);
  image(imgS, sX, sY, 40, 40);
  GSpath(95, 113.5);
  if (GSy > 113){
    GSpath(150, 198.5);
  }
  pPath(95, 282.5);
  bPath(305, 113.5);
  rPath(305, 282.5);
  if (rY < 283){
    rPath(250, 198.5);
  }
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
void GSpath(x, y){
  if (GSx < x){
    GSx += 1;
  }
  else if (GSy < y){
    GSy += 1;
  }
}
void pPath(x, y){
  if (Bx < x){
    Bx += 1;
  }
  else if (By < y){
    By += 1;
  }
}
void bPath(x, y){
  if (buX > x){
    buX -= 1;
  }
  else if (buY < y){
    buY += 1;
  }
}
void rPath(x, y){
  if (rX > x){
    rX -= 1;
  }
  else if (rY > y){
    rY -= 1;
  }
}PImage imgGSW = loadImage("Pictures/warriorslogo.jpg");
PImage imgHR = loadImage("Pictures/houstonlogo.jpg");
PImage imgB = loadImage("Pictures/blazerslogo.jpg");
PImage imgBu = loadImage("Pictures/buckslogo.jpeg");
PImage imgR = loadImage("Pictures/raptorslogo.png");
PImage imgN = loadImage("Pictures/nuggetslogo.png");
PImage imgC = loadImage("Pictures/celticslogo.jpg");
PImage imgS = loadImage("Pictures/76logo.png");

void setup(){
 size (400, 400);
 background (0, 0, 0);
}

int GSx = 40;
int GSy = 90;
int Bx = 40;
int By = 255;
int buX = 360;
int buY = 90;
int rX = 360;
int rY = 320;
int hX = 40;
int hY = 155;
int nX = 40;
int nY = 320;
int cX = 360;
int cY = 155;
int sX = 360;
int sY = 255;

void draw (){
  imageMode(CENTER);
  background(0, 0, 0);
  smallBracket(40, 90);
  smallBracket(40, 255);
  bigBracket(95, 117.5);
  reflectedSmall(305, 90);
  reflectedSmall(305, 255);
  reflectedBig(250, 117.5);
  line(150, 200, 250, 200);
  image(imgGSW, GSx, GSy, 40, 40);
  image(imgB, Bx, By, 40, 40);
  image(imgBu, buX, buY, 40, 40);
  image(imgR, rX, rY, 40, 40);
  image(imgHR, hX, hY, 40, 40);
  image(imgN, nX, nY, 40, 40);
  image(imgC, cX, cY, 40, 40);
  image(imgS, sX, sY, 40, 40);
  GSpath(95, 113.5);
  if (GSy > 113){
    GSpath(150, 198.5);
  }
  pPath(95, 282.5);
  bPath(305, 113.5);
  rPath(305, 282.5);
  if (rY < 283){
    rPath(250, 198.5);
  }
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
void GSpath(x, y){
  if (GSx < x){
    GSx += 1;
  }
  else if (GSy < y){
    GSy += 1;
  }
}
void pPath(x, y){
  if (Bx < x){
    Bx += 1;
  }
  else if (By < y){
    By += 1;
  }
}
void bPath(x, y){
  if (buX > x){
    buX -= 1;
  }
  else if (buY < y){
    buY += 1;
  }
}
void rPath(x, y){
  if (rX > x){
    rX -= 1;
  }
  else if (rY > y){
    rY -= 1;
  }
}
