package hw;
/*
 * Topic: 請寫一個 遞迴函式進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1;
        int x=0;
        System.out.print(fun(n,i,x));
	}
	public static int fun(int n,int i,int x){
		if(n==0){			
			if(i==0){
				return x/10;
			}else{
				x=x*10+i%10;
				i/=10;
				return fun(n,i,x);				
			}
		    }else{
			   i=i*10+n%2;
			   n/=2;
			    return fun(n,i,x);
			}			
		}	
	}