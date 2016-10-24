package hw;
/*
 * Topic:使用者輸入正整數 n與 m然後計算
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入C(M,N) ~~~  M!/[N!(M-N)!]");
		System.out.print("M:");
		int a =scn.nextInt();
		System.out.print("N:");
		int b =scn.nextInt();
		F(a,b);}
	private static void F(int a,int b){
	 int t=1; int y=1;int z=1;int c=a-b;
		for(int i=1;i<=a;i++){t*=i;}  
		for(int j=1;j<=b;j++){y*=j;}  
		for(int k=1;k<=c;k++){z*=k;}  
		System.out.print("輸出"+t/(y*z));
	  }	
	}
