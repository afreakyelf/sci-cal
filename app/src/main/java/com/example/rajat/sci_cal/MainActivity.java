package com.example.rajat.sci_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView first,second,operator,resultt;
    Button div,mul,add,sub,one,two,three,four,five,six,seven,eight,nine,equal,clear,sin,cos,tan,root,sqaure,zer0;
    String soperator=null;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        operator = findViewById(R.id.operator);
        resultt = findViewById(R.id.result);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);

        tan = findViewById(R.id.tan);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        root = findViewById(R.id.root);
        sqaure = findViewById(R.id.square);
        zer0 = findViewById(R.id.zero);

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            //   resultt.setText(String.valueOf(Math.tan(Math.toDegrees(Double.parseDouble(first.getText().toString())))));


                resultt.setText("= "+String.valueOf(Math.tan(Math.toRadians(Integer.parseInt(first.getText().toString())))));


            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultt.setText("= "+String.valueOf(Math.cos(Math.toRadians(Integer.parseInt(first.getText().toString())))));
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultt.setText("= "+String.valueOf(Math.sin(Math.toRadians(Integer.parseInt(first.getText().toString())))));
            }
        });

        sqaure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(first.getText().toString());
                double b = Math.pow(a,2);
                resultt.setText("= "+String.valueOf(b));
            }
        });


        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(first.getText().toString());
                double b = Math.sqrt(a);
                resultt.setText("= "+String.valueOf(b));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");
                second.setText("");
                operator.setText("");
                resultt.setText("");
            }
        });

        zer0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"0");
                }else {
                    second.setText(second.getText().toString()+"0");
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"1");
                }else {
                    second.setText(second.getText().toString()+"1");
                }


            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"2");
                }else {
                    second.setText(second.getText().toString()+"2");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"3");
                }else {
                    second.setText(second.getText().toString()+"3");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"4");
                }else {
                    second.setText(second.getText().toString()+"4");
                }
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"5");
                }else {
                    second.setText(second.getText().toString()+"5");
                }


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"6");
                }else {
                    second.setText(second.getText().toString()+"6");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"7");
                }else {
                    second.setText(second.getText().toString()+"7");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"8");
                }else {
                    second.setText(second.getText().toString()+"8");
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soperator = operator.getText().toString();
                if(soperator==""){
                    first.setText(first.getText().toString()+"9");
                }else {
                    second.setText(second.getText().toString()+"9");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator.setText("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator.setText("-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator.setText("*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator.setText("/");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(first.getText().toString())||TextUtils.isEmpty(second.getText().toString())){
                    return;
                }

                int a = Integer.parseInt(first.getText().toString());
                String o =operator.getText().toString();
                int b = Integer.parseInt(second.getText().toString());
                double result = 0.0;
                if(o=="+"){
                    result = a+b;
                }else if(o=="-"){
                    result = a-b;
                }else if(o=="*"){
                    result = a*b;
                }else if(o=="/") {
                    float esult = (float)a/b;
                    result = esult;
                }

                resultt.setText("= "+String.valueOf(result));

            }
        });
    }
}
