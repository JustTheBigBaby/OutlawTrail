package seminar.outlawtrail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AboutTrail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_trail);

    }

    public void go_home(View view) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }

    public void go_to_map(View view) {
        Intent map = new Intent(this, MapsActivity.class);
        startActivity(map);
    }

    public void go_to_calendar(View view) {
        Intent calendar = new Intent(this, CalendarActivity.class);
        startActivity(calendar);
    }


    public void go_to_contact(View view) {
        Intent contact = new Intent(this, ContactActivity.class);
        startActivity(contact);
    }



}
