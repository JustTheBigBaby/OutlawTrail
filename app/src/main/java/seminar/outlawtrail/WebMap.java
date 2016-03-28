package seminar.outlawtrail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebMap extends AppCompatActivity {
    WebView webView;
    String mapPath = "https://www.google.com/maps/d/u/0/viewer?mid=z5cNDCbZgqkg.kReB3k9EGYyI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_map);

    }

    public void go_to_about(View view) {
        Intent about = new Intent(this, AboutTrail.class);
        startActivity(about);
    }

    public void go_home(View view) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }

    public void launch_google(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(mapPath));
        startActivity(i);
    }

}
