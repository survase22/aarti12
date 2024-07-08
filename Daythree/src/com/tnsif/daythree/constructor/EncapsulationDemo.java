package com.tnsif.daythree.constructor;

public class EncapsulationDemo {
public static void main(String[] args) {

		
		//object creation
		OopsConceptDemo obj= new OopsConceptDemo();
		
		obj.setName("aarti");
		obj.setAge(20);
		obj.setSerilaNum(1001);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerilaNum());
		
		System.out.println(obj);
		
		
	}


}
