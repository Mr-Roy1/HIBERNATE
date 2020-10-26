package inter;

import java.util.Scanner;

public class duplicate {
	static int dupEle(int x[]) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>0) {
				int temp=0;
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					temp++;
				x[j]=-1;
				}
			}	
			if(temp>=1)	
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int pk=dupEle(ar);
		System.out.println(pk);
	}
}
