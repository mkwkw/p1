//백준 2447
//참고: https://cryptosalamander.tistory.com/38
import java.util.*;
public class p2 {
	//빈칸의 좌표 규칙으로 따지기
	private  static void pattern(int i, int j, int n) {
		
				if((i/n)%3==1 && (j/n)%3==1)
					System.out.print(" ");
				else {
					if(n/3==0)
						System.out.print("*");
					else
						pattern(i,j,n/3);
				
				
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				pattern(i,j,n);
			}
			System.out.println();
		}
		
	
	}

}
