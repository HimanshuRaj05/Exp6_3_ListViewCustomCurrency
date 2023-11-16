package com.intreve.listviewcustomcurrency;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data={"India", "Pakistan", "Sri Lanka", "China", "Bangladesh","Nepal","Afganistan","North Korea"};
        String[] currency={"Indian Rupee", "Pakistani Rupee", "Sri Lankan Rupee", "Reniminbi", "Bangladeshi Taka", "Nepalese Rupee", "Afghani", "Korean Won"};


        int images[]={R.drawable.india, R.drawable.pakistan, R.drawable.srilanka, R.drawable.china, R.drawable.bangladesh, R.drawable.nepal, R.drawable.afganistan, R.drawable.northkorea};

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, data,currency, images);
        listView.setAdapter(adapter);
    }
}