package com.city.first;

import android.content.Intent;
import android.media.tv.TvContentRating;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity implements View.OnClickListener {
    private ItemInfo itemInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        itemInfo=new ItemInfo("金剑",100,20,20);
        findViewById(R.id.r1).setOnClickListener(this);
        TextView mLifeTV=findViewById(R.id.tv_life);
        TextView mNameTV=findViewById(R.id.tv_name);
        TextView mSpeedTV=findViewById(R.id.tv_speed);
        TextView mAttackTV=findViewById(R.id.tv_attack);

        mLifeTV.setText("生命值"+itemInfo.getLife());
        mNameTV.setText(itemInfo.getName()+"");
        mSpeedTV.setText("敏捷度"+ itemInfo.getSpeed());
        mAttackTV.setText("攻击力"+itemInfo.getAttack());
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.r1:
                Intent intent=new Intent();
                intent.putExtra("equipment",itemInfo);
                setResult(1,intent);
                finish();
                break;
        }
    }
}
