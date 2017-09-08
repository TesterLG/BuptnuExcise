package io.bup.first;

/*
 * for循环适合解决一开始就能确定循环次数的情境，while循环当满足一定条件时就会执行循环操作，
 * do-while循环和while循环的区别是至少会执行一遍循环操作。即使一次就答对了，程序也至少执行
 *一遍，
 *==================
 *Java提供了break和continue关键字来改变控制流。看到break关键字，大家应该不会感到陌生了。
 *它曾经出现在switch结构中，在switch结构中，break语句的作用是用于终止switch语句中的某个
 *分支，跳出switch语句。在while，do-while，for循环结构中，break关键字的主要作用是从循
 *环中提前退出。
 */
	import java.util.Random;
	import java.util.Scanner;
	public class PupilMultipleEntry {
		public static void main(String[] args) {
			int num1, num2;
			int answer;
			String isContinue;
			Scanner input;
			// 随机产生两个正的一位整数
			Random random = new Random();
			do {
				num1 = random.nextInt(9) + 1;
				num2 = random.nextInt(9) + 1;
				do {
					// 生成题目
					System.out.println(num1 + " 乘以 " + num2 + " = ? ");
//输入答案
			input = new Scanner(System.in);
			answer =input.nextInt();
			if(answer==num1*num2) {
				System.out.println("你真棒！");
			}else {
				System.out.println("再动动你的小脑筋试试吧");
			}
			}while(answer!=num1*num2);														
				System.out.println("您还要继续吗？（y/"
						+ "n）");
				isContinue=input.next();
	}while("y".equals(isContinue));
			System.out.println("谢谢您使用本软件，期待您的再次使用");
		}
	}
	
	/*
	for-each循环
	for-each循环是JDK1.5加入的。for-each为开发人员提供了极大的方便。 
	for-each语句是for语句的特殊简化版本，但是for-each语句并不能完全取代for语句，
	然而，任何的for-each语句都可以改写为for语句版本。 for-each并不是一个关键字，
	从英文字面意思理解foreach也就是“for每一个”的意思，实际上也就是这个意思。 
	for-each的语句的一般形式如下所示：
	for(元素类型t 元素变量x : 遍历对象obj){   //遍历的对象通常是数组或者集合循环体
	}
*/