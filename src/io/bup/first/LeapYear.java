package io.bup.first;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("请输入一个年份：");
		Scanner input = new Scanner(System.in); 
		int year = input.nextInt();     //从键盘读取一个年份
		if(year % 400 ==0){
			System.out.println("您所输入的年份是闰年");
		}else if(year % 4 ==0 && year % 100 != 0){
			System.out.println("您所输入的年份是闰年");
		}else{
			System.out.println("您所输入的年份是平年");
		}
	}
}