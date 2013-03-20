package ru.alexdev.cards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ResultsActivity extends Activity {

	private Button back;	
	private TextView words;
	private TextView level;
	private TextView wordLearnedTxt;
	private TextView expTxt;
	private TextView expTotalTxt;
	private TextView expNextTxt;
	private ProgressBar bar;
	private ProgressBar barExp;
	
	int wordMax;
	int wordCorrect;
	int wordLearned;
	int exp;
	int expTotal;
	int expNext;
	int lvl;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
  	
    	words = (TextView) findViewById(R.id.words);
    	level= (TextView) findViewById(R.id.level);
    	wordLearnedTxt = (TextView) findViewById(R.id.wordLearned);
    	expTxt= (TextView) findViewById(R.id.exp);
    	expTotalTxt= (TextView) findViewById(R.id.expTotal);
    	expNextTxt= (TextView) findViewById(R.id.expNext);
    	bar = (ProgressBar) findViewById(R.id.bar1);
    	barExp = (ProgressBar) findViewById(R.id.bar2);
    	
    	wordMax = 10;
    	wordCorrect = 7;
    	wordLearned = 23;
    	exp = 7;
    	expTotal = 213;
    	expNext = 21;
    	lvl = 3;
    	
        back = (Button) findViewById(R.id.back);
        
        back.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v)
        	{
        		finish();
        	}
        });
        SetResults();
    }
    
    public void SetResults()
    {
    	words.setText("Верно отвечено "+ wordCorrect + " из "+ wordMax + " слов.");
    	level.setText("Уровень: " + lvl);
    	expTxt.setText("Опыт: +"+ exp);
    	expNextTxt.setText("Опыт до след. уровня: " + expNext);
    	wordLearnedTxt.setText("Слов выучено: "+ wordLearned);
    	expTotalTxt.setText("Суммарный опыт: "+expTotal);
    	bar.setMax(wordMax);
    	bar.setProgress(wordCorrect);
    	barExp.setMax(expTotal);
    	barExp.setProgress(expTotal-expNext);
    }
}
