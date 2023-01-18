package JavaProject;

//OOPS Concepts
	class One {

		public void display() {

		System.out.println("One");

		}

		}

		//inheritance

		class Two extends One {

		@Override

		public void display() {

		System.out.println("Two");

		}

		public int add(int x, int y) {

		return x+y;

		}

		//Overload

		public double add(double x,double y) {

		return x+y;

		}

		}

		//encapsulation example

		class EncapTest {

		private String name;

		public String getName() {

		return name;

		}

		public void setName(String newName) {

		name = newName;

		}

		}

		//abstraction

		abstract class TwoWheeler {

		public abstract void run();

		}

		class Honda extends TwoWheeler{

		public void run(){

		System.out.println("\nbike is Running..");

		}

		}

		class MainClass {

		public static void main(String[] args) {

		One a=new One();

		a.display();

		Two b=new Two();

		b.display();

		System.out.println(b.add(4,2));

		System.out.println(b.add(5.,2.)); //polymorphism

		EncapTest encap = new EncapTest();

		encap.setName("Sandeep's");

		System.out.print("Name : " + encap.getName() );

		TwoWheeler test = new Honda();

		test.run();

//Arithematic operators
	//public static void main(String[] args) {
		System.out.println("Arithematic operators are:");
		int a1 = 20;
		int b1 = 10;
		int sum = a1+b1;
		System.out.println("Sum is: "+(sum));
		System.out.println("Substraction is:" +(a1-b1));
		System.out.println("Multiplication is:" +(a1*b1));
		System.out.println("Division is:" +(a1/b1));
		System.out.println("Modulo is:" +(a1%b1));

//Assignment Operators
		    int x = 35;
		    x += 3;
		    System.out.println("The Result is:" +(x));

		    int num = 5;
		    num-= 3;
		    System.out.println(num);

		    int Y = 5;
		    Y*= 3;
		    System.out.println(Y);

		    int number= 60;
		    number/=10;
		    System.out.println(number);

		    int n = 5;
		    n >>= 3;
		    System.out.println(n);

		    int R = 5;
		    R <<= 1;
		    System.out.println(R);

		    int K = 10;
		    K ^= 2;
		    System.out.println(K);



//comparison operators
int a11 = 4;
int b11 = 5;
System.out.println(a11>b11);

 int M = 10;
 int N = 5;
 System.out.println(M<N);

 int k = 3;
 int L = 3;
 System.out.println(K == L); 

 int p = 5;
 int q = 3;
 System.out.println(p != q);

 int S = 5;
 int T = 3;
 System.out.println(S >= T);

 int num1 = 5;
 int num2 = 3;
 System.out.println(num1 <= num2);

//Logical operators
int N1 = 20;
System.out.println("The Result of AND is:" + (x > 6 && x < 10));

int Y1 = 17;
System.out.println("The result of OR is:" + (Y1 > 3 || Y1 < 4)); 

int Z = 5;
System.out.println("The result of NOT is:" +!(Z > 3 && Z < 10));

//Array
int a111[]=new int[5];//declaration and instantiation  
a111[0]=10;//initialization  
a111[1]=20;  
a111[2]=70;  
a111[3]=40;  
a111[4]=50;  
//traversing array  
for(int i=0;i<a111.length;i++)//length is the property of array  
System.out.println(a111[i]);  

//for loop
int i;
for(i=1; i<=5; i=i+1)
{
    System.out.println("Welcome to Edubridge");
}

//while loop
int O = 1;
while(O<=5)
{
    System.out.println("Hello World");
O=O+1;

//do while loop
int var=1;
do
{
    System.out.println(var);
    var=var+1;
}
while(var<=10);

//break statement
int i1;
for(i1=2; i1<=50; i1=i1+2)
{
    if(i1==10)
    {
        break;
    }
    System.out.print(i1 + " ");
}
}
		}
		}
