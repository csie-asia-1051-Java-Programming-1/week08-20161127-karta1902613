package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1;
        int x=0;
        int b=0;
        System.out.print(bit(n,i,x,b)+"bit");
	}
	public static int bit(int n,int i,int x,int b){
		if(n==0){			
			if(i==0){				
				if(x==0){
					return b-1;
			   }else{
					if(x%10!=0){
					b++;
					x=x/10;
					return bit(n,i,x,b);
			   }else{
					x=x/10;	
			   }
				    return bit(n,i,x,b);
			   }
			   }else{
				x=x*10+i%10;
				i/=10;
				    return bit(n,i,x,b);				
			   }
		       }else{
			   i=i*10+n%2;
			   n/=2;
			        return bit(n,i,x,b);
			}			
		}	
	}