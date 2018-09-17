import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
class C2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cases = Integer.parseInt(st.nextToken());
		for(int i=0;i<cases;i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int rem1 = (n-1)%x;
			int rem2 = (m-1)%y;
			if(rem1 == 0 && rem2 == 0) {
				System.out.println("Chefirnemo");
			}else if(rem1 == 1 && rem2 == 1) {
				System.out.println("Chefirnemo");
			}else if(rem1 == 0 && rem2 == 1) {
				if(n == 1) {
					System.out.println("Pofik");
				}else if(x == 1) {
					System.out.println("Chefirnemo");
				}else {
					System.out.println("Pofik");
				}
			}else if(rem1 == 1 && rem2 == 0) {
				if(m == 1) {
					System.out.println("Pofik");
				}else if(y == 1) {
					System.out.println("Chefirnemo");
				}else {
					System.out.println("Pofik");
				}
			}else {
				System.out.println("Pofik");
			}
		}
	}
}

