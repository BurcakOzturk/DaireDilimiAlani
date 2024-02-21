import java.util.Scanner;

public class odev6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,a;
		double pi =3.14 ;
		Scanner inp = new Scanner(System.in);
		System.out.print("dairecin yarıcapını giriniz: ");
		r= inp.nextInt();
		
		Scanner inp1 = new Scanner(System.in);
		System.out.print("açıyı giriniz: ");
		a= inp1.nextInt();
		
		double alan = (pi * (r*r) * a) / 360;
		
		System.out.println("Dairenin alanı : "+ alan);
	}

}

