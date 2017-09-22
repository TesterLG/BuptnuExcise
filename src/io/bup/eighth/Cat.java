package io.bup.eighth;
/**
 * 宠物猫类继承宠物类。
 */
public class Cat extends Pet {
	//新增属性定义
	private String strain;
	/**
	 * 两个参数构造方法
	 */
	public Cat(String name,String strain) {
		//调用父类一个参数构造方法
		super(name);//不能用this.name=name
		this.strain=strain;
	}
	//新增属性getter/setter方法
	public String getStrain() {
		return strain;
	}
	
	//方法定义
		/**
		 * 重写Pet的自我介绍
		 */
	public void introduce() {
		super.introduce();
		System.out.println("我是一只纯种的"+this.strain+"。");
	}
	/**
	 * 新增滚球方法
	 */
	public void rollBall() {
		if(getStrength()<60) {
			System.out.println(getName()+"生病了！");
		}else {
			setStrength(getStrength()-10);
			setMood(getMood()+5);
			System.out.println(this.getName()+"正在滚球，目前体力值"+getStrength()+"，心情值为"+getMood()+"。");
		}
	}
	
}
