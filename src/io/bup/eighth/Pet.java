package io.bup.eighth;
/*
 * 为什么用继承？ cat类和pig类中有共有的属性和方法，提取出来放到一个单独的类pet中，然后让cat和pig继承pet，同时保留自己独有的属性和方法。
 * 继承：是一种由已有的类创建新类的机制，是指在已有的类的基础上扩展功能。继承中分子类和父类，或称为超类和派生类。
 * 类声明中，用关键字extends，格式：
 * [修饰符] class 子类名 extends 父类名{
 * ....
 * }
 *
 *面向对象的三大特征之1，单继承，可以多次继承也就是说有传递性。
 *一切类的“祖先”—java.lang.Object。在Java中，所有的Java类都直
 *接或间接地继承了java.lang.Object类。如果一个类在声明时没有使用
 *extends关键字声明父类，那么它的直接父类就是Object，也就是说前
 *面我们没学继承前写的所有的类都是Object直接子类。
 *
 *1.变量隐藏
子类中定义的成员变量和父类中定义的成员变量同名时（类型可不同），则子类隐藏了继承的成员变量，当子类对象调用这个成员变量时，一定是调用在子类中声明定义的那个成员变量，而不是从父类继承的成员变量。
2.方法的重写	
子类可以通过方法的重写隐藏继承的方法。当子类定义一个方法，这个方法返回类型、方法名、参数列表与从父类继承的方法完全相同时，我们称之为方法重写(OverRide)；子类重写父类方法时访问权限保持一致或者提高，不能降低。子类通过方法重写把父类的状态和行为改变为自身的状态和行为。子类一旦重写了父类的某个方法，则子类对象再调用该方法时，一定是调用的重写后的方法。

 子类不能继承父类的构造方法，当用子类构造方法创建对象时，子类的构造方法总是先调用父类的某个构造方法。
 
 this是Java的一个关键字，表示某个对象。this可以出现在实例方法和构造方法中，但不能出现在类方法中。

this关键字代指的是当前对象，而super出现在子类中，表示父类的对象。super可以出现在子类的实例方法和构造方法中，不能出现在子类的类方法中。
1. 在子类的实例方法中使用super
子类中一旦隐藏了父类的某个变量，子类的实例方法中不能再使用该变量，这时，如果子类实例方法想调用被隐藏的变量，那么就要用super关键字，格式为：
super.被隐藏变量;
2. 在子类的构造方法中使用super
由于子类不能继承父类的构造方法，所以子类的构造方法中总是需要使用super关键字调用父类的某个方法。

【问题分析】
本章任务的详细需求，跟上一章的差不多。具体需求如下：
根据控制台提示，输入领养宠物的昵称。
根据控制台提示，选择领养宠物的类型，有两种选择：猫咪和猪猪。
如果类型选择猫咪，要选择猫咪的品种，有两种选择：“波斯猫”或者“挪威的森林”。
如果类型选择猪猪，要选择猪猪的性别：“猪GG”或“猪MM”。
所领养宠物的体力值默认是100，体力值会随着吃食升高。
所领养宠物心情值默认是20，宠物心情会因为吃东西、玩游戏升高。
控制台打印出宠物自我介绍信息，包括昵称、体力值心情值、品种或性别，表示领养成功。
宠物可以吃东西，每吃一次东西相应的体力值会增加。当增加到一定值，就不能再增加，提示需要多运动。
宠物可以游戏，玩游戏过程体力值减少，心情值增加，玩游戏过度，体力值过低会提示生病。


 *
 */
public class Pet {
	private String name; //昵称
	private int strength=100;// 体力值
	private int mood=20;// 心情值
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	
	/**
	 * 宠物自我介绍。
	 */
	public void introduce() {
		System.out.println("亲爱的主人，我的名字叫" + this.name + "，我目前体力值是"	+ this.strength + "，心情值是"	+ this.mood+"。");
					}
	
	/**
	 * 宠物吃食。
	 */
	public void eat() {
		if(strength>120) {
			System.out.println(this.getName()+"需要多运动奥！");
		}else {
			setStrength(getStrength()+10);
			System.out.println(this.getName()+"吃饱啦！体力值增加10，目前值为"+strength+"。");
		}
	}
	/**
	 * 有参构造方法。
	 */
	public Pet(String name) {//构造方法，返回值没有活看成为本身。
		this.name=name; //为什么写？把参数传进来！
	}
	
}
