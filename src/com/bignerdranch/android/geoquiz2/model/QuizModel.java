package com.bignerdranch.android.geoquiz2.model;


import com.bignerdranch.android.geoquiz2.R;

public class QuizModel implements IQuizModel {

    //private int currentIndex = 0;
    private int currentIndex;
    private Answer answer;
    private TrueFalse[] answerKey;

    /*private TrueFalse[] answerKey = new TrueFalse[] {
        new TrueFalse(R.string.question_oceans, true),
        new TrueFalse(R.string.question_mideast, false),
        new TrueFalse(R.string.question_africa, false),
        new TrueFalse(R.string.question_americas, true),
        new TrueFalse(R.string.question_asia, true)
    };*/


    public QuizModel() {
        currentIndex = 0;
        answer = new Answer();
        answerKey = new TrueFalse[] {
            new TrueFalse(R.string.question_oceans, true),
            new TrueFalse(R.string.question_mideast, false),
            new TrueFalse(R.string.question_africa, false),
            new TrueFalse(R.string.question_americas, true),
            new TrueFalse(R.string.question_asia, true)
        };
    }

    @Override
    public boolean isTrueQuestion() {
        return answerKey[currentIndex].isTrueQuestion();
    }

    /*@Override
    public int getCorrectAnswer() {
        return answer.getCorrect();
    }

    @Override
    public int getIncorrectAnswer() {
        return answer.getIncorrect();
    }*/

    @Override
    public int getAnswer(boolean questionIsCorrect) {
        if(questionIsCorrect) {
            return answer.getCorrect();
        } else {
            return answer.getIncorrect();
        }
    }

    @Override
    public void setNextQuestion() {
        currentIndex = (currentIndex + 1) % answerKey.length;
    }

    @Override
    public void setPreviousQuestion() {
        if(currentIndex==0){
            currentIndex = answerKey.length - 1;
        }else{
            currentIndex = (currentIndex - 1) % answerKey.length;
        }
    }


    @Override
    public int getCurrentQuestion() {
        return answerKey[currentIndex].getQuestion();
    }
}
