class Shape
{
void printt()
{
System.out.println("This is a Shape ");
}
}
class Circle extends Shape
{
void printt()
{
System.out.println("This is a Circle ");
}
}
class Rectangle extends Shape
{
void printt()
{
super.printt();

System.out.println("This is a Rectangle ");
}
}



class Square extends Rectangle
{
void printt()
{
super.printt();

//System.out.println("Square is a Rectangle ");
}
}
class Driver
{
public static void main(String args[])
{
Square s=new Square();
s.printt();
}
}