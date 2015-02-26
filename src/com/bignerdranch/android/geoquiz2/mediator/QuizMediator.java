package com.bignerdranch.android.geoquiz2.mediator;

import android.app.Application;
import com.bignerdranch.android.geoquiz2.controller.IQuizController;
import com.bignerdranch.android.geoquiz2.controller.QuizController;
import com.bignerdranch.android.geoquiz2.model.QuizModel;
import com.bignerdranch.android.geoquiz2.view.IQuizView;
import com.bignerdranch.android.geoquiz2.view.QuizViewActivity;

public class QuizMediator extends Application implements IQuizMediator {


    @Override
    public IQuizController getQuizController(IQuizView view) {

        if(view instanceof QuizViewActivity) { //todo
            //return new QuizController(view);
            return new QuizController(view, new QuizModel());
        }
        return null;
    }

}
