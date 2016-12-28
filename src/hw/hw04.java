package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        number num=new number();
        int n=-87;
        int a,b,c,d;
        int data[][]=new int[8][22];
        int i;
        int s;
        while(n>=10000||n<0){
        n=scn.nextInt();
        if(n>=10000||n<0){
        	System.out.print("請輸入四位數字");
           }
        }
        d=n%10; n/=10;
        c=n%10; n/=10;
        b=n%10; n/=10;
        a=n%10;
        i=a; s=0;
       number.cho(i,s);
        i=b; s=5;
       number.cho(i,s);
        i=c; s=11;
       number.cho(i,s);
        i=d; s=17;
       number.cho(i,s);
       for(int x=0;x<8;x++){
    	   for(int y=0;y<22;y++){
    		   System.out.print(data[x][y]);
    	   }System.out.println();
	}
}
    static class number{
    	Scanner scn=new Scanner(System.in);
    	 
    	public static void cho(int i,int s){
    		 switch(i){
    			case(1):number.one();
    			case(2):number.two();
    			case(3):number.three();
    			case(4):number.four();
    			case(5):number.five();
    			case(6):number.six();
    			case(7):number.seven();
    			case(8):number.eight();
    			case(9):number.nine();
    			case(0):number.zero();
    			}

    	}
    	public static void one(){
    	int data[][]={{'*','*','*','*','*'},
    	              {' ',' ',' ',' ',' '},
    	              {'*',' ',' ',' ',' '},
    	              {' ',' ',' ',' ',' '},
    	              {'*',' ',' ',' ','*'},
    	              {' ',' ',' ',' ',' '},
    	              {'*',' ',' ',' ','*'},
    	              {' ',' ',' ',' ',' '},
    	              {'*','*','*','*','*'},
    	};		
    	return;
    	}
    	public static void two(){
    	}
    	public static void three(){
    	}
    	public static void four(){
    	}
    	public static void five(){
    	}
    	public static void six(){
    	}
    	public static void seven(){
    	}
    	public static void eight(){
    	}
    	public static void nine(){
    	}
    	public static void zero(){
    	}
    	public static void print(){
    		
    	       }
    	}
    }