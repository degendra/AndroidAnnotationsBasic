package np.com.degendra.androidannotationsbasic;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById
    Toolbar toolbar;

    @ViewById
    EditText username, password;

    @AfterViews
    void afterViews() {
        setSupportActionBar(toolbar);
    }

    @Click(R.id.send)
    void onSendCLicked(View view) {
        String uname = username.getText().toString();
        String pass = password.getText().toString();

        Snackbar.make(view, "Username: " + uname + " password: " + pass, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Click(R.id.fab)
    void onFabClicked(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }
}
