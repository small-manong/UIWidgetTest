package com.example.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private boolean click = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        button.setOnClickListener(this);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);
                /**
                 * 进度条是否显示
                 */
                /*if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }*/
                /**
                 * 点击按钮，动态实现图片的转换
                 */
                /*click = !click;
                if (click) {
                    imageView.setImageResource(R.drawable.img_2);
                } else {
                    imageView.setImageResource(R.drawable.img_1);
                }*/
                /**
                 * 获取editText的值，并用toast显示出来
                 */
               /* String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();*/
                break;
            default:
                break;
        }
    }
}
