package hw;
/*
 * Topic:�ϥΪ̿�J n ���� n �� �O��ƦC (�� n = 5 )
   1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int Fa=1;
		int Fb=1;
		int Fn;
		System.out.println("�п�Jn:");
		int n=scn.nextInt();
		System.out.print(Fa+"�A"+Fb);
		
		for(int i=2;i<n;i++){
			Fn=Fa+Fb;
			Fa=Fb;
			Fb=Fn;
			System.out.print("�A"+Fn);
		}
		
		
		
	   	    }
	} 