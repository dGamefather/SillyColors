package ctec.sillycolors.controller;

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
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		appButton = (Button) findViewById(R.id.someRandomButton);
		appText = (TextView) findViewById(R.id.someTextStuff);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		heyListen();
	}
	
	private void heyListen()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.kerriganPurple);
				appLayout.setBackgroundResource(R.color.dominionRed);
				appLayout.setBackgroundResource(R.color.raynorBlack);
				appLayout.setBackgroundResource(R.color.tardisBlue);
				appLayout.setBackgroundResource(R.color.linkTunicGreen);
				appLayout.setBackgroundResource(R.color.annoyingOrange);
			}
		});
	}
}
