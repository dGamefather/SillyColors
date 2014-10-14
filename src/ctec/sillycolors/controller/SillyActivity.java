package ctec.sillycolors.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity
{
	
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorsList;
	private ArrayList<Integer> soundsList;
	
	/**
	 * Creates the app screen.
	 * 
	 * @param onCreate
	 *            The creation of the app screen.
	 * @version 1.1 10/14/2014
	 * @author Brennan Litster
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		appButton = (Button) findViewById(R.id.someRandomButton);
		appText = (TextView) findViewById(R.id.someTextStuff);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorsList = new ArrayList<Integer>();
		soundsList = new ArrayList<Integer>();
		
		fillTheColors();
		hearTheSounds();
		heyListen();
	}
	
	/**
	 * Creates the list of colors to change the screen background.
	 * 
	 * @param fillTheColors()
	 *            The list of colors.
	 * @version 1.1 10/14/2014
	 * @author Brennan Litster
	 */
	private void fillTheColors()
	{
		colorsList.add(R.color.tardisBlue);
		colorsList.add(R.color.kerriganPurple);
		colorsList.add(R.color.raynorBlack);
		colorsList.add(R.color.annoyingOrange);
		colorsList.add(R.color.linkTunicGreen);
		colorsList.add(R.color.dominionRed);
	}
	
	/**
	 * Creates the list of texts.
	 * 
	 * @param hearTheSounds()
	 *            The list of text.
	 * @version 1.1 10/14/2014
	 * @author Brennan Litster
	 */
	private void hearTheSounds()
	{
		soundsList.add(R.string.sarcasticText);
		soundsList.add(R.string.soundsText);
		soundsList.add(R.string.labelText);
	}
	
	/**
	 * Gives functionality to the button.
	 * 
	 * @param heyListen()
	 *            Allows button to do something.
	 * @version 1.1 10/14/2014
	 * @author Brennan Litster
	 */
	private void heyListen()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				int randomPosition = (int) (Math.random() * colorsList.size());
				int randomBeep = (int) (Math.random() * soundsList.size());
				appLayout.setBackgroundResource(colorsList.get(randomPosition));
				appText.setText(soundsList.get(randomBeep));
				appText.setVisibility(0);
			}
		});
	}
}
