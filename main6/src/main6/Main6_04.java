package main6;

import calcapp.logics.CalcLogic;

//正しく修正したCalc.java(Main6_03.java)
public class Main6_04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);//テキストのCalcLogicはMain6_02に変更して記述している
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
