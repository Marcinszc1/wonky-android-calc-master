package com.test.calc.activities;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Time;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestRepetitionsOfOperations {

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testRepetitionsOfOperations() {
        int timesRepeated = 20;
        ButtonOperator.clickAdd(timesRepeated);
        ButtonOperator.clickMultiplyBy2(timesRepeated);
        ButtonOperator.clickPowerBy2(timesRepeated);
        ButtonOperator.clickDivideBy2(timesRepeated);
        ButtonOperator.clickSquareRoot(timesRepeated);
        ButtonOperator.clickSubtract(timesRepeated);
    }

}
