package oo.stati;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

//	@override
	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math) + "\t" + thesis);
	}



}
