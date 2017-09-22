package io.bup.ninth;

import java.util.Scanner;

import io.bup.eighth.*;

public class EPetHome {
	
	Owner owner=new Owner("小宝",80);
	public static void main(String[] ags) {
		new EPetHome().init();
	}
	
	//E宠之家启动方法
	public void init() {
		System.out.println("欢迎您来到E宠之家！");
		System.out.println("***********************");
		System.out.println("请先领养一只宠物：");
		
		Pet pet=adopt();
		operate(pet);
	}

	public void operate(Pet pet) {
		Scanner input =new Scanner(System.in);
		String answer=null;
		do {
			System.out.println("请输入你的操作：1.喂食 2.玩耍");
			if(owner.getMoney()<15) {
				System.out.println("金币不足15个，请及时充值！");
				break;
			}
			if(input.nextInt()==1) {
				//喂食
				owner.feed(pet);
				System.out.println(owner.getName()+",为宠物购买食品，消费金币10个");
				owner.setMoney(owner.getMoney()-10);
			}else {
				//玩耍
				owner.play(pet);
				System.out.println(owner.getName()+",您好有爱奥！奖励金币5个。");
				owner.setMoney(owner.getMoney()-5);
			}
			System.out.println("是否退出E宠之家？yes/no");
			answer=input.next();
		}while(!"yes".equalsIgnoreCase(answer));
		System.out.println(owner.getName()+",退出E宠之家，您当前的金币数"+ owner.getMoney()+",记得常来看看您的宠物哦!");
	}

	public Pet adopt() {		
		Scanner in=new Scanner(System.in);
		Pet pet = null;
		//1.输入宠物的名字
		System.out.println("请输入你要领养宠物的名字：");
		String name=in.next();
		System.out.println();
		//2.选择宠物类型
		System.out.println("选择要领养的宠物类型：（1、猫咪 2、猪猪)");
		switch(in.nextInt()) {
		case 1:
			//2.1如果是猫咪
			//2.1.1 选择猫咪品种
			System.out.println("请选择品种：（1.波斯貓 2.加菲猫)");
			String strain=null;
			if(in.nextInt()==1) {
				strain="波斯貓";
			}else if(in.nextInt()==2) {
				strain="加菲猫";
		}
			//2.1.2 创建猫咪对象并赋值
			pet=new Cat(name,strain);
			break;	
		case 2:
			//2.2 如果是猪猪
			//2.2.1 选择猪性别
			System.out.println("择猪猪的性别：（1、猪MM 2、猪GG）");
			String sex=null;
			if(in.nextInt()==1) {
			sex="猪MM";
			}else if(in.nextInt()==2) {
				sex ="猪GG";
			}
			//2.2.2 创建猪猪对象并赋值
			pet=new Pig(name,sex);
			break;
			}
		return pet;
	}
//知识拓展
	/*
	 * abstract关键字
1. 抽象类
用abstract修饰的类叫做抽象类。例如：
abstract class A 
{ …
} 
抽象类不能被实例化，即不允许用抽象类创建对象。没有用abstract修饰类称为具体类，具体类可以被实例化。
2. 抽象方法
用abstract修饰的方法叫做抽象方法，抽象方法没有方法体。例如
abstract  int min(int x,int y);
抽象方法用来描述系统具有什么功能，但不提供具体的实现，即只允许声明，不允许实现，而且不允许使用final修饰abstract方法。没有用abstract方法修饰的方法称为具体方法，具体方法有方法体。
3. abstract类的特点
abstract类中可以有实例变量，构造方法，具体方法和abstract方法。abstract类中可以有abstract方法，也可以没有，但是abstract方法一定存在于abstract类中。
abstract类不能用new运算创建对象，需产生其子类，由子类创建对象，如果一个
类是abstract类的子类，它必须具体实现父类的abstract方法，这就是为什么不允许使用final修饰abstract方法的原因。abstract类是用来继承的，反映了一种一般/特殊化的关系。


	 */

}
