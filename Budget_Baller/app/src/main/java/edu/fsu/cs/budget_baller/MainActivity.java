package edu.fsu.cs.budget_baller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button trans = findViewById(R.id.Trans_Entry);
        final Button budget = findViewById(R.id.Budget_Goal);
        final Button stat = findViewById(R.id.Stat_Analysis);
        final Button time = findViewById(R.id.Time_Based);
        final Button purchase = findViewById(R.id.Purchase);
    }

    public void trans(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, Transaction_Entry.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(myIntent);
    }
    public void budget(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, Budget_Goal.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(myIntent);
    }
    public void stat(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, Statistical_Analysis.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(myIntent);
    }
    public void time(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, Time_Based_Graph.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(myIntent);
    }
    public void purchase(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, Purchase_Categorization.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(myIntent);
    }
}
