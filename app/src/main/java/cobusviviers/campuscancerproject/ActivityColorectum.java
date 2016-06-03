package cobusviviers.campuscancerproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityColorectum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorectum);
    }

    public void openFacebookPage(View view) {
        Uri uri = Uri.parse("https://www.facebook.com/BC-Fight-against-Cancer-1290082387672134/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openDonatePage(View view) {
        Uri uri = Uri.parse("http://www.cancerresearchuk.org/support-us/donate");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
