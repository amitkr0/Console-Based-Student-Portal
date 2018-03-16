import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;
public class Registration
{
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileInputStream fis;
	FileOutputStream fos;
public void setInform()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String usnm=new String();
	    String age=new String();
	    String gndr=new String();
	    String fthr=new String();
	    String mthr=new String();
	    String pswd=new String();
	    String clg=new String();
	    String mob=new String();
		String name=new String();
		String adrs=new String();
		try{
			System.out.println("Enter ur name");
			name=br.readLine();
			System.out.println("Enter ur Father's name");
			fthr=br.readLine();
            System.out.println("Enter ur Mother's name");
			mthr=br.readLine();
			System.out.println("Enter ur Age");
			age=br.readLine();
			System.out.println("Enter ur Gender");
			gndr=br.readLine();
			System.out.println("Enter ur College");
			clg=br.readLine();
			System.out.println("Enter ur Mobile No.");
			mob=br.readLine();
			System.out.println("Enter ur Adress");
			adrs=br.readLine();
			System.out.println("Enter ur Username");
			usnm=br.readLine();
			System.out.println("Enter ur Password");
			pswd=br.readLine();
			}
			catch(IOException e){
				System.out.println(e);
			}
			ProjectStud ob=new ProjectStud();
			ob.setName(name);
			ob.setFthr(fthr);
			ob.setMthr(mthr);
			ob.setAge(age);
			ob.setGndr(gndr);
			ob.setClg(clg);
			ob.setMob(mob);
			ob.setAdrs(adrs);
			ob.setUsnm(usnm);
			ob.setPswd(pswd);
			File f=new File("Users");
			try{
				if(!f.exists())
				f.mkdir();
			fos=new FileOutputStream("Users/Studentinfo.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(ob);
			System.out.println("Your Account Created");
			}
			catch(FileNotFoundException e){
				System.out.println(e);
			}
			catch(IOException s){
				System.out.println(s);
			}
	        finally{
				if(f!=null){
					try{
					fos.flush();
					fos.close();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
	      }
	}
public void getRecord(String usnm)
	{
		File f=new File("Studentinfo.txt");
		if(f.exists())
		{
			try{
				fis=new FileInputStream(f);
				ois=new ObjectInputStream(fis);
				ProjectStud ob=(ProjectStud)ois.readObject();            //Downcasting.
				System.out.println("Username     : "+ob.getUsnm());	
				System.out.println("Name         : "+ob.getName());
				System.out.println("Father's Name: "+ob.getFthr());
				System.out.println("Mother's Name: "+ob.getMthr());
				System.out.println("Age          : "+ob.getAge());
				System.out.println("Gender       : "+ob.getGndr());
				System.out.println("Mobile No.   : "+ob.getMob());
				System.out.println("College      : "+ob.getClg());
				System.out.println("Adress       : "+ob.getAdrs());
				}
			catch(Exception e){
				System.out.println(e);
			    }
			finally{
				if(fis!=null)
				try{
					fis.close();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}

	public static void main(String ...args) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Registration re=new Registration();
	Show sh=new Show();
	EditProfile ep=new EditProfile();
    int ch;
	do{
	System.out.println("Enter ur choice:");
	System.out.println("1.LOGIN");	
	System.out.println("2.REGISTRATION");	
	System.out.println("3.EXIT");
    ch=Integer.parseInt(br.readLine());
    switch (ch){
		case 1:
		System.out.println("Enter the username:");
        String user=new String(br.readLine());
        if(user.equals("admin")){
        System.out.println("Enter ur password:");
        String pass=new String(br.readLine());
        if(pass.equals("password")){
        sh.showAdmin();
        }}
        else{
        System.out.println("Wrong Password.....Enter again:");
		pass=br.readLine();
        if(pass.equals("password")){
        sh.showAdmin(); 
        } }
        else{
        //check username and password...
		sh.showCommon(user);
        }	
		break;
		case 2:
		new Registration().setInform();
		break;
		case 3:
		System.exit(0);
		break;
		default :
		System.out.println("Wrong Choice");
		break;
	}	}while(ch!=3);
	}
	
}
