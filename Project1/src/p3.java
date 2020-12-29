//백준 2740
//행렬곱셈
import java.io.*;
import java.util.*;
public class p3 {
	private static int n,m;
	private static int a[][];
	private static int b[][];
	private static int c[][];
	

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a= new int[n][m];
		//a행렬 만들기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		n=sc.nextInt();
		m=sc.nextInt();
		b= new int [n][m];
		
		
		//b행렬 만들기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		if(a.length == b[0].length) {
			c= new int[a.length][b[0].length];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<b.length; j++) {
					for(int k=0; k<b[0].length; k++) {
						c[i][k]+=a[i][j]*b[j][k];
					}
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
