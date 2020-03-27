package com.example.maervit;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    // VARIABLES
    Animation topAnimation;
    ImageView image;
    boolean shouldStart = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();


        Handler handler = new Handler();
        handler.postDelayed(run,1410);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);

        //image

<<<<<<< Updated upstream

            setContentView(R.layout.activity_main);
            scannerView.stopCamera();
        }
=======
        image = findViewById(R.id.imageView2);
        image.setAnimation(topAnimation);
>>>>>>> Stashed changes
    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1410);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

<<<<<<< Updated upstream
        //SimplifiableIfStatement
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "About us", Toast.LENGTH_LONG).show();
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
=======
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
            HomeActivity.this.finish();
        }
    }


    Runnable run = new Runnable() {
        @Override
        public void run() {
            if(shouldStart = true) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        }
    };
    @Override
    protected void onPause() {
        shouldStart = false;
        super.onPause();
        this.finish();
    }
>>>>>>> Stashed changes
}
