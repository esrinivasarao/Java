
public class StringEqualsEx {

	String name;
	int rno; 
	public StringEqualsEx(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s1 = new String( "Harsha");
		String s2 = new String( "Harsha"); 
		String s5="Harsha";
		
		StringBuffer s6 = new StringBuffer( "Harsha");
		StringBuffer s7 = new StringBuffer( "Harsha");
		
		StringEqualsEx s3 = new StringEqualsEx( "Harsha",102); 
		StringEqualsEx s4 = new StringEqualsEx( "Harsha",102); 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s5));
		
		System.out.println(s6.equals(s7));
		System.out.println(s1.equals(s7));
		
		System.out.println(s1==s2);
		
		System.out.println(s3.equals(s4));
	}

}
