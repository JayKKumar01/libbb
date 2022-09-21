package github.jaykkumar01.libbb;

import android.content.Context;
import android.widget.Toast;

public class Test {
    Context context;

    public Test(Context context, String str) {
        this.context = context;
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
