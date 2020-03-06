package com.nubes.internship.QuestionQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionContainerimpl {

	public static void main(String[] args) {
		List<Question> list = new ArrayList<>();

		Question q1 = new Question("java is  programming or platform", "A. Programming", "B. Platform", "C.Both",
				"D.None of the above", "A");
		Question q2 = new Question("Who won the first T20 World Cup?", "A.SRI LANKA", "B.USA", "C.INDIA", "D.CANADA",
				"C");
		Question q3 = new Question("Which country has won the Cricket World Cup three times in a row?",
				"A.SOUTH AFRICA", "B.INDIA", "C.ENGLAND", "D.AUSTRALIA", "D");
		Question q4 = new Question("How many times has India won the ICC World Cup?", "A.2", "B.1", "C.4", "D.3", "A");

		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);

	}

	void begintest() {
		System.out.println("Welcome To Quiz ");
		
	}
}
