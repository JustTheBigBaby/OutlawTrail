package seminar.outlawtrail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void go_home(View view) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }

    public void go_to_about(View view) {
        Intent about = new Intent(this, AboutTrail.class);
        startActivity(about);
    }

    public void go_to_map(View view) {
        Intent map = new Intent(this, MapsActivity.class);
        startActivity(map);
    }

    public void go_to_calendar(View view) {
        Intent map = new Intent(this, CalendarActivity.class);
        startActivity(calendar);
    }


}