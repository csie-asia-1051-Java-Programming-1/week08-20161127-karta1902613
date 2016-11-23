package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// TODO Auto-generated method stub
		computer cal=new computer();
		System.out.println("請輸入 1~7 選擇功能");
		System.out.println("1 = +   2 = -");
		System.out.println("3 = ×   4 = ÷");
		System.out.println("5 = 平方    6 = 次方");
		System.out.println("7 = 開   根  號");
		int c =scn.nextInt();		
		switch(c){
		case(1):
			cal.plus();
		case(2):
			cal.minus();
		case(3):
			cal.multi();
		case(4):
			cal.divi();
		case(5):
			cal.pow();
		case(6):
			cal.cube();
		case(7):
			cal.sqrt();
		}		
	}
}
	class computer{
		Scanner scn=new Scanner(System.in);
		public void  plus(){
			float x=scn.nextFloat();			
			float y=scn.nextFloat();
			System.out.print("("+x+")"+"+"+"("+y+")"+" = "+(x+y));
	    }
	    public void minus(){
	    	float x=scn.nextFloat();			
			float y=scn.nextFloat();
			System.out.print("("+x+")"+"-"+"("+y+")"+" = "+(x-y));
		}
	    public void multi(){
	    	float x=scn.nextFloat();			
			float y=scn.nextFloat();
			System.out.print("("+x+")"+"×"+"("+y+")"+" = "+x*y);
	    }
	    public void  divi(){
	    	float x=scn.nextFloat();			
			float y=scn.nextFloat();
			System.out.print("("+x+")"+"÷"+"("+y+")"+" = "+x/y);
	    }
	    public void  pow(){
	    	float x=scn.nextFloat();			
			System.out.print("("+x+")^2 = "+Math.pow(x,2));
	    }
	    public void cube(){
	    	float x=scn.nextFloat();			
			System.out.print("("+x+")^3 = "+Math.pow(x,3));
	    }
	    public void sqrt(){
	    	float x=scn.nextFloat();
	    	System.out.print(" ___");
	    	int r=0;
	    	r=(int) x/10;
	    	for(int i=1;r>0;i++){	
	    		r/=10;
	    	System.out.print("_");
	    	    	}
	   	    System.out.println();
			System.out.println("√"+x+" = "+Math.sqrt(x));
	    }
}