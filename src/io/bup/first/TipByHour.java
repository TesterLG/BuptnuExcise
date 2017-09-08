package io.bup.first;

import java.util.Date;
public class TipByHour {
	public static void main(String[] args) {
		Date dt = new Date();    //生成日期时间对象
		int hour = dt.getHours();   //取出当前的时间
		if(hour<6){
			System.out.println("主人，凌晨好，您起的真早啊。");
		}else if(hour<9){
			System.out.println("主人，早晨好，新的一天开始了。");
		}else if(hour<12){
			System.out.println("主人，上午好，祝您工作愉快。");
		}else if(hour<14){
			System.out.println("主人，中午好，要适当休息一下啊。");
		}else if(hour<17){
			System.out.println("主人，下午好，要打起精神来工作啊。");
		}else if(hour<19){
			System.out.println("主人，傍晚好，到了吃晚饭的时间了。");
		}else if(hour<22){
			System.out.println("主人，晚上好，该休息放松一下了。");
		}else{
			System.out.println("主人，到深夜了，小二在这里提醒您：该休息了！");
		}
	}
}