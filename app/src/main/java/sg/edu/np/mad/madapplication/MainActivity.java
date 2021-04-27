package sg.edu.np.mad.madapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!");
        User user = new User("Reiner", "Student", 001, false );
        Button button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.isFollowed() == false){
                    button.setText("Unfollow");
                    user.setFollowed(true);
                }
                else{
                    button.setText("Follow");
                    user.setFollowed(false);
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}