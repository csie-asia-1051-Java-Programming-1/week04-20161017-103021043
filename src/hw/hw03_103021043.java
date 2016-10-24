package hw;
/*
 * Topic:程式個程式讓使用者連續輸入整數 (正數、負數及零)，
                           直到使用者輸入 999 時停止，然後顯示正數有多少個，0有幾個，負數總共有幾個，
                           使用者可以重覆執行直到使用者輸入n  
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		for(;;){
			System.out.println("請輸入:");
			int a=scn.nextInt();
			if(a>0){
		           x=x+1;
				}else if(a<0){
				   y=y+1;
				}else if(a==0){
					z=z+1;
				}
			
		}

         System.out.print("正數有"+x+"個　"+"負數有"+y+"個　"+"零有"+z+"個　");
     }
}