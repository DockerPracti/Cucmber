package Practise;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   String s ="hema";
		   
		   String reverse = "";
		   
		   
		   for(int i =0; i<s.length(); i++){
		    reverse=  s.charAt(i) + reverse;
		   }
		   System.out.println(reverse);
		

	}

}
