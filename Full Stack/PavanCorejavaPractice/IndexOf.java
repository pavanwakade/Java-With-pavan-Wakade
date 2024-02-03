package pavaaaaaan;

public class IndexOf {

	public static void main(String[] args) {
		String s="StudyTonight";
		System.out.println(s.indexOf('u'));
		System.out.println(s.indexOf('t',3));
		String subString="Ton";
		System.out.println(s.indexOf(subString));
		System.out.println(s.indexOf(subString,7));
	}

}
