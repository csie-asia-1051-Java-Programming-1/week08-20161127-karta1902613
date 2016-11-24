package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        fun(n);
	}
	public static void fun(int n){
        int i=0;
        int x=0;
        int y=0;
        while(n>0){
        	i=n%2;
          	n=n/2; 
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
