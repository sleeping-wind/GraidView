package com.sd.jn;

import com.sd.ta.Student;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(18);
		stu.setName("����");
		stu.setSex("��");
		System.out.println("������" + stu.getName() + "\n�Ա�" + stu.getSex()
				+ "\n���䣺" + stu.getAge());
		System.out.println("--------���Է���--------");
		stu.study();
		stu.play();
	}
}
