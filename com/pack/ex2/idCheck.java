package com.pack.ex2;

public class idCheck {
	String id, pw;
	
	public idCheck(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void getId() {
		if(id.equals("admin")&&pw.equals("1111"))
			System.out.println("�α��μ���");
		else
			System.out.println("�α��μ���");
	}
}
