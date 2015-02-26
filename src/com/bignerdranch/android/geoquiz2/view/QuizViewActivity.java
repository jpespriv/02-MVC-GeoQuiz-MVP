package com.bignerdranch.android.geoquiz2.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.bignerdranch.android.geoquiz2.R;
import com.bignerdranch.android.geoquiz2.controller.IQuizController;
import com.bignerdranch.android.geoquiz2.mediator.IQuizMediator;

public class QuizViewActivity extends Activity implements IQuizView {
	
    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private Button previousButton;
    private TextView questionTextView;

    /*private int currentIndex = 0;

    private TrueFalse[] answerKey = new TrueFalse[] {
        new TrueFalse(R.string.question_oceans, true),
        new TrueFalse(R.string.question_mideast, false),
        new TrueFalse(R.string.question_africa, false),
        new TrueFalse(R.string.question_americas, true),
        new TrueFalse(R.string.question_asia, true)
    };*/
    
    private IQuizMediator mediator;
    private IQuizController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mediator = (IQuizMediator) getApplication();
        controller = mediator.getQuizController(this);

        setContentView(R.layout.activity_quiz);

        questionTextView = (TextView)findViewById(R.id.question_text_view);

        trueButton = (Button)findViewById(R.id.true_button);
        trueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //checkAnswer(true);
                //controller.checkAnswer(true);
                controller.clickTrueButton();
            }
        });

        falseButton = (Button)findViewById(R.id.false_button);
        falseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //checkAnswer(false);
                //controller.checkAnswer(false);
                controller.clickFalseButton();
            }
        });

        nextButton = (Button)findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //currentIndex = (currentIndex + 1) % answerKey.length;
                controller.clickNextButton();
                //controller.setNextQuestion();
                //showCurrentQuestion();
            }
        });

        previousButton = (Button)findViewById(R.id.prev_button);
        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                controller.clickPreviousButton();
            }
        });
        //showCurrentQuestion();
        controller.startQuiz();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_quiz, menu);
        return true;
    }


    @Override
    public void setAnswer(int answer) {
        Toast.makeText(QuizViewActivity.this, answer, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setQuestion(int question) {
        questionTextView.setText(question);
    }

    /*private void showCurrentQuestion() {
        //int question = answerKey[currentIndex].getQuestion();
        //questionTextView.setText(question);
        questionTextView.setText(controller.getCurrentQuestion());
    }*/


    /*private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = answerKey[currentIndex].isTrueQuestion();

        int messageResId = 0;

        if (userPressedTrue == answerIsTrue) {
            messageResId = R.string.correct_toast;
        } else {
            messageResId = R.string.incorrect_toast;
        }

        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }
    */

}
