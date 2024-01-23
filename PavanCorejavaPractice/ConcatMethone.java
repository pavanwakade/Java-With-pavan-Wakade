package pavaaaaaan;

public class ConcatMethone {

	public static void main(String[] args)
	{
		//Method 1
		String S1="WELLCOME to";
		String S2="HOME";
		System.out.println(S1.concat(" ").concat(S2));
		
		
		//Method 2
		String S="WELLCOME to ";
		String S3="HOME";
		String S4=S.concat(S3);
		System.out.println(S4);
	}

}