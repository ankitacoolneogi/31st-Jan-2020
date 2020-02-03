import java.util.Scanner;
class SeekingJob{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the username: (8 characters then _job) ");			
		String str=new String(scan.next());
		if(validateUName(str))
			System.out.println("Valid User Name");
		else
			System.out.println("Not a valid User Name");

	}

	static boolean validateUName(String str){
			int len=str.length();
			int before_job_len=len-4;
			String job=new String("_job");
			String subone=str.substring(0,before_job_len);
			String subtwo=str.substring(before_job_len,len);
			if(subtwo.matches(job)&&(subone.length()>7))
				return true;
			return false;

	}
}