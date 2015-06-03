package amhamogus.com.udacityprojectzero;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Called when the user touches a project button.
     */
    public void projectButtonSelected(View view) {

        // Cancel previous toast message
        if(mToast != null){
            mToast.cancel();
        }

        Button selectedButton = (Button) view;

        // Show new toast message based on selected button
        mToast = Toast.makeText(this,
                "This button will launch my " + selectedButton.getText().toString() + " app!",
                Toast.LENGTH_SHORT);
        mToast.show();
    }
}
