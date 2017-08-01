package com.test.calc.activities;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestOperationsOnPositiveNumbers {

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testOperationsOnPositiveNumbers() {
        ButtonOperator.clickAdd(Times.FOUR);
        ButtonOperator.clickAdd();
        Validator.validateResults(5);

        ButtonOperator.clickSubtract();
        Validator.validateResults(4);

        ButtonOperator.clickMultiplyBy2();
        Validator.validateResults(8);

        ButtonOperator.clickDivideBy2();
        Validator.validateResults(4);

        ButtonOperator.clickSquareRoot();
        Validator.validateResults(2);

        ButtonOperator.clickSubtract();

        ButtonOperator.clickPowerBy2();
        Validator.validateResults(4);
    }

}
