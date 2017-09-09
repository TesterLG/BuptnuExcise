package io.bup.sixth;

import java.util.Scanner;

public class SongCompetition {
	/**
	 * 歌手大赛评分程序
	 */
	public static void main(String[] args) {
		double[] score =new double[10];
		double sum=0;//存放总分
		double max;
		double min;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.print("请第"+(i+1)+"名评委亮分(1-100分):");
			score[i]=scan.nextDouble();
			sum+=score[i];
		}
		min=max=score[0];//假设第一个既是最高分，又是最低分
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}
			if(score[i]<min) {
				min=score[i];
			}
		}
		double finalScore=(sum-min-max)/(score.length-2);
		System.out.printf("该选手最后得分为：%.2f",finalScore); 
	
	}

}
/*知识拓展
 *  Arrays类
Java的设计人员预先给我们提供了很多包，提供了一个很好的平台让我们进行程序开发。java.util包就是其中之一。大家想想之前我们在哪里见过这个包？为了实现键盘输入，我们使用了Scanner类，Scanner类就位于java.util包中，想要使用它必须在开始导入java.util包，即import java.util.Scanner。这里要给大家讲的Arrays类也位于这个包中。Arrays类提供了很多常用的方法来操作数组，如：排序、查询等。排序的语法如下：
Arrays.sort(数组名);
对数组进行二分查找的语法如下：
Arrays.binarySearch(数组名,要查找的元素);
如果没找到，该语法返回-1；如果找到了，该语法返回元素所在的位置。

对象数组
让我们一起再来看一下声明并创建一维数组的语法：
数据类型[ ] 数组名=new 数据类型[数组长度]；//声明并创建数组
         如果我们想存放一个班所有的学生，那么此时数据类型应该是什么呢？你可能会说，既然存的是学生，那数据类型当然应该是学生啊！可学生对应的是什么类型呢？好像我们找不到一个可以使用的合适的数据类型。那我们就只能自己定义一个新的数据类型“学生”类型。
         我们向女娲学习，造了个学生的模型出来，有名字，有年龄，还能自我介绍。可模型终归是模型，我们还需要通过模型做出真正的学生。所以你在紧接着的程序实现中会发现我们通过“new”关键字造了5个学生出来。new 学生的过程称为创建对象，实际此时数组里面存放的是一个个的对象，“对象数组”名称由此而来。

二维数组
概述
二维数组可以看成是以数组为元素的数组。如：
int[ ][ ] num={{1,2},{3,4,5,6},{7,8,9}};
大家可以观察一下，一维数组声明一个“[ ]”,二维数组两个“[ ][ ]”，三维、四维依次类推，有没有五维呢？反正笔者目前未见过其应用，目前只见过四维的应用，在3D的图形转换中可以用到。
声明和创建
等长数组，如：
int[ ] [ ] num=new int[3][3];//创建了具有三行三列的数组
不等长数组，如：
int[ ][ ] num=new int[3][ ];//创建了具有三行的数组

 * 
 */
