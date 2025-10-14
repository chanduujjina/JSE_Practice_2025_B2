package com.demo.coolcoder.operators;

public class ArithematicDemo2 {

	public static void main(String[] args) {

		//

		int a = 30;

		int b = 10;

		String type = "";
		int reslut = 0;

		int result = compute(a, b, "test");
		
		
	}

	private static int compute(int a, int b, String type) {
		int reslut =0;;
		switch (type) {
		case "add": {

			reslut = a + b;

			System.out.println("addition a,b " + reslut);
			break;
		}

		case "sub": {

			reslut = a - b;
			System.out.println("diffrences of  a,b " + reslut);
			break;
		}

		case "mul": {

			reslut = a * b;
			System.out.println("multplication of  a,b " + reslut);
			break;
		}
		
		case "div": {

			reslut = a / b;
			System.out.println("division of  a,b " + reslut);
			break;
		}
		
		case "rem": {

			reslut = a % b;
			System.out.println("remainder " + reslut);
			break;
		}

		default:
          System.out.println("invalid type provided");
          break;
		}
		
		return reslut;
	}

}
