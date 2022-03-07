import java.util.Scanner;
class Box
{
	float width,height,depth;
	Box(Box ob)						//constructor with clone of object as arguments
	{
		this.width=ob.width;
		this.height=ob.height;
		this.depth=ob.depth;
	}
	Box(float width,float height,float depth)		//parameterized constructor
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Box()						//non parameterized constructor
	{	
		SetWHD();
	}
	void display()
	{
		System.out.println("Volume is:"+(GetWHD('w')*GetWHD('h')*GetWHD('d')));
	}
	void SetWHD()			//method to set the values of Width,Height and Depth
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Input Width:");
		width=s.nextFloat();
		System.out.println("Input Height:");
		height=s.nextFloat();
		System.out.println("Input Depth:");
		depth=s.nextFloat();
	}

	float GetWHD(char a)          //method to return the values of Width,Height and Depth
	{	
                a = Character.toLowerCase(a);
		if(a=='w')
			return width;
		else if(a=='h')
			return height;
		else if(a=='d')
			return depth;
		else
			return 0;
	}

}

class BoxWeight extends Box  //Boxweight class inherits Box class
{
	float weight;
	BoxWeight(BoxWeight ob,Box ob1)   //constructor with object as argument
	{	
		super(ob1);                //calls constructor of superclass
		this.weight=ob.weight;
	}

	BoxWeight(float weight,float height,float depth,float width)  //parameterized constructor
	{	
		super(width,height,depth); //calls constructor of superclass
		this.weight=weight;
	}
	BoxWeight()       
	{	
		super();   //calls constructor of superclass
		SetWeight();
	}
	void SetWeight()      //inputs the value of weight from user
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Input the weight of the box:");
		weight=s.nextFloat();
	}
	float GetWeight()    //returns the value of weight
	{
		return weight;
	}
	void displayw()     //prints the value of weight
	{
		System.out.println("The Weight of the box is:"+GetWeight());
	}
}

class BoxWeightDemo
{
	public static void main(String Art3mis[])
	{
		BoxWeight ob=new BoxWeight(4,1,2,3); //object 1 of BoxWeight
		BoxWeight ob1=ob;                    //object 2 of BoxWeight initialized with the value of object 1
		BoxWeight ob2=new BoxWeight();		 //object 3 of BoxWeight
		ob.display();
		ob.displayw();
		ob1.display();
		ob1.displayw();
		ob2.display();
		ob2.displayw();
	}
}
