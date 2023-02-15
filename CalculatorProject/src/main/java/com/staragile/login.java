package com.staragile;
import com.staragile.calculator;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to calculator project");
        calculator obj = new calculator();
        System.out.println(obj.sum(90, 50));
        System.out.println(obj.minus(90, 30));
        System.out.println(obj.multiply(90, 30));
        System.out.println(obj.divide(90, 30));
	}

}
