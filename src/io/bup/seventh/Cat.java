package io.bup.seventh;
/*
 * 
 */

public class Cat {
	//属性定义
		private String name;   // 昵称
		private int strength = 100;    // 体力值
		private int mood = 20;      // 心情值
		private String strain; // 品种
		//构造方法定义
		/**
		 * 两个参数构造方法
		 */
		
		public Cat(String name, String strain) {
			this.name = name;
			this.strain = strain;
		}
			//getter/setter方法
			public String getName() {
				return name;
			}
			public int getStrength() {
				return strength;
			}
			public int getMood() {
				return mood;
			}
			public String getStrain() {
				return strain;
			}
		
			//方法定义
			/**
			 * 猫咪自我介绍
			 */
			public void introduce() {
				System.out.println("亲爱的主人，我的名字叫"+this.name+"，是一只纯种的"
						+ this.strain+".目前我的体力值是"+this.strength+", 心情值是："+this.mood+"。");
			}
						
			/**
			 * 猫咪吃食
			 */
			public void eat() {
				if(strength>120) {
					System.out.println("MM需要多运动哦！");
				}else {
					strength+=10;
					System.out.println("猫咪"+this.name+"吃饱啦！体力值增加10，目前值为"
							+strength+"。");
				}
			
			}
			
			public void play() {
				if(strength<60) {
					System.out.println(this.name+"生病了！");
			}else {
				strength=strength-10;
				mood+=5;
				System.out.println(this.name+"正在主人玩耍/目前体力值"+this.strength+"心情值为："+mood+"。");
			}
			}
}
		