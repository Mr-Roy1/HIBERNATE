package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
	static int [] compareTriplets( int a1[], int [] b1) {

        int x=0;
        int y=0;
        int i=0;
        int j=0;
        while(i<a1.length && j<b1.length ){
        	
        	 if(a1[i]>b1[j])
                x++;
            else if(a1[i]<b1[j])
                y++;
            i++;
            j++;
        }
        int p[]= {x,y};
        return p;
    }
    public static void main(String[] args)  {
    	Scanner sc=new Scanner(System.in);
    	int n1=sc.nextInt();
    	int ar[]=new int[n1];
    	for(int i=0;i<n1;i++) {
    		ar[i]=sc.nextInt();
    	}
    	
    	int n2=sc.nextInt();
    	int arr[]=new int[n2];
    	for(int i=0;i<n2;i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	int pp[]=compareTriplets(ar,arr);
    	for(int i=0;i<pp.length;i++) {
    		System.out.println(pp[i]);
    	}
    	
    	
       
    }
}



