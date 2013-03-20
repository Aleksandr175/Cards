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
	private ImageButton buttonResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonGameGuess = (Button) findViewById(R.id.button_game_guess);
        buttonResults = (ImageButton) findViewById(R.id.imageButton2);
        listenerSelectGameGuess();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
  


    
    /**
     * Обработчик нажатия на кнопку "Угадай"
     * 
     * @return void
     */
    private void listenerSelectGameGuess() 
    {
    	buttonGameGuess.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.activity_game_guess);
			}
		});
    	
    	buttonResults.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Intent intent = new Intent(MainActivity.this,ResultsActivity.class);
        		startActivity(intent);
        	}
        }); 
    }    
}
