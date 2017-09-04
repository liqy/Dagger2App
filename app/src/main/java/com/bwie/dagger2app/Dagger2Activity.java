package com.bwie.dagger2app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Dagger2Activity extends AppCompatActivity {

    @BindView(R.id.label_dagger)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2);
        ButterKnife.bind(this);

        Car car=new Car();
        textView.setText(car.engineA.toString()+"\n"+car.engineB.toString());

    }
}
