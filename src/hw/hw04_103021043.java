package hw;
/*
 * Topic:���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
��J n ����ܹϧ� (ex: n = 5)
��J n ����ܹϧ�
��J n (�����O�_��)����ܹϧ�
�����{��
 * Date: 2016/10/17
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw04_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(;;){
		System.out.println("�п�� 1,2,3,4");
		int b=scn.nextInt();	
	    if(b==1){
	    System.out.println("�п�Jn:");
		int a=scn.nextInt();
		for(int i=0;i<a;i++){
			for(int x=a;x>i;x--){
				System.out.print("*");
			}
			System.out.println("");
			}
		
		for(int i=1;i<a;i++){
			for(int x=-1;x<i;x++){
				System.out.print("*");
			}
			System.out.println("");
			}
		System.out.println();	
	   }
		
		else if(b==2){
			 System.out.println("�п�Jn:");
				int a=scn.nextInt();
			 for(int i=1;i<a;i++){
					for(int x=0;x<i;x++){
						System.out.print("*");
					}
					System.out.println();
					}
			for(int i=0;i<a;i++){
				for(int x=a;x>i;x--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	
		   else if(b==3){
			   System.out.println("�п�Jn:");
				int a=scn.nextInt();
		    	 int k=a-1;
				 for(int i=1;i<a;i=i+2){
						for(int j=0;j<k;j++){
							System.out.print(" ");
						}
				for(int x=0;x<i;x++){
						System.out.print("*");
					}
					System.out.println();
					k--;
				}
				 for(int i=0;i<a;i=i+2){
					 for(int j=0;j<k;j++){
						 System.out.print(" ");
					 }
					 for(int x=a;x>i;x--){
						 System.out.print("*"); 
					 }
					 System.out.println();
					 k++;
				 }
			}
		
		    else if(b==4){
		    	 System.out.println("�����F!!");
		    	 break;
		     }
	  }
 }
	}












