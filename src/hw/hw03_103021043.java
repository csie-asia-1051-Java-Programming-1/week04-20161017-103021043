package hw;
/*
 * Topic:�{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A
                           ����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0���X�ӡA�t���`�@���X�ӡA
                           �ϥΪ̥i�H���а��檽��ϥΪ̿�Jn  
 * Date: 2016/10/17
 * Author: 103021043 ��z�B
 */
import java.util.Scanner;
public class hw03_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(;;){
		int x=0;
		int y=0;
		int z=0;
		for(;;){
			System.out.println("�п�J:");
			int a=scn.nextInt();
			if(a>0&&a!=999){
		           x=x+1;
				}else if(a<0){
				   y=y+1;
				}else if(a==0){
					z=z+1;
				}else if(a==999){
					break;
				}
			
		} 
		System.out.print("���Ʀ�"+x+"�ӡ@"+"�t�Ʀ�"+y+"�ӡ@"+"�s��"+z+"�ӡ@");
		System.out.println("�O�_�n�����H");
		String n=scn.next();
		if(n.equals("n")){
			System.out.println("end");
			break;
	   }	
     }
   }	
}