package cobusviviers.campuscancerproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySplash extends AppCompatActivity {

    //splash scrren
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread tFin = new Thread(){
            public  void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){

                }
                finally {
                    Intent intent = new Intent(getApplicationContext(), ActivityMain.class);
                    startActivity(intent);
                    finish();
                }

            }
        };
        tFin.start();
    }
}
