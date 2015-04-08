package com.dealfaro.luca.lclicker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickButton(View v) {
        Button b = (Button) v;
        String t = b.getText().toString();
        EditText tv = (EditText) findViewById(R.id.textView);
        tv.append(t);
    }

    public void clickDel(View v) {
        Button b = (Button) v;
        //String t = b.getText().toString();
        EditText tv = (EditText) findViewById(R.id.textView);
        String t = tv.getText().toString();
        t = t.substring(0,t.length()-1);
        tv.setText(t);
    }

    public void clickCall(View v) {
        //Button b = (Button) v;
        //String t = b.getText().toString();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("");
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
