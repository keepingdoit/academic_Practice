package Classs;

public class Car {
	String name = "TJ";
	String model;
	String color;
	int max;
	
	Car(){
		
	}
	Car(String model){
		this.model = model;
	}
	
	Car(int max){
		this.max = max;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int max){
		this.model = model;
		this.color = color;
		this.max = max;
	}
}
