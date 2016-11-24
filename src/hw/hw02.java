package hw;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入要轉換的數字");
		int n=scn.nextInt();
		System.out.println("要轉換的進位");
        int c=scn.nextInt();
        int i=1;
        int x=0;
        System.out.print(fun(n,i,x,c));
	}
	public static int fun(int n,int i,int x,int c){
		if(n==0){			
			if(i==0){
				return x/10;
			}else{
				x=x*10+i%10;
				i/=10;
				return fun(n,i,x,c);				
			}
		    }else{
			   i=i*10+n%c;
			   n/=c;
			    return fun(n,i,x,c);
			}			
		}	
	}