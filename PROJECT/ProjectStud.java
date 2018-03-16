import java.io.Serializable;
class ProjectStud implements Serializable{
	private String name;
	private String usnm;
	private String pswd;
	private String fthr;
	private String mthr;
	private String adrs;
	private String mob;
	private String age;
	private String gndr;
	private String clg;
	public void setUsnm(String usnm){
		this.usnm=usnm;
	}
	public void setPswd(String pswd){
		this.pswd=pswd;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getUsnm(){
		return usnm;
	}
	public String getName(){
		return name;
	}
	public String getPswd(){
		return pswd;
	}
	public void setFthr(String fthr){
		this.fthr=fthr;
	}
	public String getFthr(){
		return fthr;
	}
	public void setMthr(String mthr){
		this.mthr=mthr;
	}
	public String getMthr(){
		return mthr;
	}
	public void setAdrs(String adrs){
		this.adrs=adrs;
	}
	public String getAdrs(){
		return adrs;
	}
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return age;
	}
	public void setMob(String mob){
		this.mob=mob;
	}
	public String getMob(){
		return mob;
	}
	public void setGndr(String Gndr){
		this.gndr=gndr;
	}
	public String getGndr(){
		return gndr;
	}
	public void setClg(String clg){
		this.clg=clg;
	}
	public String getClg(){
		return clg;
	}
}