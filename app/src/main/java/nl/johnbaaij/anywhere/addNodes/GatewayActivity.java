package nl.johnbaaij.anywhere.addNodes;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import nl.johnbaaij.anywhere.R;
import nl.johnbaaij.anywhere.abstractClasses.AbstractToolbarActivity;


public class GatewayActivity extends AbstractToolbarActivity {

    private ArrayList<String> mSettingLabels = new ArrayList<>();
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_nodes);

        textView = (TextView) findViewById(R.id.ProgressText);
        textView.setText("Gateway connecting");


    }
}
