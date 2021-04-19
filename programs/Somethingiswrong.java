package jp;
 class Example
{
	public int width;
	public int height;

	public int area()
	{
		return width*height;
	}
}

public class Somethingiswrong {
	
	public static void main(String args[]) {
	
    Example myRect = new Example();
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());


}
}