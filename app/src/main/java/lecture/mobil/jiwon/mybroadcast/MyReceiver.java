package lecture.mobil.jiwon.mybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 608 on 2017-05-25.
 */

public class MyReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"인텐트가 감지되었음!", Toast.LENGTH_LONG).show();
    }
}
