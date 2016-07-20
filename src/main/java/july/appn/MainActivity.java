package july.appn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        July.init();
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.t);
        Toast.makeText(this, "" + July.hello(), Toast.LENGTH_LONG).show();
        tv.setText(July.hello());
    }


}
