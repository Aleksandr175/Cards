package ru.alexdev.cards;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class HelpActivity extends Activity {
	private ImageButton back;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		
		back = (ImageButton) findViewById(R.id.imageGoToMenuFromHelp);
		listenerGameActivity();
		
	}
	
	/**
     * Обработчик нажатий на кнопки
     * 
     * @return void
     */
    private void listenerGameActivity() 
    {
    	
    	back.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		finish();
        	}
        }); 
    }
    

}
