package tw.edu.yuntech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] strs={"狗屎","鳥屎","鼻屎"};
    String[] nums;
    Set ad;
    String v;
    boolean yy=false;
    ArrayAdapter<String> adapter;
    TextView T1,T2;
    EditText E1,E2,E3;
    Button B1;
    NumberPicker N1;
    CheckBox C1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1=findViewById(R.id.T1);
        T2=findViewById(R.id.T2);
        E1=findViewById(R.id.E1);
        E2=findViewById(R.id.E2);
        E3=findViewById(R.id.E3);
        B1=findViewById(R.id.B1);
        N1=(NumberPicker) findViewById(R.id.N1);
        C1=findViewById(R.id.C1);
        spinner=findViewById(R.id.spinner);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,strs);
        spinner.setAdapter(adapter);
C1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(yy==false)yy=true;
        if(yy==true)yy=false;
    }
});
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                T1.setText(strs[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
/*
        nums =new String[20];
        for(int i=1;i<20;i++){
            nums[i]=Integer.toString(i+1);
        }
        N1=(NumberPicker) findViewById(R.id.N1);
        N1.setMinValue(1);
        N1.setMaxValue(nums.length);
        N1.setValue(5);
        N1.setDisplayedValues(nums);
*/


        B1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(E1.getText()!=null &&E2.getText()!=null &&E3.getText()!=null){

                    random aa = new random();
                    int a=Integer.valueOf(E1.getText().toString());
                    int b=Integer.valueOf(E2.getText().toString());
                    int c=Integer.valueOf(E3.getText().toString());
                    int bb,cc,dd;
                    int vv[] = new int[50];
                    T2.clearComposingText();
                    ad=new HashSet();
                    ad.clear();
                    for(bb = 0;bb<=c;bb++){
                        vv[bb] = 0;
                        v="";
                    }
                if(C1.isChecked()){

                        do{
                            ad.add(aa.rr(a,b));
                        }while (ad.size()<c);



                    for(bb = 0;bb<vv.length-2;bb++){
                        T2.setText(String.valueOf(ad));
                    }
                }else{
                    for(bb = 0;bb<c;bb++){
                    vv[bb] = aa.rr(a,b);

                    v += ","+ String.valueOf(vv[bb]);

                    }
                    for(bb = 0;bb<vv.length-2;bb++){
                        T2.setText(v);
                    }
                }




                //}
            }
        });



    }
}