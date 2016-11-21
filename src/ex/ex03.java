package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n1 =scn.nextInt();
        int m1 =scn.nextInt();
        int n2 =scn.nextInt();
        int m2 =scn.nextInt();
        int x=0;
        int y=0;
        
        if(m1==n2){
        	int A[][]=new int[n1][m1];
        	int B[][]=new int[n2][m2];
        	int C[][]=new int[n1][m2];

        	for(int i=0;i<n1;i++){        	
        		for(int j=0;j<m1;j++){
        	A[i][j]=scn.nextInt();
        		}}
        	for(int i=0;i<n2;i++){        	
        		for(int j=0;j<m2;j++){
        	B[i][j]=scn.nextInt();
        		}}
        	
        	
        	for(int i=0;i<n1;i++){
        	  	for(int j=0;j<m1;j++){
          			System.out.print(A[i][j] + "\t");
        		}
        		System.out.println();}    
        	for(int i=0;i<n2;i++){
        	  	for(int j=0;j<m2;j++){
          			System.out.print(B[i][j] + "\t");
        		}
        		System.out.println();}    
        	for(int i=0;i<n1;i++){
        		for(int l=0;l<n2;l++){
        			x+=A[i][l]*B[l][i];
        			        		}
        		
        		for(int j=0;j<m2;j++){
        			C[i][j]=x;
        			        		}
        	}
        
           for(int i=0;i<n1;i++){
        	  	for(int j=0;j<m2;j++){
          			System.out.print(C[i][j] + "\t");
        		}    System.out.println();
      }
        }
        else{
        	System.out.print("重新輸入");
        }
	}

}
