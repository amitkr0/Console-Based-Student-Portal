import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Show extends Registration{
	public void showAdmin()
 {
	 Registration re1=new Registration();
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int c;
	do{
	System.out.println("Enter ur choice:");
	System.out.println("1.Show all records");
	System.out.println("2.Show a particular record");
	System.out.println("3.Delete a account");
	System.out.println("4.Logout");
	try{
	c=Integer.parseInt(br.readLine());}
	catch(Exception e){}
	finally{
	switch (c){
		case 1:
		
		break;
		case 2:
		String us =new String();
		try{System.out.println("Enter the username:");
		us=br.readLine();}
		catch(Exception e){}
		finally{
		re1.getRecord(us);}
		break;        //check username;
		case 3:
		String user1=new String();
		try{System.out.println("Enter the username:");
		user1=br.readLine();}
		catch(Exception e){}
		finally{}
		// delete account...
		break;
		case 4:
		break;
	}}
	}while(c!=4);
	
}
public void showCommon(String s1){
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Registration re1=new Registration();
	ProjectStud ob1=new ProjectStud();
	EditProfile ep1=new EditProfile();
	int c;
	do{
	System.out.println("Enter ur choice:");
	System.out.println("1.Show profile");
	System.out.println("2.Change Password");
	System.out.println("3.Update profile");          // except username..
	System.out.println("4.Delete account");
	System.out.println("4.Logout");
	try{
	c=Integer.parseInt(br.readLine());}
	catch(Exception e){}
	finally{
	switch (c){
		case 1:
		re1.getRecord(s1);
		break;
		case 2:
		String pass1=new String();
		String newp=new String();
		try{System.out.println("Enter ur new password:");
		newp=br.readLine();
		System.out.println("Confirm your password:");
		pass1=br.readLine();}
		catch(Exception e){}
		finally{
			if(pass1.equals(newp)){
			ob1.setPswd(pass1);
			System.out.println("Password changed successfully!");
		}
		else
			System.out.println("Password doesnot match!");
		}
		break;
		case 3:
		ep1.editProfile();
		case 4:
		// delete account..
		case 5:
		break;
	}}
     }while(c!=5);
}
}