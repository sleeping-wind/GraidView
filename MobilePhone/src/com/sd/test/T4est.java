package com.sd.test;

import com.sd.test.Outer.Inner;
// 通过内部类调用外部类的私有方法，属性
public class T4est {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inn = outer.new Inner();
		inn.test();
		
	}
}
