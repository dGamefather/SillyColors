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
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		appButton = (Button) findViewById(R.id.someRandomButton);
		appText = (TextView) findViewById(R.id.someTextStuff);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorsList = new ArrayList<Integer>();
		
		fillTheColors();
		heyListen();
	}
	
	private void fillTheColors()
	{
		colorsList.add(R.color.tardisBlue);
		colorsList.add(R.color.kerriganPurple);
		colorsList.add(R.color.raynorBlack);
		colorsList.add(R.color.annoyingOrange);
		colorsList.add(R.color.linkTunicGreen);
		colorsList.add(R.color.dominionRed);
	}
	
	private void heyListen()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundColor(colorsList);
			}
		});
	}
}
