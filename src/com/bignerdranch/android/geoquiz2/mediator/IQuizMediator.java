package com.bignerdranch.android.geoquiz2.mediator;


import com.bignerdranch.android.geoquiz2.controller.IQuizController;
import com.bignerdranch.android.geoquiz2.view.IQuizView;

public interface IQuizMediator {

    public IQuizController getQuizController(IQuizView view);
}
