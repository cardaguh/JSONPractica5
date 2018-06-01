package com.jikansoftware.recyclerviewpractica5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> productList;

    RecyclerView recyclerView;

    Context context;

    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "Apple Macbook Air",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.mac));
        productList.add(new Product(
                1,
                "Dell Inspiron",
                "14.3 inch, Silver, 1.35 kg",
                4.6,
                40000,
                R.drawable.dell
        ));

        productList.add(new Product(
                1,
                "Microsoft Surface 4th Gen",
                "13.3 inch, Silver, 1.45 kg",
                4.0,
                50000,
                R.drawable.surface
        ));

        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(context, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Mensaje hola: "+ cont++, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }


}
