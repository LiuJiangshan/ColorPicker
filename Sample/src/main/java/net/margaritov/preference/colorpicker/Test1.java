package net.margaritov.preference.colorpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class Test1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new ColorPickerDialog(this, Color.RED).show();
    }
}
