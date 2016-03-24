package com.example.take2.take2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class take2 extends AppCompatActivity implements View.OnClickListener
{

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       Button button1;
       Button button2;

       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take2);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
       super.onCreate(savedInstanceState);
       setContentView(R.layout.book_page);
        button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }



    private void button1Click()
    {
        startActivity(new Intent("com.example.take2.take2.class2"));

    }


    private void button2Click()
    {
        startActivity(new Intent("com.example.take2.take2.book_time"));

    }


    public void onClick(View view){
        switch(view.getId())
        {
            case R.id.button1:
            button1Click();
                break;

            case R.id.button2:
                button2Click();
                break;

        }

    }

    /** Called when the user touches the button */
//                public void sendMessage(View v) {
//                // Do something in response to button click
//                Button button =(Button) v;
//                ((Button) v).setText("clickedd");
//}
}
