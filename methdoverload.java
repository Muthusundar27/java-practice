class Calculator{
    int num; // instance variable
   public int add(int n1, int n2)//local variable 
   {
   return n1+n2;
}
public int add(int n1, int n2, int n3){
    return n1+n2+n3;
 }
public double add(Double n1, int n2){
    return n1+n2;
 }
}


public class methdoverload {
    public static void main(String args[])
    {
Calculator calc = new Calculator();
int r = calc.add(2, 7,1);
System.out.println(r);
    }
}
