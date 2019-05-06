package pt.isel.poo.li21n.g1.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import pt.isel.poo.li21n.g1.draw.app.DrawController;
import pt.isel.poo.li21n.g1.draw.app.view.DrawView;

public class MainActivity extends AppCompatActivity {

    DrawController ctrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); /* we choose to go programming crazy mode */
        ctrl = new DrawController(this);

        /* layout for storing the buttons and radio group containers */
        final LinearLayout commands = new LinearLayout(this);

        final Button btnReset = new Button(this);
        btnReset.setText("Reset");
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reset", Toast.LENGTH_LONG).show();
            }
        });

        final Button btnLoad = new Button(this);
        btnLoad.setText("Load");
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Load", Toast.LENGTH_LONG).show();
            }
        });

        final Button btnSave = new Button(this);
        btnSave.setText("Save");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_LONG).show();
            }
        });

        final LinearLayout commandButtons = new LinearLayout(this);
        commandButtons.setOrientation(LinearLayout.HORIZONTAL);
        commandButtons.addView(btnReset);
        commandButtons.addView(btnLoad);
        commandButtons.addView(btnSave);

        final RadioGroup rdGroup = new RadioGroup(this);
        final RadioGroup.LayoutParams rdGroupParams = new RadioGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        final RadioButton rdBtnLine = new RadioButton(this);
        rdBtnLine.setText("Line");
        rdBtnLine.setId(1);

        final RadioButton rdBtnRect = new RadioButton(this);
        rdBtnRect.setText("Rect");
        rdBtnRect.setId(2);

        final RadioButton rdBtnPixel = new RadioButton(this);
        rdBtnPixel.setText("Pixel");
        rdBtnPixel.setId(3);

        final RadioButton rdBtnCircle = new RadioButton(this);
        rdBtnCircle.setText("Circle");
        rdBtnCircle.setId(4);

        rdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case 1:
                        Toast.makeText(MainActivity.this,"Line",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"Rect",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,"Pixel",Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this,"Circle",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                }
            }
        });

        rdGroup.setLayoutParams(rdGroupParams);
        rdGroup.setOrientation(RadioGroup.HORIZONTAL);
        rdGroup.addView(rdBtnLine);
        rdGroup.addView(rdBtnRect);
        rdGroup.addView(rdBtnPixel);
        rdGroup.addView(rdBtnCircle);

        commands.setOrientation(LinearLayout.VERTICAL);
        commands.addView(commandButtons);
        commands.addView(rdGroup);

        /* layout for draw figures */
        final LinearLayout layoutCanvas = new LinearLayout(this);
        final LinearLayout.LayoutParams layoutCanvasParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        DrawView drawView = new DrawView(ctrl);

        layoutCanvas.setLayoutParams(layoutCanvasParams);
        layoutCanvas.addView(drawView);

        /* main container for layouts */
        final LinearLayout layout = new LinearLayout(this);
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        layout.setLayoutParams(layoutParams);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(commands);
        layout.addView(layoutCanvas);

        setContentView(layout);
    }
}
