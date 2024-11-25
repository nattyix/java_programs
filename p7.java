import java.util.Scanner;
// Interface Resizable
interface Resizable {
void resizeWidth(int width); void
resizeHeight(int height);
}
// Class Rectangle implementing Resizable
class Rectangle implements Resizable {
private int width; private
int height;
// Constructor
public Rectangle(int width, int height) {
this.width = width;
this.height = height;
}
// Method to resize the width
@Override
public void resizeWidth(int newWidth) {
this.width = newWidth;
System.out.println(&quot;New width: &quot; + width);
}
// Method to resize the height
@Override
public void resizeHeight(int newHeight) { this.height
= newHeight; System.out.println(&quot;New height: &quot; +
height);
}

// Method to display the current dimensions of the rectangle
public void displayDimensions() {
System.out.println(&quot;Current dimensions: &quot; + width + &quot; x &quot; +
height);
}
}
// Main class to test the program
public class p7{
public static void main(String[] args) {
// Create a rectangle with width 10 and height 5
Scanner sc=new Scanner(System.in);
Rectangle rectangle = new Rectangle(10,5) ;
rectangle.displayDimensions();
// Resize the rectangle&#39;s width and height
System.out.println(&quot;Enter the new width and height&quot;);
int w=sc.nextInt();
int h=sc.nextInt();
rectangle.resizeWidth(w);
rectangle.resizeHeight(h);
rectangle.displayDimensions();
}
}
