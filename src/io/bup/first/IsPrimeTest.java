package io.bup.first;

//IsPrimeTest.java
import java.util.Scanner;
public class IsPrimeTest {
	public static void main(String[] args) {
      int i=2;//初始试探的值为2,排除了1.
      int flag=1;//设一个标志位，假设一开始就认为是素数
      System.out.println("请输入一个正整数");
      Scanner input=new Scanner(System.in);
      int m=input.nextInt();
      do{
      	  if(m%i==0){
      		flag=0;//一旦发现整除的情况，就将标志位置为0
      	  }
        i++;//继续判断能否被下一个数整除
      }while(i<=m-1&&flag==1);//注意此处的循环条件，m-1排除了自身。
      if(flag==1){//若退出循环时，flag仍为1，则说明未遇到余数为0的情况
      	 System.out.println(m+"是素数");
      }else{
        System.out.println(m+"不是素数");
      }
}
	/*
	 * Java提供了break和continue关键字来改变控制流。看到break关键字，
	 * 大家应该不会感到陌生了。它曾经出现在switch结构中，在switch结构中
	 * ，break语句的作用是用于终止switch语句中的某个分支，跳出switch语句。
     * 在while，do-while，for循环结构中，
	 * break关键字的主要作用是从循环中提前退出。
	   continue 表示结束本次循环，而不终止整个循环的
	 */
}