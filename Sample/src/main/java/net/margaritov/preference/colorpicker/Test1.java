package net.margaritov.preference.colorpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class Test1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ColorPickerDialog colorPickerDialog = new ColorPickerDialog(this, Color.RED);
        colorPickerDialog.setAlphaSliderVisible(true);
        colorPickerDialog.setHexValueEnabled(true);
        colorPickerDialog.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener() {
            @Override
            public void onColorChanged(int color) {
                System.out.println(ColorPickerPreference.convertToARGB(color));
            }
        });
        colorPickerDialog.show();
    }
}
