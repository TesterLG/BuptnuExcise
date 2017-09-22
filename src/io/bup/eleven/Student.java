package io.bup.eleven;

/*
 * 在Java语言中，对于可能出现的异常，都需要预先进行处理，以保证程序的有效运行，否则程序就会出错。在Java语言中，若某个方法抛出异常，既可以在当前方法中进行捕获，然后处理该异常，也可以将该异常向上抛出，由方法的调用者来处理。
 1. 使用try…catch结构捕获异常
在Java中，对容易发生的异常，可以使用try…catch语句结构捕获，在try代码块中编写可能发生异常的代码，然后在catch代码块中捕获执行这些代码时可能发生的异常。      
try...catch结构的一般格式如下：
try{
    可能产生异常的代码
}catch(异常类 异常对象){
    异常处理代码
}
2.多个异常
3. finally子句的用法
Java中的try…catch结构提供了finally子句来完成这个功能，在try…catch结构中使用了finally子句后，不管程序中有无异常发生，也不管之前的try…catch结构是否顺利执行完毕，最终都会执行finally代码块的中代码，这使得一些不管在任何情况下都必须执行的步骤被执行，从而保证程序的健壮性。
4. 使用throws关键字抛出异常
如果某个方法会抛出异常，但不想在当前的这个方法中来处理这个异常，可以将这个异常抛出，在调用这个方法的代码中捕捉这个异常并进行处理。Java语言中通过关键字throws声明某个方法可能抛出的多种异常，throws可以同时声明多个异常，各个异常之间用逗号分隔。
5. 使用throw关键字抛出异常
使用try…catch结构与throws关键字抛出与捕获的都是系统定义的异常，但是在程序中可能会有一些逻辑错误，这样的问题系统是不会发现也不会抛出异常的，例如：年龄不能小于0，一般情况来说性别只能是“男”或“女”，当遇到这样的逻辑错误或与现实不一致的错误时，需要程序自己去适时的抛出异常，可是在什么地方抛出这些异常呢？Java中提供了throw关键字，可以在方法体内抛出一个异常类对象。
6. 使用异常处理语句的注意事项
进行异常处理时，主要使用了try、catch、finally、throws、throw等关键字，在使用它们时，要注意以下几点：
对于程序中的异常，必须使用try…catch结构捕获，或通过throws向上抛出异常，否则编译会出错；
不能单独的使用try、catch或着finally代码块，否则代码在编译时会出错；
try代码块后可以单独的跟一个至多个catch块，也可以单独的仅跟一个finally块，catch块和finally块可以同时存在，但finally块一定要跟在catch块之后。
在try…catch…finally结构中，不论程序是否会抛出异常，finally代码块都会执行；
try只跟catch代码配合使用时，可以使用多个catch块来捕获try代码块中的可能发生的多种异常。
在try、catch、finally等的内容定义的变量为局部变量，只能在代码块内部使用，如果要使用全局变量，则要将变量定义在这几个模块之外。

//自定义异常
通常使用Java内置的异常类就可以描述在编写程序时出现的大部分的异常情况，但根据实际需要，有时需要定义自己的异常类，并将它们用于程序中来描述Java内置异常类所不能描述的一些特殊情况。
自定义异常类必须是继承自Throwable类或其子类，才能被视为异常类，通过继承Exception类或其子类，除此之外，与创建普通类的语法相同，自定义异常类的使用方法与Java语言内置的异常类的使用方法也相同。

//任务实现
 * 学习了Java中的异常处理机制后，就可以完成本章开头提出的计算平均成绩的任务了。
【问题分析】
通过前面的任务分析，要存储信息的话，就要将信息封装起来，因此需要一个实体类，另外要在数组中存储数据，在显示数据时，到达的数据边框上限，可能会引发异常。
 *
 */
public class Student {
private String name;
private double score;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}

}


