package com.example.myapplication.ui.activities;

/**
 * Created by ГРИГОРИЙ on 04.07.2016.
 */
package softdesign.devintensive.ui.activities;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.List;

        import butterknife.BindView;
        import butterknife.BindViews;
        import butterknife.ButterKnife;
        import softdesign.devintensive.R;


public class AuthActivity extends AppCompatActivity {

    @BindViews({R.id.auth_login, R.id.auth_password})
    List<EditText> mAuthFields;

    @BindView(R.id.auth_button)
    Button mAuthButton;

    @BindView(R.id.forgot_pass)
    TextView mForgotPass;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_auth);
        ButterKnife.bind(this);

        //временно, запускает главную активность через 10 секунд, после первого запуска этой активности
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AuthActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 10000);
    }

    public void onClick(View v) {
        String login, password;

        switch (v.getId()) {
            case R.id.auth_button:
                login = mAuthFields.get(0).getText().toString();
                password = mAuthFields.get(1).getText().toString();


                break;

            case R.id.forgot_pass:

        }
    }
}
