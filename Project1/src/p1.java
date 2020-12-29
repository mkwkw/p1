//20201229
//분할정복
//백준 1992
//쿼드 트리
//참고: https://developer-mac.tistory.com/37
import java.util.*;
import java.io.*;
public class p1 {
	private static int n,m;
	private static int arr [][];
	
	public static boolean check(int w, int h, int nn) { //해당 구역이 모두 0인지 1인지 확인
		int first = arr[w][h]; //숫자 비교 기준
		
		for(int i=w; i<w+nn; i++) {
			for(int j=h; j<h+nn; j++) {
				if(arr[i][j] != first) {
					return false;
				}
			}
		}
		m=first;
		return true;
	}

	public static void decompose(int w, int h, int nn) {
		if(check(w, h, nn))
			System.out.print(m);
		else {
			System.out.print("(");
			int s = nn/2;
			
			//n은 2의 제곱수
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					decompose(w+s*i, h+s*j, s);
				}
			
			}
			System.out.print(")");
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		n = Integer.parseInt(br.readLine()); //영상의 크기 표시 (nXn) (2의 제곱수)
		arr = new int [n][n]; //0,1 저장할 배열
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j]=str.charAt(j)-'0'; //0,1 저장
			}
		}
		
		decompose(0,0,n);

		
	}

}
