package ru.alexdev.cards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private Button buttonGameGuess;
	private ImageButton buttonQuestion;
    private ImageButton buttonResults;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonGameGuess = (Button) findViewById(R.id.button_game_guess);
        buttonResults = (ImageButton) findViewById(R.id.imageButton2);
        
        buttonQuestion = (ImageButton) findViewById(R.id.button_question);
        listenerSelectGameButtons();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
  


    
    /**
     * Обработчик нажатий на кнопки
     * 
     * @return void
     */
    private void listenerSelectGameButtons() 
    {
    	buttonGameGuess.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
        		Intent intent = new Intent(MainActivity.this,SelectThemeActivity.class);
        		startActivity(intent);
        	}
		});
    	
    	buttonResults.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Intent intent = new Intent(MainActivity.this,ResultsActivity.class);
        		startActivity(intent);
        	}
        }); 
    	
    	buttonQuestion.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,HelpActivity.class);
        		startActivity(intent);
			}
		});
    }    
    
    
    
}
