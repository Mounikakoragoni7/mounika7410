package mounika;

import java.util.Scanner;

public class login {

	public static void main(String[] args) throws InterruptedException {
Scanner sc=new Scanner(System.in);
String user="mounika";
String pass="Test@123";
for(int i=1;i<=6;i++) {
	System.out.println("Enter Username");
	String userName=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	if(user.equals(userName)&&pass.equals(password))
	{
		System.out.println("welcome");
		break;
	}
		else if(i==4) {
			Thread.sleep(5000);
		}
		else if(i==6)
		{
			System.out.println("checking blocked");
		}
		else {
			System.out.println("try again");
		}
	}
	
}
	}


