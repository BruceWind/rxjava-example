package rxjava.example.wei.rxjavaex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        checkBox = (CheckBox) findViewById(R.id.checkBox);


        button.setOnClickListener((v)-> {
            String[] strs={"1","2"};
            Observable.from(strs)
                    .observeOn(Schedulers.computation())
                    .subscribe(s -> Log.d("action1",s) );

//            Observable.just(1, 2, 3, 4)
//                    .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
//                    .observeOn(Schedulers.newThread()) // 指定 Subscriber 的回调发生在主线程
//                    .subscribe((o)  -> Log.d("call",""+o));
        });



    }

    private void initObserver()
    {

    }
}
