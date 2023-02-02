package org.Selenium;

public class MatrixSparial {
	public static void spairaMatrix(int[][] a) {
		int Rs=0,Cs=0;
		int Re=a.length, Ce=a[0].length;
		
		
while(Rs<Re&&Cs<Ce) {
	
	for(int i=Cs;i<Ce;++i) {
		System.out.print(a[Rs][i]+" ");
	}
	Rs++;
	for(int i=Rs;i<Re;++i) {
		System.out.print(a[i][Ce-1]+" ");
	}
	Ce--;
	if(Cs<Ce) {
		for(int i=Ce-1;i>=Cs;--i) {
			System.out.print(a[Re-1][i]+" ");
		}
		Re--;
	}
	if(Rs<Re) {
		for(int i=Re-1;i>=Rs;--i) {
			System.out.print(a[i][Cs]+" ");
		}
		Cs++;
	}
}
	}
	public static void main(String args[]) {
		int[][] b= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		spairaMatrix(b);
	}

}
