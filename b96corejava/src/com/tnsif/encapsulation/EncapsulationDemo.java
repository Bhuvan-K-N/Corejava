package com.tnsif.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation ob=new Encapsulation();// object creation
	//	ob.name="raju";// calling the variables
		//ob.age=33;
		//ob.serial_num=22;
		//ob.show();
		ob.setAge(22);
		ob.setName("raju");
		ob.setSerialNum(55);
		System.out.println(ob);
	}

}
