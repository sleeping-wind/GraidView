package com.sd.test;
// test pull
public class Outer {
	private String s = "外部内私有属性";
	private void play() {
		System.out.println("外部私有方法");
	}
	public class Inner{
		void test(){
			System.out.println(s);
			play();
		}
	}
}
