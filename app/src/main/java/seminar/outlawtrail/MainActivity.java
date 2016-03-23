package seminar.outlawtrail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//send help
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//testing the test branch

    public void go_to_about(View view) {
        Intent about = new Intent(this, AboutTrail.class);
        startActivity(about);
    }

    public void go_to_map(View view) {
        Intent map = new Intent(this, WebMap.class);
        startActivity(map);
    }


}