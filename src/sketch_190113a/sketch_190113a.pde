//1. create an array of ints. don't initialize it yet.
int[] iArr;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(700,700);
  //3. initialize your array with the built in width variable
  iArr = new int[width];
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int i = 0; i < iArr.length; i++)
  {
    iArr[i] = round(random(height + 1));
  }
  
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(100,200,5);
  //7. set the color for your graph
  fill(100,200,200);
  //8. draw a rectangle for each int in your array.
  //   the x value will be the current index in the array
  //   the y value will the height variable
  //   the width is 1 (one)
  //   the height is negative the value of the element at the current index of the array
  for (int i = 0; i < iArr.length; i++)
  {
    rect(i,height,1,-iArr[i]);
  }

  //9. call the stepSort method
  stepSort(iArr);
  //10. extract the code that randomizes the array into a method.
  
  //11. call the method you made in step 10 when the mouse is pressed
  if (mousePressed == true)
  {
    randomize();
  }
}

void randomize()
{
 for(int i = 0; i < iArr.length; i++)
  {
    iArr[i] = round(random(height + 1));
  } 
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}