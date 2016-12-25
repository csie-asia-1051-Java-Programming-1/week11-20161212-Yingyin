package hw;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入文字: ");
		String str = scn.nextLine();
		System.out.println("請輸入要加的數字: ");
		int a = scn.nextInt();
		char data[]=str.toCharArray();
		for(int i=0;i<data.length;i++){
			if(data[i]>64&&data[i]<91){
				if((int)data[i]+a>90){
					data[i]=(char)((int)data[i]+a-26);
				}else{
					data[i]=(char)((int)data[i]+a);
				}
			}else if(data[i]>96&&data[i]<123){
				if((int)data[i]+a>122){
					data[i]=(char)((int)data[i]+a-26);
				}else{
					data[i]=(char)((int)data[i]+a);
				}
			}else{
				data[i]=data[i];
			}
		}
		String text = new String(data);
		System.out.println(" 轉換成: "+text);
	}
}