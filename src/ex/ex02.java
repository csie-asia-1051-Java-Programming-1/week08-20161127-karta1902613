package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入要轉換的數字");
		int n=scn.nextInt();
		System.out.println("要轉換的進位");
        int c=scn.nextInt();
        fun(n,c);
	}
        public static void fun(int n,int c){
        int i=0;
        int x=0;
        int y=0;
        while(n>0){
        	i=n%c;
          	n=n/c; 
         x=x*10+i;
        	y++;    	
	   }
        for(int j=0;j<y;j++){
    	    i=x%10;
         	x=x/10;
       	System.out.print(i);
      }             
	}
}
