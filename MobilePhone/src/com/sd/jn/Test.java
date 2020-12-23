package com.sd.jn;

import com.sd.ta.Student;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(18);
		stu.setName("张三");
		stu.setSex("男");
		System.out.println("姓名：" + stu.getName() + "\n性别：" + stu.getSex()
				+ "\n年龄：" + stu.getAge());
		System.out.println("--------测试方法--------");
		stu.study();
		stu.play();
	}
}
