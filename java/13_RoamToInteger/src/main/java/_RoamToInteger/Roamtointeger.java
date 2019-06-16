package _RoamToInteger;

import java.util.Scanner;

public class Roamtointeger {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入羅馬數字");

		String roamStr = scanner.next();

		System.out.println("輸入羅馬數字為:" + roamStr);

		int arbInt = RoamConvertUtil.convert(roamStr);

		System.out.println("阿拉伯數字為:" + arbInt);
		
		scanner.close();
		return;
	}

}
