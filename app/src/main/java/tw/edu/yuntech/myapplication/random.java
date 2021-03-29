package tw.edu.yuntech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class random {
    public int rr(int a,int b){

        int s =(int)(Math.random() * (b - a + 1) + a);
        return s;
    }

}
