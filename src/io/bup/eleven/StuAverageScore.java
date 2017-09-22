package io.bup.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StuAverageScore {

	public static void main(String[] args) {
		Student stuArr[]=new Student[10];
		Scanner input=new Scanner(System.in);
		double sum=0,average=0;
		int iStuNum=0;//学生数
		System.out.println("请输入学生数(要<=10的整数)：");
		
		try {
			iStuNum=input.nextInt();
		} catch (InputMismatchException ex) {
			// TODO Auto-generated catch block
			System.out.println("请输入整数信息。因输入的信息有误，默认学生为5人。");
			iStuNum=5;
		}
		//输入学生的姓名和信息
		try {
			for(int i=0;i<iStuNum;i++) {
				Student stu=new Student();
				System.out.println("请输入第"+(i+1)+"名学生的姓名：");
				stu.setName(input.next());
				System.out.println("请输入第"+(i+1)+"名学生的成绩：");
				stu.setScore(input.nextDouble());
				stuArr[i]=stu;//是个容器，装Student对象
				sum+=stuArr[i].getScore();//赋值后，就累加了。
			}
		} catch (InputMismatchException ex) {
			System.out.println("请输入双精度的成绩信息，因为输入的有误，默认的成绩总和为前面的数据之和。");
		}
		//计算平均成绩并输出
		
		try {
			average =sum/iStuNum;
			System.out.println("总成绩为："+sum);			
			System.out.println("平均成绩为："+average);
  //使用try...catch嵌套结构输出各个学生的成绩
		try {
			for(int j=0;j<iStuNum;j++) {
				System.out.println("姓名："+stuArr[j].getName()+"\t成绩："+stuArr[j].getScore());
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("该班没有这么多学生。");
		}
		} catch (NullPointerException e) {
			System.out.println("没有学生，因此没有总成绩。");
		} catch (ArithmeticException e) {
			System.out.println("没有学生，因此没有平均成绩。");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	//知识拓展
	/*
	 * JDK1.7新语法try-with-resource
	在Java中，一个资源作为一个对象，必须在程序结束之后随之关闭，可以使用前面所学的try…catch…finally结构实现这个功能。在JDK1.7中添加了try-with-resource语句结构，该结构确保了各个资源都能在使用后被关闭，实际上就是自动调用资源的close()方法，和Python里的with语句、C#中的using语句差不多。
	使用try-with-resources的语法可以实现资源的自动回收处理，大大提高了代码的便利性，是个好工具。

	JDK1.7对异常处理的改进
	1. multi-catch结构
	很多时候，在程序中捕获了多个异常，却做了相同的事情，比如记日志，包装成新的异常，然后rethrow。这时，代码就不那么优雅了。
	2. RethrowException更具包容性的类型检测
	当要重新抛出多个异常时，不再需要详细定义异常类型了，编译器已经知道前面具体抛出的是哪个异常了。开发者只需在方法定义的时候声明需要抛出的异常即可。
	*/
}
