package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 102002017 邱泓偉
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] n = new int[10][10];
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				n[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print("n[" +  i +"][" + j + "] = " + n[i][j] + "\t");
			}
			System.out.println();
		}
		
		//===================================
		
		int[][] m = new int[10][10];
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				m[i][j] = n[j][i];
			}
		}
		
		//=======================================
		System.out.println("轉置矩陣");
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.print("n[" +  i +"][" + j + "] = " + m[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
