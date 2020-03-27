package com.example.maervit;

<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< Updated upstream
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

=======
import android.widget.Toast;
>>>>>>> Stashed changes
import me.dm7.barcodescanner.zxing.ZXingScannerView;


public class MainActivity extends AppCompatActivity {

    private ZXingScannerView scannerView;
    boolean shouldStart = true;
    boolean question = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
<<<<<<< Updated upstream
        setContentView(R.layout.splash_screen);

        Handler handler = new Handler();
=======
        setContentView(R.layout.activity_main);

    }



    public void scanCode (View v) {
        scannerView = new ZXingScannerView(this);
        scannerView.setResultHandler(new ZXingScannerResultHandler());

        setContentView(scannerView);
        scannerView.startCamera();
>>>>>>> Stashed changes

        handler.postDelayed(run,1500);
    }




    class ZXingScannerResultHandler implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(com.google.zxing.Result result) {
            String resultCodeString = result.getText();
            long resultCode = Long.parseLong(resultCodeString);
            long liner = 884851041913L;
            if (resultCode == liner){
                Toast.makeText(MainActivity.this, "prave si naskenoval liner", Toast.LENGTH_LONG).show();
                openMainActivity2();
            }else{
                Toast.makeText(MainActivity.this, "neurcene", Toast.LENGTH_SHORT).show();
            }

            setContentView(R.layout.activity_main);
            scannerView.stopCamera();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //SimplifiableIfStatement
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show();
                openONas();
                return true;
            case R.id.faq:
                Toast.makeText(this, "Faq", Toast.LENGTH_LONG).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void openMainActivity2(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent );
    }
    public void openHomeActivity(){
        Intent intent3 = new Intent(this, HomeActivity.class);
        startActivity(intent3 );
    }

    public void openONas(){
        Intent intent = new Intent(this, Onas.class);
        startActivity(intent);
    }
}







