package io.bup.eighth;

public class Test {
	public static void main(String[] agrs) {
		//使用Cat两个参数的构造方法创建对象
		Cat cat = new Cat("球球","波斯猫");
		cat.introduce();//调用重写方法
		cat.eat();//调用从父类继承来的方法
		cat.rollBall();//调用子类新增的方法
		
		//使用Pig两个参数的构造方法创建对象
		Pig pig=new Pig("嘟嘟","猪GG");
		pig.introduce();//调用重写方法
		pig.eat();//调用从父类继承来的方法
		pig.blowBubbles();//调用从父类继承来的方法
	}
//返回的结果：
	/*
	亲爱的主人，我的名字叫球球，我目前体力值是100，心情值是20。
	我是一只纯种的波斯猫。
	球球吃饱啦！体力值增加10，目前值为110。
	球球正在滚球，目前体力值100，心情值为25。
	亲爱的主人，我的名字叫嘟嘟，我目前体力值是100，心情值是20。
	我是一只胖胖的猪GG。
	嘟嘟吃饱啦！体力值增加10，目前值为110。
	嘟嘟正在吹泡泡，目前体力值105心情值为25。
	*/
	
	//知识拓展
	/*
	 * 子类对象的构造过程
因为子类不能继承父类的构造方法，子类构造方法总是直接或间接调用父类的某个构造方法，所以子类调用自己的构造方法创建对象时，也会调用父类的某个构造方法。因此，一个子类对象的构造过程可以这样理解：
初始化父类的成员变量。
调用父类的构造函数(没有显式调用，则调用默认构造方法)。
初始化子类的成员变量。
调用子类的构造方法。

//final关键字
final英文意思有“最终的，不可更改”的意思，在Java中是一个关键字。它可以修饰类、成员变量、方法和方法的参数。一旦被final修饰，代表不可改变。
final修饰的类不能被继承，即不能有子类。
final修饰的成员变量不能再改变，即final修饰变量为常量。因为常量在程序运行期间不允许改变，所以常量没有默认值，必须在声明的时候赋初始值。
final修饰的方法不允许被重写。
final修饰的方法参数不允许在方法体内重新赋值  。
	 */
}
