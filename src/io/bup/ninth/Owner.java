package io.bup.ninth;

import io.bup.eighth.*;

public class Owner {

	private String name;//主人
	private int money;//拥有金币
	//getter/setter方法
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void feed(Pet pet){
		//子类重写的父类的方法，上转型对象可以调用
		pet.introduce();
		//eat是继承来的方法，上转型对象可以调用。
		pet.eat();
	}
	
	public void play(Pet pet) {
		//滚球和吹泡泡是子类新增方法，pet是上转型对象不能调用。
		if(pet instanceof Cat) {
			Cat cat=(Cat)pet;
			cat.rollBall();
		}
		if(pet instanceof Pig) {
			((Pig) pet).blowBubbles();
			
		}
	}
	
	public Owner(String name,int money) {
		this.money=money;
	}
	
}
