package org.Selenium;

public class TransposeMatrix {
	public static void transposeMatrix(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[i].length;j++) {
				if(i!=j) {
					int temp;
					temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
	}
public static void main(String args[]) {
	int[][] b= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	transposeMatrix(b);
}
}
