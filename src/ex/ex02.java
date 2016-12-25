package ex;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ÕˆÝ”Èë”µ×Ö: ");
		String str = scn.nextLine();
		String a[]=(str.split(" "));
		int sun=0;
		int data[]=new int [a.length];
		for(int i=0;i<a.length;i++){
			data[i]=Integer.valueOf(a[i]);
			//System.out.print(data[i]+" ");
			sun+=data[i];
		}
		System.out.println("\nSize: "+data.length);
		System.out.println("Avg: "+(sun/3));
	}
}