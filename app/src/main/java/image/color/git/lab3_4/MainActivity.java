package image.color.git.lab3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.lab3_4.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        EditText timerValue = findViewById(R.id.editText);
        Intent intent = new Intent(this, TimerCountdownActivity.class);
        String message = timerValue.getText().toString() + "000";
        Log.d("buttonClick", "" + message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
