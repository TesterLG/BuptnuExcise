package io.bup.sixth;

import java.util.Scanner;

/*
 * 数据类型[ ] 数组名；//声明数组
或
数据类型 数组名[ ];//声明数组
Java中给我们提供了一个很形象的关键字—new。其语法格式为：
数组名=new 数据类型[数组长度]；//创建数组，为数组开辟了存储空间
====
Java把内存区域划分为好几块：栈区、堆区、代码区、常量池区。
栈区：主要存放的是我们在程序中所定义的一些基本数据类型的变量以及引用数据类型的变量。
堆区：所有new出来的东西全都存放在堆区。
Java中的内存管理主要管理的是内存的分配和释放。
分配：内存的分配是由程序完成的，对于基本数据类型，通过声明变量，直接就会在内存中开辟
相应大小的存储空间，对于引用数据类型，程序员需要通过关键字new动态的申请内存空间。
释放：在栈中分配的内存，当超出变量的作用域后会自动的释放该变量所分配的内存空间，
在堆中分配的内存空间，由JVM（Java Virtual Machine Java虚拟机）的垃圾回收机制负责其空间的释放。
===
访问数组元素的语法格式为：
数组名[下标值];

 */
public class arryExercise{


//一维数组的应用
/*
最值问题
例：输入10个整数，输出其中的最大值和最小值。
【问题分析】
 求最大值最小值的问题，通常采用“打擂台”的方式，先站上来一个人就认为他是最厉害的。
 然后第2个人上来和站在这个擂台上的人打，谁失败了谁下台，这样站在台上的就是这两个人中
 最厉害的。然后第3个人上来和站在这个擂台上的人打，谁失败谁就下台，这样站在擂台上的人是
 3个人中最厉害的。然后一直比，直到最后一个人再比时他一定是在和前面已经比过的最厉害的那
 个人在比。台上剩下的自然就是最厉害的。*/
//	public class MaxAndMinDemo {
	public static void main(String[] args) {
//		int[ ] num=new int[10];
//		Scanner input=new Scanner(System.in) ;
//		System.out.println("请输入10个整数：");
//		for(int i=0;i<num.length;i++) {
//			//System.out.println("plese 输入一个整数：");
//			num[i]=input.nextInt();
//		}
//		
//		int max=num[0];
//		int min=num[0];
//		for(int i=1;i<10;i++) {
//			if(num[i]>max) {
//				max=num[i];
//			}
//			if(num[i]<min) {
//				min=num[i];
//			}
//		}
//		System.out.println("最大的数："+max);
//		System.out.println("最小的数："+min);
		
		//排序问题
		/*
		 * 排序问题
例： 将5个数按照从小到大的顺序排列起来。
排序问题可以借助于一些经典的算法来解决。
冒泡排序
【算法描述】
冒泡排序（BubbleSort）算法的基本思想是：依次比较相邻的两个数，将小数放在前面，大数放在后面
。即在第一趟：首先比较第1个数和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，将
小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。至此第一趟结束，将最
大的数放到了最后。在第二趟：仍从第一对数开始比较，将小数放前，大数放后，一直比较到倒数第二个
数（倒数第一的位置上已经是最大的），第二趟结束，在倒数第二的位置上得到一个新的最大数。如此下去
，重复以上过程，直至最终完成排序。由于在排序过程中总是小数往前放，大数往后放，相当于气泡往
上升，所以称作冒泡排序。

		 */
		
//		int [] a = {8,70,5,6,7,66};
//		//外循环 从1 ~ a.length-1趟
//		for(int i=1;i<a.length;i++) {
//			System.out.print("第"+i+"趟:");
//			//内循环 每一趟比较的次数为 a.length-i次
//			for(int j=0;j<a.length-i;j++) {
//				if(a[j+1]<a[j]) {
//					int tmp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=tmp;
//			}
//		}
//			for(int k=0;k<a.length;k++) {
//				System.out.println(a[k]+" ");
//			}
//			System.out.println();
//			}

		//查找问题
		/*
例：从已排好序的数组中查找某个数字所在的位置。
【算法描述】
折半查找，又称二分查找法。折半查找法的思路是将数组从中间位置一分为二，
中间位置mid往左的部分记为A，中间位置往右的部分记为B。
将待查找的数与数组中间的元素值进行比较，如果待查找的数大于中间的元素值，
则待查找的数必定在B部分，否则，则有可能在A部分。如果在B部分，
则从mid后面一个元素开始查找，否则，从mid前一个元素开始查找。
重复上述步骤，直到start值大于end的值。此时，数组遍历结束。
若找到返回该元素所在数组中的下标值，找不到返回-1.
		 */
//		int [] num= {1,6,18,26,32,40,55,69,78};
//		int start=0;
//		int end=num.length-1;
//		int mid=0;
//		System.out.println("请输入你想查找的元素：");
//		Scanner input=new Scanner(System.in);
//		int searchNum=input.nextInt();
//		
//		while(start<=end) {
//			mid=(start+end)/2;
//			if(num[mid]<searchNum) {
//				start=mid+1;
//			}else if(num[mid]>searchNum) {
//				end=mid-1;
//			}else if(num[mid]==searchNum) {
//				break;
//			}
//			}
//		if(start<=end) {
//			System.out.println("要查找的元素在："+mid);
//		}else {
//		System.out.println("很遗憾，不存在你要找的元素");
//	}
		
	
	
	
	
	
	}
	

}