public class karekok{

public static void main (String[] args) {
BufferedReader stdin = ("new BufferedReader");
        (new InputStreamReader(System.in));
double root1, root2; 
double rootca, rootcb; 

System.out.println("Enter the coefficient of x^2 :");
int a=Integer.parseInt(stdin.getLine());

System.out.println("Enter the coefficient of x :");
int b=Integer.parseInt(stdin.getLine());

System.out.println("Enter the constant value :");
int c=Integer.parseInt(stdin.getLine());

double delta;

if (delta < 0)
delta = 4*a*c - b*b;
else
delta = b*b - 4*a*c;

double deltasqrt = Math.sqrt(delta);



if (delta > 0)
{
	root1 = ((-b) + deltasqrt)/(2*a);
	root1 = ((-b) - deltasqrt)/(2*a);
}
else if (delta == 0)
{
	root1 = (-b)/(2*a);
	root2 = root1;
}
else if (delta < 0) 
{
	rootca = (-b)/(2*a);
	rootcb = (deltasqrt)/(2*a);
}

if (delta < 0)
	System.out.println("The roots are : +rootca+ + +rootcb and +rootca+ - +rootcb");
else
	System.out.println("The roots are : +root1+ and +root2");
}
}
