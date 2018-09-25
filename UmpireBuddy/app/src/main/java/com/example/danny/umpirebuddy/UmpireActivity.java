package com.example.danny.umpirebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class UmpireActivity extends AppCompatActivity {

    private Button mStrikeButton;
    private Button mBallButton;
    int strikeInt = 0;
    int ballsInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umpire);

        final TextView ballText = (TextView) findViewById(R.id.ballText);
        final TextView strikeText = (TextView) findViewById(R.id.strikeText);
        ballText.setText(Integer.toString(ballsInt));
        strikeText.setText(Integer.toString(strikeInt));


        mBallButton = (Button) findViewById(R.id.ball_button);
        mBallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ballsInt == 3)
                {
                    Toast.makeText(UmpireActivity.this,
                            R.string.takeABaseToast,
                            Toast.LENGTH_LONG).show();
                    ballsInt = 0;
                    strikeInt = 0;
                    ballText.setText(Integer.toString(ballsInt));
                    strikeText.setText(Integer.toString(strikeInt));
                    return;
                }
                ballsInt += 1;
                ballText.setText(Integer.toString(ballsInt));
            }
        });

        mStrikeButton = (Button) findViewById(R.id.strike_button);
        mStrikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (strikeInt == 2)
                {
                    Toast.makeText(UmpireActivity.this,
                            R.string.batterOutToast,
                            Toast.LENGTH_LONG).show();
                    ballsInt = 0;
                    strikeInt = 0;
                    ballText.setText(Integer.toString(ballsInt));
                    strikeText.setText(Integer.toString(strikeInt));
                    return;
                }
                strikeInt += 1;
                strikeText.setText(Integer.toString(strikeInt));
            }
        });
    }
}



