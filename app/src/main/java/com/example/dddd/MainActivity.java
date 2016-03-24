package com.example.dddd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    int n = 0;
    int m = 0;
    int k = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.button);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final String text1 = getString(R.string.text1);
        final String text2 = getString(R.string.text2);
        final String text3 = getString(R.string.text3);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //ボタンを押して画像をアップルロゴに変える
                if(i == 1){
                    i = 0;
                    imageView.setImageResource(R.drawable.apple);
                }else{
                    i = 1;
                    imageView.setImageResource(R.drawable.eaten_apple);
                }
                //ボタンを押してテキストを変える
               if(n == 1){
                   n = 0;
                   textView.setText(text1);

               }else{
                   n = 1;
                   textView.setText(text2);
               }
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //画像をアンドロイドがアップルを食べているのに変える
                if(m == 1){
                    m = 0;
                    imageView.setImageResource(R.drawable.apple);
                }else{
                    m = 1;
                    imageView.setImageResource(R.drawable.eatenapple);
                }
                //アンドロイドが食べている時のテキスト
                if(k == 1){
                    k = 0;
                    textView.setText(text1);

                }else{
                    k = 1;
                    textView.setText(text3);
                }



            }
        });



    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
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
    }
}
