package pavaaaaaan;
 
public class MethodsINWrapperClass {

        public static void main(String[] args) {
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Entger the base of trangle ");	
//    	int a=sc.nextInt();
    	
    int a=95;
  String b="95";
   Integer ii=new Integer(a);
  System.out.println("to String = "+Integer.toString(a));
  
  System.out.println("to String = "+Integer.toHexString(a));
  
   System.out.println("to String = "+Integer.toOctalString(a));
   
   System.out.println("to String = "+Integer.toBinaryString(a));
   
    System.out.println("to String = "+Integer.valueOf(a));
 
    Integer jj= Integer.parseInt(b);
    System.out.println("parseInt(B)= " +jj);
    
//    int c= Integer.getInteger("pavan.kedar.sonali");   //error
//    System.out.println(c);
    
    
        }
    }
