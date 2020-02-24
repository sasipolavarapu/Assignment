package collections;
import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		UserMainCode um=new UserMainCode();
		String s1=um.reshape(s,c);
		System.out.println("Reshaped string:"+s1);
		

	}

}
class UserMainCode{
	static String reshape(String s,char c){
		
		ArrayList al=new ArrayList();
		for(int i=0;i<s.length();i++){
			al.add(s.charAt(i));
			if(i==s.length()-1){
				
			}
			else{
			al.add("-");
			}
		}
		/*String s1=null;
		for(Object i:al){
		s1.concat(i);
		}*/
		String s1=al.toString();
		return s1;
	}
}
