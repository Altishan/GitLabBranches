package tcss450.uw.edu.gitlabbranches;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayAndyActivity(View view) {
        Intent intent = new Intent(this, DisplayAndyActivity.class);
        startActivity(intent);
    }

    public void displayCaseyActivity(View view) {
        Intent caseyIntent = new Intent(this, DisplayCaseyActivity.class);
        startActivity(caseyIntent);
    }
}
