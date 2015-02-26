package com.bignerdranch.android.geoquiz2.controller;


import com.bignerdranch.android.geoquiz2.model.IQuizModel;
import com.bignerdranch.android.geoquiz2.view.IQuizView;

public class QuizController implements IQuizController {


    private IQuizView view;
    private IQuizModel model;

    public QuizController(IQuizView v, IQuizModel m) {
        view = v;
        model = m;
    }

//    @Override
//    public void checkAnswer(boolean userPressedTrue) {
//        //boolean answerIsTrue = answerKey[currentIndex].isTrueQuestion();
//        boolean answerIsTrue = model.isTrueQuestion();
//
//        /*int res;
//
//        if (userPressedTrue == answerIsTrue) {
//            //res = R.string.correct_toast;
//            res = model.getCorrectAnswer();
//        } else {
//            //res = R.string.incorrect_toast;
//            res = model.getIncorrectAnswer();
//        }
//
//        //Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
//        view.setAnswer(res);*/
//
//        view.setAnswer(model.getAnswer(userPressedTrue == answerIsTrue));
//    }

    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = model.isTrueQuestion();
        view.setAnswer(model.getAnswer(userPressedTrue == answerIsTrue));
    }

    /*@Override
    public void clickNextButton() {
        model.setNextQuestion();
    }*/

    @Override
    public void clickTrueButton() {
        checkAnswer(true);
    }

    @Override
    public void clickFalseButton() {
        checkAnswer(false);
    }

    @Override
    public void clickNextButton() {
        model.setNextQuestion();
        view.setQuestion(model.getCurrentQuestion());
    }

    @Override
    public void clickPreviousButton() {
        model.setPreviousQuestion();
        view.setQuestion(model.getCurrentQuestion());
    }

    /*@Override
    public void setNextQuestion() {
        model.setNextQuestion();
    }*/

    /*@Override
    public int getCurrentQuestion() {
        return model.getCurrentQuestion();
    }*/

    @Override
    public void startQuiz() {
        view.setQuestion(model.getCurrentQuestion());
    }
}
