package com.sd.test;


public class Outer {
	private String s = "�ⲿ��˽������";
	private void play() {
		System.out.println("�ⲿ˽�з���");
	}
	public class Inner{
		void test(){
			System.out.println(s);
			play();
		}
		
	}
}
