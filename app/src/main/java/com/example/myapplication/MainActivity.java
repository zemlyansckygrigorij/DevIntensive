package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.example.myapplication.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = ConstantManager.TAG_PREFIX +"Main Activity";
   // protected EditText mEditText;
   // protected Button mRedButton, mGreenButton;
   // protected int mColorMode;
    /**
     * метод вызывается при создании активити (после изменении конфигурации/возврата к текущей
     * активности после его уничтожения.
     *
     * в данном методе инициализируются /производится:
     * - UI пользовательский интерфейс(статика)
     * -инициализация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     *
     * Не запускать длительные операции по работе с данными в onCreate() !!!
     *
     * @ param Bundle savedInstanceState - обьект со значениями связанными в Bundle- состояние UI
     *
     */
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
    //   mRedButton=(Button) findViewById(R.id.red_btn);//?
     //  mGreenButton=(Button) findViewById(R.id.green_btn);//?
    //   mEditText=(EditText) findViewById(R.id.textView);//?

     //  mRedButton.setOnClickListener(this);
    //   mGreenButton.setOnClickListener(this);
      // if(savedInstanceState == null){
//активити запускается впервые
     //  }else{
//активити уже создавалось
         //  savedInstanceState.getInstanceState.getInt(ConstantManager.COLOR_MODE_KEY);

        //   if(mColorModel==Color.RED){
         //    mEditText.setBackgroundColor(Color.RED);
          // }else if(mColorMode==Color.GREEN){
            //   mEditText.setBackgroundColor(Color.GREEN);
          // }
     //  }
    }


    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происходит регистрация подписки на события остановка которых была
     * произведена в onStop()
    * */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }


    /**
     * метод вызывается когда активити становится доступна пользователю для взаимодействии
     *  в данном методе как правило происходит запуск анимации/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики / запуск выполнения потоков  и т.п.
     * метод должен быть максимально легковесным для максимальной отзывчивости UI
     *
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    /**
     * метод вызывается когда текущая активити теряет фокус , но остается видимой(всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д.)
     * <p/>
     * в данном методе реализуют сохранение легковесных UI данных/анимации/аудио/виде  и т.д.
     *
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    /**
     * метод вызывается когда  активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий , остановка сложных анимаций, сложные операции по
     * сохранению данных/ прерывание запущенных потоков/ и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызова
     * метода  finish())
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }


    /**
     * метод вызывается при рестарте работы активити/возобновлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логикакоторая должна быть реализованна именно
     * при рестарте активности - напрмер запрос к серверу которые необходимо вызвать при возвращении
     * из другой активности(обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/ специфическая бизнес логика завязанная именно на перезапуске активити)
     *
     *
     *
     * (когда это происходит системно или после вызова
     * метода  finish())
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
   /* protected void onClick(View v) {
        switch(v.getId()){
            case R.id.green_btn:
                mEditText.setBackgroundColor(Color.GREEN);
                  mColorMode = Color.GREEN;
                break;
            case R.id.red_btn:
                mEditText.setBackgroundColor(Color.RED);
                   mColorMode = Color.RED;
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG,"onSaveInstanceState");
        outState.putInt(ConstantManager.COLOR_MODE_KEY,mColorMode);
    }
*/
}
