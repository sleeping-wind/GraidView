package com.sd.test;

import com.sd.test.Outer.Inner;
// ͨ���ڲ�������ⲿ���˽�з���������
public class T4est {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		Inner inn = outer.new Inner();
		inn.test();
		
	}
}
