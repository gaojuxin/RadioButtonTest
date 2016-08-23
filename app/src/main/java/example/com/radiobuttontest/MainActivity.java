package example.com.radiobuttontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
private RadioGroup radioGroup;
    private RadioButton rbChat,rbContacts,rbDiscover,rbMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initView() ;
    }

    private void initView() {
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        rbChat = (RadioButton)findViewById(R.id.radio_chat);
        rbContacts = (RadioButton)findViewById(R.id.radio_contact);
        rbMe = (RadioButton)findViewById(R.id.radio_me);
        rbDiscover = (RadioButton)findViewById(R.id.radio_find);
        //radioButton选定状态改变监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_chat:
                        startActivity(new Intent(MainActivity.this,chatActivity.class));
                        break;
                    case R.id.radio_contact:
                        startActivity(new Intent(MainActivity.this,contactsActivity.class));
                        break;
                    case R.id.radio_find:
                       startActivity(new Intent(MainActivity.this,discoverActivity.class));
                        break;
                    case R.id.radio_me:
                        startActivity(new Intent(MainActivity.this,meActivity.class));
                        break;
                    default:
                        break;
                }
            }

        });

    }
}
