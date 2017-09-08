package io.bup.first;

//IsPrimeTest.java
import java.util.Scanner;
public class IsPrimeTest {
	public static void main(String[] args) {
      int i=2;//初始试探的值为2
      int flag=1;//设一个标志位，假设一开始就认为是素数
      System.out.println("请输入一个正整数");
      Scanner input=new Scanner(System.in);
      int m=input.nextInt();
      do{
      	  if(m%i==0){
      		flag=0;//一旦发现整除的情况，就将标志位置为0
      	  }
        i++;//继续判断能否被下一个数整除
      }while(i<=m-1&&flag==1);//注意此处的循环条件
      if(flag==1){//若退出循环时，flag仍为1，则说明未遇到余数为0的情况
      	 System.out.println(m+"是素数");
      }else{
        System.out.println(m+"不是素数");
      }
}
}