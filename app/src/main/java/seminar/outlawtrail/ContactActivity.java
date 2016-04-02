package seminar.outlawtrail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    public static String facebookPath = "https://www.facebook.com/outlawtrailscenicbyway/";
    public static String googlePath = "https://plus.google.com/106336481720792541207/posts";
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
        Intent calendar = new Intent(this, CalendarActivity.class);
        startActivity(calendar);
    }

    public void launch_facebook(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookPath));
        startActivity(i);
    }

    public void launch_google(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(googlePath));
        startActivity(i);
    }

}