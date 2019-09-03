package com.example.orientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mOutputTxt;
    private TextView mCancelBtn;
    private TextView mChangeSignBtn;
    private TextView mPercentBtn;
    private TextView mDivideBtn;
    private TextView mSevenBtn;
    private TextView mEightBtn;
    private TextView mNineBtn;
    private TextView mMultiplyBtn;
    private TextView mFourBtn;
    private TextView mFiveBtn;
    private TextView mSixBtn;
    private TextView mMinusBtn;
    private TextView mOneBtn;
    private TextView mTwoBtn;
    private TextView mThreeBtn;
    private TextView mZeroBtn;
    private TextView mPointBtn;
    private TextView mEqualsBtn;
    private TextView mMCBtn;
    private TextView mMRBtn;
    private TextView mMSBtn;
    private TextView mMPlusBtn;
    private TextView mMMinusBtn;
    private TextView mRootBtn;
    private TextView mLeftBracketBtn;
    private TextView mRightBracketBtn;
    private TextView mSinBtn;
    private TextView mCosBtn;
    private TextView mTanBtn;
    private TextView mLnBtn;
    private TextView mNoBtn1;
    private TextView mNoBtn2;
    private TextView mNoBtn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsPort();
        initViewsLand();
    }

    public void initViewsPort() {
        mOutputTxt = findViewById(R.id.txtOutput);
        mCancelBtn = findViewById(R.id.btnCancel);
        mChangeSignBtn = findViewById(R.id.btnChangeSign);
        mPercentBtn = findViewById(R.id.btnPercent);
        mSevenBtn = findViewById(R.id.btn7);
        mEightBtn = findViewById(R.id.btn8);
        mNineBtn = findViewById(R.id.btn9);
        mMultiplyBtn = findViewById(R.id.btnMultiply);
        mFourBtn = findViewById(R.id.btn4);
        mFiveBtn = findViewById(R.id.btn5);
        mSixBtn = findViewById(R.id.btn6);
        mMinusBtn = findViewById(R.id.btnMinus);
        mOneBtn = findViewById(R.id.btn1);
        mTwoBtn = findViewById(R.id.btn2);
        mThreeBtn = findViewById(R.id.btn3);
        mZeroBtn = findViewById(R.id.btn0);
        mPointBtn = findViewById(R.id.btnPoint);
        mEqualsBtn = findViewById(R.id.btnEquals);
        mDivideBtn = findViewById(R.id.btnDivide);
    }

    public void initViewsLand() {
        mMCBtn = findViewById(R.id.MC_btn);
        mMRBtn = findViewById(R.id.MR_btn);
        mMSBtn = findViewById(R.id.MS_btn);
        mMPlusBtn = findViewById(R.id.MPlus_btn);
        mMMinusBtn = findViewById(R.id.MMinus_btn);
        mRootBtn = findViewById(R.id.root_btn);
        mLeftBracketBtn = findViewById(R.id.left_bracket_btn);
        mRightBracketBtn = findViewById(R.id.right_bracket_btn);
        mSinBtn = findViewById(R.id.sin_btn);
        mCosBtn = findViewById(R.id.cos_btn);
        mTanBtn = findViewById(R.id.tan_btn);
        mLnBtn = findViewById(R.id.ln_btn);
        mNoBtn1 = findViewById(R.id.no_btn1);
        mNoBtn2 = findViewById(R.id.no_btn2);
        mNoBtn3 = findViewById(R.id.no_btn3);
    }
}
