
void setup() {

  // set the size of your sketch
  size(500, 500);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int ellipseSize = 480;
  for (int i = 2; i < 10; i++) {
    ellipse(250, 250, ellipseSize, ellipseSize);
    ellipseSize = ellipseSize - 60;
    //Use an if statement and modulo to alternate the color of your rings.
    if (i%2 == 0) {
      fill(255, 0, 0);
    } else {
      fill(0, 0, 0);
    }
  }
}
