package pavaaaaaan;

public class DecodeInwrapper {

    public static void main(String[] args) {  
	String a="55";
	String b="004";
	String c="0x0f";
	 Integer a1= Integer.decode(a);
	 System.out.println("decode of "+a +" is = "+a1);
	 
	 a1= Integer.decode(b);
	 System.out.println("decode of "+b +" is = "+a1);
	 
	 a1= Integer.decode(c);
	 System.out.println("decode of "+c +" is = "+a1);
    }

}
