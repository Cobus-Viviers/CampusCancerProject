package cobusviviers.campuscancerproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityMain extends AppCompatActivity {

    ListView mainList;

    String[] names = {
            "Breast Cancer",
            "Lung Cancer",
            "Colorectum Cancer",
            "Prostate Cancer",
            "Stomach Cancer",
            "Liver Cancer",
            "Endometrial Cancer",
            "Leukaemia",
            "Thyroid Cancer",
            "Melanoma"};

    Integer[] imageIds = {
            R.mipmap.ic_breast_cancer,
            R.mipmap.ic_lung_cancer,
            R.mipmap.ic_colorectum_cancer,
            R.mipmap.ic_prostate_cancer,
            R.mipmap.ic_stomach_cancer,
            R.mipmap.ic_liver_cancer,
            R.mipmap.ic_endometrial_cancer,
            R.mipmap.ic_leukaemia,
            R.mipmap.ic_thyroid_cancer,
            R.mipmap.ic_melanoma};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListAdapter adapter = new ListAdapter(this.getBaseContext() ,names,imageIds);
        mainList = (ListView)findViewById(R.id.mainList);
        mainList.setAdapter(adapter);

        final Intent openActivityBreast = new Intent(this, ActivityBreast.class);
        final Intent openActivityLung = new Intent(this, ActivityLung.class);
        final Intent openActivityColorectum = new Intent(this, ActivityColorectum.class);
        final Intent openActivityProstate = new Intent(this, ActivityProstate.class);
        final Intent openActivityStomach = new Intent(this, ActivityStomach.class);
        final Intent openActivityLiver = new Intent(this, ActivityLiver.class);
        final Intent openActivityEndometrial = new Intent(this, ActivityEndometrial.class);
        final Intent openActivityLeukaemia = new Intent(this, ActivityLeukaemia.class);
        final Intent openActivityThyroid = new Intent(this, ActivityThyroid.class);
        final Intent openActivityMelanoma = new Intent(this, ActivityMelanoma.class);


        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(openActivityBreast);
                        break;
                    case 1:
                        startActivity(openActivityLung);
                        break;
                    case 2:
                        startActivity(openActivityColorectum);
                        break;
                    case 3:
                        startActivity(openActivityProstate);
                        break;
                    case 4:
                        startActivity(openActivityStomach);
                        break;
                    case 5:
                        startActivity(openActivityLiver);
                        break;
                    case 6:
                        startActivity(openActivityEndometrial);
                        break;
                    case 7:
                        startActivity(openActivityLeukaemia);
                        break;
                    case 8:
                        startActivity(openActivityThyroid);
                        break;
                    case 9:
                        startActivity(openActivityMelanoma);
                        break;
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
