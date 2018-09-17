// Problem link: https://www.codechef.com/SEPT18B/problems/MAGICHF
import java.util.Scanner;

class C1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int i=1;i<=cases;i++) {
				int n = scan.nextInt();
				int x = scan.nextInt();
				int s = scan.nextInt();
				for(int j=1;j<=s;j++) {
					int a = scan.nextInt();
					int b = scan.nextInt();
					if(x == a) {
						x = b;
					}else if(x == b) {
						x = a;
					}
				}
				System.out.println(x);
		}
	}
}
