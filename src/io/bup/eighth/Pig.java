package io.bup.eighth;

public class Pig extends Pet {

	//新增属性定义
	private String sex;//性别
	
	/**
	 * 两个参数的构造方法
	 */
	public Pig(String name,String sex) {
		//调用父类的一个参数构造方法
		super(name);
		this.sex=sex;
	}

	//geter/setter
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
/**
 * 重写父类的自我介绍
 */
	public void introduce() {
		super.introduce();
		System.out.println("我是一只胖胖的"+this.sex+"。");
	}
	//新增方法吹泡泡
	public void blowBubbles() {
		if(getStrength()<60) {
			System.out.println(getName()+"生病了");
		}else {
			setStrength(getStrength()-5);
			setMood(getMood()+5);
			System.out.println(this.getName()+"正在吹泡泡，目前体力值"+this.getStrength()+"心情值为"+this.getMood()+"。");
		}
	}
}
