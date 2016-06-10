package ph.edu.dlsu.hellondk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(30);
        tv.setText(helloFromNDK());
        this.setContentView(tv);
        //setContentView(R.layout.activity_main);
    }

    public native String helloFromNDK();
static {
        System.loadLibrary("hello");
        }
}
