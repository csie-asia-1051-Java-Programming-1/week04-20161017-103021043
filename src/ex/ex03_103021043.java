package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n:");
		int a=scn.nextInt();
		for(int i=0;i<a;i++){
			for(int x=0;x<=i;x++){
				System.out.print("*");
			}
			System.out.println(" ");
			}
		System.out.println();
		}
	}
			
