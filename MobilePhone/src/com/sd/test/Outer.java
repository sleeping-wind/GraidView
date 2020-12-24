package com.sd.test;
// test pull
public class Outer {
	private String s = "澶栭儴鍐呯鏈夊睘鎬�";
	private void play() {
		System.out.println("澶栭儴绉佹湁鏂规硶");
	}
	public class Inner{
		void test(){
			System.out.println(s);
			play();
		}
	}
}
// successful