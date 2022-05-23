package com.pack.ex1;

public class Sungjuk {
	int kor, eng;
	
	public Sungjuk(int kor, int eng){
		this.kor = kor;
		this.eng = eng;
	}
	
	public int getTot(){
		return kor+eng;
	}
}
