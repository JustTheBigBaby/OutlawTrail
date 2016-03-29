package seminar.outlawtrail;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go_to_about(View view) {
        Intent about = new Intent(this, AboutTrail.class);
        startActivity(about);
    }

    public void go_to_map(View view) {
        Intent map = new Intent(this, MapsActivity.class);
        startActivity(map);
    }

    public void join_the_gang(View view){
        Intent joinGang = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nebraskaoutlawtrail.org/join-the-gang-membership/"));
        startActivity(joinGang);
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