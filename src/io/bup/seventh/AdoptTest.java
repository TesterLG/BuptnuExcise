package io.bup.seventh;

import java.util.Scanner;

/*
 * 类体中描述属性的变量被称为成员变量，出现在类体内部，方法的外部。成员变量的定义格式为：
[修饰符] 数据类型 变量名 [=默认值]；
成员变量的数据类型可以是Java中的任何一种数据类型，包括基本数据类型：整型、浮点型、字符型、
逻辑型；引用数据类型：数组、类和接口。成员变量的作用域在整个类体内有效。成员变量的名字
必须是合法的Java标识符。
=====
方法定义
类体中定义的方法被称为成员方法，用来描述类的行为。方法的定义包括两部分：方法声明和方法体。
语法格式：
[修饰符] 返回类型 方法名(参数1类型 参数1，参数2类型 参数2……){
    //方法体，可以是任意合法Java语句
  =========
  类体中除了有成员方法外，还包含一种特殊的方法，被称为构造方法。构造方法的特殊之处在于
  构造方法的名字必须跟类名相同，而且没有返回类型（既没有返回值，也没用void）。语法格式为：
[修饰符] 类名(参数1类型 参数1，参数2类型 参数2……){
    //方法体
}
一个类中可以有多个构造方法，但必须保证它们的参数列表不同，所谓参数列表不同：参数个数不同，
或者参数个数相同但对应的某个参数类型不同。
}
====
对象创建和使用分为三步：
1.    声明对象
语法格式：
类名 对象名；
2.    创建对象（即为对象赋值）
为对象赋值需要使用new运算符，同时要调用构造方法。语法格式：
对象名=new 构造方法；
3.    对象的使用
对象一旦创建，对象就具有了该类描述的属性和行为，所以，对象不仅可以操作自己的成员变量
改变状态，而且能调用类中的方法产生一定的行为。

在Java语言中，通过对类的封装来解决。Java语言中提供了private、默认的、protected
和public四个访问限制修饰符来限制用户的访问权限。这里，我们使用private修饰成员变量，
private修饰的成员变量只能在类体内被引用，类的外部对象没有权限访问。可以为成员变量
添加public修饰的setter方法完成成员变量的赋值，添加public修饰的getter方法实现对
成员变量的取值。这样就可以在setter方法内部添加访问控制的语句。

UML (Unified Modeling Language)又称统一建模语言，是一种为面向对象软件设计提
供统一的、标准的、可视化的建模语言。它提供了一系列框图表示对象模型，为开发人员阅读
和交流系统架构和规划提供便利。
在UML中，类图使用包含类名、属性和操作且带有分隔线的长方形来表示。

 */

/*
 * 【问题分析】
首先，我们要明确“E宠之家”电子宠物系统的详细需求，然后根据需求进行我们的设计和开发。具体需求如下：
根据控制台提示，输入领养宠物的昵称。
根据控制台提示，选择领养宠物的类型，有两种选择：猫咪和猪猪。
如果类型选择猫咪，要选择猫咪的品种，有两种选择：“波斯猫”或者“挪威的森林”。
如果类型选择猪猪，要选择猪猪的性别：“猪GG”或“猪MM”。
所领养宠物的体力值默认是100，体力值会随着吃食升高。
所领养宠物心情值默认是20，宠物心情会因为吃东西、玩耍升高。
控制台打印出宠物自我介绍信息，包括昵称、体力值、心情值、品种或性别，表示领养成功。
宠物可以吃东西，每吃一次东西相应的体力值会增加。当增加到一定值，就不能再增加，提示需要多运动。
宠物可以玩耍，玩耍过程体力值减少，心情值增加，玩耍过度，体力值过低会提示生病。
面向对象编程过程就是抽象的过程，此过程中我们只关注与业务相关的属性和行为，忽略无关的属性和行为。通过上面对需求的分析，我们要实现“E宠之家”，首先要创建宠物猫和宠物猪两个宠物类。
宠物猫（Cat）类：
具有属性：昵称（name）、品种（strain）、体能值（strength）和心情值（mood）；
具有行为：自我介绍（introduce）、吃食（eat）和玩耍（play）、属性getter方法以及构造方法。
宠物猪（Pig）类：
具有属性：昵称（name）、性别（sex）、体能值（strength）和心情值（mood）；
具有行为：自我介绍（introduce）、吃食（eat）和玩耍（play）、属性getter/setter方法。
对上述需求转换为UML类图如图1所示。
然后，创建主类AdoptTest类，在其main方法中编程实现宠物领养，即创建宠物的过程。要求如下：
根据控制台提示输入领养宠物类别。
根据控制台提示输入昵称、品种或者性别；
根据输入的内容创建宠物对象；
打印宠物信息，代表领养成功。
可以给宠物喂食，增强其体力。
可以选择跟宠物玩耍，消耗体力，增加心情值。

 */
public class AdoptTest {
	public static void main(String[] a) {
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到E宠之家！");
		//1.输入宠物名称
		System.out.print("请输入要领养宠物的名字：");
		String name=input.next();
		//2.选择宠物类型
		System.out.print("请选择要领养的宠物类型：（1、猫咪 2、猪猪）");
		switch(input.nextInt()) {
		case 1:
			// 2.1、如果是猫咪
			// 2.1.1、选择猫咪品种
			System.out.print("请选择猫咪的品种:(1、波斯猫" + " 2、挪威的森林)");
			String strain=null;
			if(input.nextInt()==1) {
				strain="波斯猫";
			}else {
				strain="挪威的森林";
			}
			//2.1.2、创建猫咪对象并赋值
			Cat cat=new Cat(name,strain);
			String answer=null;
			do {
				System.out.println("请选择您的操作:(1、查看宠物信息 2、给宠物喂食  3、陪宠物玩耍)");
				int operation=input.nextInt();
				if(operation==1) {
					cat.introduce();
				}else if(operation==2) {
					cat.eat();
				}else if(operation==3) {
					cat.play();
				}
				System.out.println("是否退出E宠之家？（yes/no）");
				answer=input.next();
			}while(!answer.equalsIgnoreCase("yes"));
			break;
		case 2:
			System.out.println("选择猪猪的性别：1.猪MM， 2.猪GG");
			String sex=null;
			if(input.nextInt()==1) 
				sex="猪MM";
			else 
				sex="猪GG";
			
			Pig pig=new Pig();
			pig.setName(name);
			pig.setSex(sex);
			answer="";
			do {
					System.out.println("选择您的操作:1查看宠物信息 2、给宠物喂食  3、陪宠物玩耍)");
					int operation=input.nextInt();
					if(operation==1) {
						pig.introduce();
					}else if(operation==2) {
						pig.eat();
					}else if(operation ==3 ) {
						pig.play();
					}
					System.out.println("是否退出E宠之家？（yes/no)");
					answer=input.next();
				}while(!answer.equalsIgnoreCase("yes"));
				break;
		}
		System.out.println("退出了E宠之家！");
	}
}

