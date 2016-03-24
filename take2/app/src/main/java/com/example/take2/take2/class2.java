package com.example.take2.take2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by arjun on 3/20/2016.
 */
public class class2 extends AppCompatActivity {

    @Override

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.start_page);
    }

    public void showAlertDialog(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setMessage("Confirm Return");
        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"RATE:Rs \n time:  mm:ss",Toast.LENGTH_LONG).show();
                dialog.cancel();
                //// TODO: 3/23/2016 go to first page

            }
        });
        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //// TODO: 3/23/2016 go to first page
            }
        });
        alertDialog.setMessage("Confirm Return");
        alertDialog.show();

    }
}