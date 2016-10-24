package hw;
/*
 * Topic:使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
   1, 1, 2, 3, 5
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int Fa=1;
		int Fb=1;
		int Fn;
		System.out.println("請輸入n:");
		int n=scn.nextInt();
		System.out.print(Fa+"，"+Fb);
		
		for(int i=2;i<n;i++){
			Fn=Fa+Fb;
			Fa=Fb;
			Fb=Fn;
			System.out.print("，"+Fn);
		}
		
		
		
	   	    }
	} 