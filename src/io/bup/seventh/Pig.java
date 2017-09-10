package io.bup.seventh;

public class Pig {
	//属性定义
	private String name;   // 昵称
	private int strength = 100;    // 体力值
	private int mood = 20;      // 心情值
	private String sex; // 性别
	//getter/setter方法
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStrength() {
	return strength;
}
public int getMood() {
	return mood;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

//方法定义
	/**
	 * 打印猪猪的信息
	 */
	public void introduce() {
		System.out.println("亲爱的主人，我的名字叫" 
				+ this.name + "，是一只胖胖的" + this.sex+ "。我目前体力值是"	+ 
				this.strength + "，心情值是"+ this.mood+"。");
}
	/**
	 * 猪猪吃食
	 */
	public void eat() {
		if(strength>100) {
			System.out.println("猪猪需要多运动奥！");
		}else {
			strength+=5;
			System.out.println("猪猪"+this.name+"吃饱啦！体力值增加5，目前值是"+strength+"。"); 
		}
	}
	
	public void play(){
		if(strength<50) {
			System.out.println(this.name+"生病了！");
		}else{
			System.out.println(this.name+"正在跟主人玩耍。目前体力值"+strength+"，心情值为"+mood+"。");
			strength-=5;
			mood+=5;

		}
	}
}
