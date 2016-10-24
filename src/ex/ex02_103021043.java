package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		for(;;){
		System.out.println("請輸入n:");
		int n=scn.nextInt();
		System.out.println("請輸入m:");
		int m=scn.nextInt();
		for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			System.out.print(i+"*"+j+"="+(i*j)+"\t");
		}
		System.out.println();	
	}
		System.out.println("是否要繼續？(y/n)");
		String str=scn.next();
		if(str.equals("Y")||str.equals("y")){
			break;
		}
		if(str.equals("N")||str.equals("n")){
			}
		
		}
		
		System.out.println("結束了！");
		
	}
}


