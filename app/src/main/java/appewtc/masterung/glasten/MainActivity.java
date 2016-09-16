package appewtc.masterung.glasten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, widthEditText,
            heightEditText, detailEditText;
    private ImageView imageView;
    private RadioGroup radioGroup;
    private RadioButton doorRadioButton, windowRadioButton;
    private String nameString, widthString, heightString,
            detailString, typeString, imageString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        widthEditText = (EditText) findViewById(R.id.editText2);
        heightEditText = (EditText) findViewById(R.id.editText3);
        detailEditText = (EditText) findViewById(R.id.editText4);
        imageView = (ImageView) findViewById(R.id.imageView);
        radioGroup = (RadioGroup) findViewById(R.id.ragType);
        doorRadioButton = (RadioButton) findViewById(R.id.radioButton);
        windowRadioButton = (RadioButton) findViewById(R.id.radioButton2);

    }   // Main Method

    public void clickSaveDataMain(View view) {

        //Get Value From Edit Text
        nameString = nameEditText.getText().toString().trim();
        widthString = widthEditText.getText().toString().trim();
        heightString = heightEditText.getText().toString().trim();
        detailString = detailEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") || widthString.equals("") ||
                heightString.equals("") || detailString.equals("")) {
            // Have Space
            MyAlert myAlert = new MyAlert(this, R.drawable.doremon48,
                    "มีช่องว่าง", "กรุณากรอก ทุกช่อง คะ");
            myAlert.myDialog();
        }


    }   // clickSave

    public void clickListDataMain(View view) {

    }

}   // Main Class
