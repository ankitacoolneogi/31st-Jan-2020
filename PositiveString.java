import java.util.Scanner;
class PositiveString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a String: ");			//TAKING LIST OF NUMBERS
		String str=new String(scan.next());
		if(chekcPositiveString(str))							//CALLING THE FUCTION TO CHECK POSITIVE
			System.out.println(str +" is a positive string");
		else
			System.out.println(str +" is a negetive string");
	}

	static boolean chekcPositiveString(String s){
		for(int i=0;i<s.length()-1;i++) 
		{
			if(s.charAt(i)>s.charAt(i+1)) //COMPARING CHARACTERS
				return false;
		}
		return true;
	}
}