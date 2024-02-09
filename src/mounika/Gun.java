package mounika;

public class Gun {
	String gunName;
	int noofBullets;
	public Gun(String gunName,int noofBullets) {
		this.gunName=gunName;
		this.noofBullets=noofBullets;
	}
	public void shoot() {
		for(int i=1;i<=noofBullets;i++) {
		System.out.println("Deshkew");
		}
	}

}
