package com.bignerdranch.android.geoquiz2.model;

public class TrueFalse {

    private int question;
    private boolean trueQuestion;
    
    public TrueFalse(int q, boolean tq) {
        //question = q;
        //trueQuestion = tq;
        setQuestion(q);
        setTrueQuestion(tq);
    }

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int q) {
		question = q;
	}

	public boolean isTrueQuestion() {
		return trueQuestion;
	}

	public void setTrueQuestion(boolean tq) {
		trueQuestion = tq;
	}

}
