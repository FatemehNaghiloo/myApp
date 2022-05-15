package app.barman.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public int myFunction(){
        int a = 5, b = 2, c;
        c = a+b;

        return c;
        
        //comment1
        //comment2
        //comment3
        //comment4
        //comment5
    }
}
