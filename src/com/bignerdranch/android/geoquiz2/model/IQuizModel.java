package com.bignerdranch.android.geoquiz2.model;


public interface IQuizModel {

    public boolean isTrueQuestion();
    //public int getCorrectAnswer();
    //public int getIncorrectAnswer();
    public int getAnswer(boolean trueQuestion);
    public void setNextQuestion();
    public void setPreviousQuestion();
    public int getCurrentQuestion();
}
