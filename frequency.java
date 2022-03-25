import java.util.*;
public class frequency
{
public static void main(String args[])
{
int i,size,freq=0,elem;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the size of array");
size= obj.nextInt();
int arr[] = new int[size];
System.out.println("Enter the elements of array");
for(i=0;i<size;i++)
{
arr[i]= obj.nextInt();
}
System.out.println("Enter the number whose index you want to find");
elem= obj.nextInt();
for(i=0;i<size;i++)
{
if(arr[i]==elem)
freq++;
}
System.out.println("Frequency of the number is "+freq);
}
}
