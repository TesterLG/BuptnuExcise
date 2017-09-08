package io.bup.first;

import java.util.Scanner;
public class ChildHeightUseScanner {
	public static void main(String[] args) {
		  //定义父母身高、孩子的身高变量
		  double fatherHeight, motherHeight, childHeight;
		  int childGender;    //定义孩子的性别0代表男，其它代表女
		  String gender = "男孩";   //定义要显示的孩子的性别
		  //实例化键盘输入对象
		   Scanner input = new Scanner(System.in); 
		   System.out.println("请输入父亲的身高（米）：");
		   fatherHeight = input.nextDouble();
		   System.out.println("请输入母亲的身高（米）：");
		   motherHeight = input.nextDouble();
		   System.out.println("请输入孩子的性别(0代表男，其它的值代表女)：");
		   childGender = input.nextInt();
		   //下面的结果是下一章将要学习的内容
		   if(childGender==0){   //0为男孩，按男孩的计算公式
              gender = "男孩";
			     childHeight = (fatherHeight+motherHeight)*1.08f/2; 
		   }else{    //其它为女孩，按女孩的计算公式
			     gender = "女孩";
			     childHeight = (double) ((fatherHeight*0.923+motherHeight)/2); 
		   }
		   System.out.println("要预测的是："+gender+"，预测身高为："+childHeight+"米");
       input.close();    //关闭输入对象
	   }
 }