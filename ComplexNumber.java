import java.util.Scanner;
class Complex
{
int r1,im1,r2,im2;
int R,M;
Complex(int e, int f, int g, int h)
{
r1=e;
im1=f;
r2=g;
im2=h;
}
void add()
{
R=r1+r2;
M=im1+im2;
}
void sub()
{
R=r1-r2;
M=im1-im2;
}
void product()
{
R=((r1*r2)-(im1*im2));
M=((r1*im2)+(im1*r1));
}
void printComplex()
{
if(R==0&&M!=0)
{
System.out.println(M+"i");
}
else if(M==0&&R!=0)
{
System.out.println(R);
}
else
{
System.out.println(R+"+"+M+"i");
}
}
}

public class ComplexNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter the real and imaginary part of the first complex number:\n ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter the real and imaginary part of the second complex number:\n ");
c=sc.nextInt();
d=sc.nextInt();
Complex C=new Complex(a,b,c,d);
System.out.println("Sum of complex numbers is: ");
C.add();
C.printComplex();
System.out.println("Diff of complex numbers is: ");
C.sub();
C.printComplex();
System.out.println("Product of complex numbers is: ");
C.product();
C.printComplex();
}
}
