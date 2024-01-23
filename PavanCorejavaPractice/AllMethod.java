package pavaaaaaan;

public class AllMethod {

	public static void main(String[] args) {
		String s="pavan";
		System.out.println("s ="+s);
		int length=s.length();
		System.out.println("s length ="+length);
		System.out.println("s lower case ="+s.toLowerCase());
		System.out.println("s upper case ="+s.toUpperCase());
		System.out.println("s replace p to q ="+s.replace('p','q'));
		System.out.println("s index ="+s.indexOf('v'));
		System.out.println("s Lastindex ="+s.lastIndexOf('v'));
		String s1="Soni";
		System.out.println("s1 ="+s1);
		System.out.println("s1 and s2 trim ="+s.trim()+s1.trim());
		System.out.println("s and s1 equals ="+s.equals(s1));
		System.out.println("s and s1 equalsIgnoecase ="+s.equalsIgnoreCase(s1));
		System.out.println("s and s1 compareto ="+s.compareTo(s1));
		System.out.println("s concat s1 ="+s.concat(s1));
		System.out.println("s substring ="+s1.substring(3));
		System.out.println("s tostring ="+s1.toString());
		int i=1000;
		System.out.println("s value of length ="+s.valueOf(i).length());
		System.out.println("s and s1 equals ="+s.startsWith("o"));
		System.out.println("s and s1 equals ="+s1.startsWith("a"));
	}

}
