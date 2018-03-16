import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;
public class EditProfile extends Registration{
	public void editProfile()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
			System.out.println("Enter ur updated name");
			String name1=br.readLine();
			System.out.println("Enter ur updated Father's name");
			String fthr1=br.readLine();
            System.out.println("Enter ur updated Mother's name");
			String mthr1=br.readLine();
			System.out.println("Enter ur updated Age");
			String age1=br.readLine();
			System.out.println("Enter ur updated Gender");
			String gndr1=br.readLine();
			System.out.println("Enter ur updated College");
			String clg1=br.readLine();
			System.out.println("Enter ur updated Mobile No.");
			String mob1=br.readLine();
			System.out.println("Enter ur updated Adress");
			String adrs1=br.readLine();
			}
			catch(IOException e){
				System.out.println(e);
			}
			ProjectStud ob=new ProjectStud();
			ob.setName(name1);
			ob.setFthr(fthr1);
			ob.setMthr(mthr1);
			ob.setAge(age1);
			ob.setGndr(gndr1);
			ob.setClg(clg1);
			ob.setMob(mob1);
			ob.setAdrs(adrs1);
			File f=new File("Users");
			try{
				if(!f.exists())
				f.mkdir();
			fos=new FileOutputStream("Users/Studentinfo.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(ob);
			System.out.println("Your Account Updated");
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

}