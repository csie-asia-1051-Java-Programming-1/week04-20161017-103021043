package ex;
/*
 * Topic: 寫一個程式讓使用者輸入多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
import java.util.ArrayList;
import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;
public class ex01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		String b2;
		float sum=0;
		float average=0;
		
		for(;;){
		System.out.println("輸入一個正整數值(包含 0)");
		int b1=scn.nextInt();
		if(b1<-1){
			System.out.println("出錯");
			}
		else if(b1==-1){
			break;	
		}
		else if(b1>-1){
		b2=b1+"";
		a.add(b2);
			}
		}
		int c[]=new int[a.size()];
		for(int i=0;i<a.size();i++){
			c[i]=Integer.parseInt(a.get(i));
			sum=sum+c[i];
		}
		average=sum/c.length;
		System.out.println("總和:"+sum);
		System.out.println("平均:"+average);
	}
}
