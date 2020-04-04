package image.color.git.lab3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

public class TimerCountdownActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_countdown2);

        Log.d("onCreate", "this shit was created");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        textView = findViewById(R.id.timerDisplay);
        textView.setText(message);

        Long longMessage = Long.parseLong(message);

        Log.d("timer", "timer: " + longMessage);

        new CountDownTimer(longMessage, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
//                textView.setText("done!");
                Log.d("timer", "timer has ended");
                finish();
            }
        }.start();

    }

}
