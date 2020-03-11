package com.nubes.internship.QuestionQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionContainerimpl implements QuestionContainer {
	int c_count = 0, w_count = 0;

	List<Question> list = new ArrayList<>();
	{
		Question q1 = new Question("java is  programming or platform ", "A. Programming ", "B. Platform ", "C.Both ",
				"D.None of the above ", "B");
		Question q2 = new Question("Who won the first T20 World Cup? ", "A.SRI LANKA ", "B.USA ", "C.INDIA ",
				"D.CANADA ", "C");
		Question q3 = new Question("Which country has won the Cricket World Cup three times in a row? ",
				"A.SOUTH AFRICA ", "B.INDIA ", "C.ENGLAND ", "D.AUSTRALIA ", "D");
		Question q4 = new Question("How many times has India won the ICC World Cup? ", "A.2 ", "B.1 ", "C.4 ", "D.3 ",
				"A");

		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
	}

	@Override
	public void beginTest() {

		Scanner sc = new Scanner(System.in);
		for (Question q : list) {
			System.out.println(q.getQuestion());
			System.out.println(q.getOption1() + q.getOption2() + q.getOption3() + q.getOption4());
			System.out.println("Enter Your Choice ");
			String answer = sc.next().toUpperCase();
			if (answer.contentEquals(q.getAnswer())) {
				c_count++;
			} else {
				w_count++;
			}
		}
	}

	@Override
	public void showResult() {
		System.out.println("--------------------------------------");
		System.out.println("Correct Answers Count Are : " + c_count);
		System.out.println("Wrong Answers Count Are : " + w_count);
		System.out.println("--------------------------------------");

	}

	@Override
	public void showAnswers() {
		for (Question q : list) {
			System.out.println(q.getQuestion());
			System.out.println(q.getOption1() + q.getOption2() + q.getOption3() + q.getOption4());
			System.out.println();
			System.out.println("Option Is " + q.getAnswer());
			System.out.println("------------------------------------------------------------------");
		}

	}

}
