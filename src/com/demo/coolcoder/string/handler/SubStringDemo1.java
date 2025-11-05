package com.demo.coolcoder.string.handler;

public class SubStringDemo1 {
	
	

	public static void main(String[] args) {
		
		
		
		String resultPath1 = getResultPath("c://file/test1.txt");
		
		System.out.println(resultPath1);
		
		String resultPath2 = getResultPath("c://file/test2.pdf");
		System.out.println(resultPath2);
		
	}

	private static String getResultPath(String filePath) {
		String part1 = filePath.substring(0, filePath.indexOf("."));
		
		System.out.println(part1);
		
		String part2 = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
		
		System.out.println(part2);
		
		String result = part1+"/"+part2;
		
		return result;
	}

}
