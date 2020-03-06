package com.nubes.internship.QuestionQuiz;

public class ExamClient {

	public static void main(String[] args) {
		QuestionContainer q = new QuestionContainerimpl();
		q.beginTest();
		q.showResult();
		q.showAnswers();

	}

}
