import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.math.BigInteger;
class C3 {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cases = Integer.parseInt(st.nextToken());
		BigInteger even,odd;
		long hold;
		for(int i=0;i<cases;i++) {
			st= new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int array[] = new int[n];
			BigInteger count = new BigInteger("0");
			int xor;
			for(int j=0;j<n;j++) {
				array[j] = Integer.parseInt(st.nextToken());
			}
			int barray[] = new int[1000003];
			for(int j=0;j<1000003;j++) {
				barray[j] = 0;
			}
			even = new BigInteger("0");
			odd = new BigInteger("0");
			for(int j=0;j<n;j++) {
				barray[array[j]] += 1;
				if(array[j]%2 == 0) {
					even = even.add(BigInteger.valueOf(1));
				}else {
					odd = odd.add(BigInteger.valueOf(1));
				}
			}
			count = count.add(even.multiply(even).add(odd.multiply(odd)).subtract(even.add(odd)));
			for(int j=0;j<n;j++) {
				xor = array[j]^2;
				count = count.subtract(BigInteger.valueOf(barray[xor]).add(BigInteger.valueOf(barray[array[j]])).subtract(BigInteger.valueOf(1)));
			}
			count = count.divide(BigInteger.valueOf(2));
			System.out.println(count);
		}
	}	
}
