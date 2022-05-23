package com.pack.ex2;

public class idCheck {
	String id, pw;
	
	public idCheck(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void getId() {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("로그인성공");
		else
			System.out.println("로그인성공");
	}
}
