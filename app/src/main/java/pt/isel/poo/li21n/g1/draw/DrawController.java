package pt.isel.poo.li21n.g1.draw.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import pt.isel.poo.li21n.g1.draw.app.model.DrawModel;
import pt.isel.poo.li21n.g1.draw.app.model.Figure;
import pt.isel.poo.li21n.g1.draw.app.view.DrawView;

public class DrawController extends Activity {
    private String FILE = "draw.txt";
    private DrawModel model;
    private DrawView view;

    public DrawController(Context context) {}

    private void onReset() {}

    private void onLoad() {}

    private void onSave() {}

    //public Figure createSelectedFigure(int x, int y) {
    //    return new Figure();
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
