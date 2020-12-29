//20201229
//��������
//���� 1992
//���� Ʈ��
//����: https://developer-mac.tistory.com/37
import java.util.*;
import java.io.*;
public class p1 {
	private static int n,m;
	private static int arr [][];
	
	public static boolean check(int w, int h, int nn) { //�ش� ������ ��� 0���� 1���� Ȯ��
		int first = arr[w][h]; //���� �� ����
		
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
			
			//n�� 2�� ������
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
		
		
		n = Integer.parseInt(br.readLine()); //������ ũ�� ǥ�� (nXn) (2�� ������)
		arr = new int [n][n]; //0,1 ������ �迭
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j]=str.charAt(j)-'0'; //0,1 ����
			}
		}
		
		decompose(0,0,n);

		
	}

}
