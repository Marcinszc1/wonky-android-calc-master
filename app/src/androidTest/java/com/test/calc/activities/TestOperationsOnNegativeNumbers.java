package com.test.calc.activities;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestOperationsOnNegativeNumbers {

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testOperationsOnNegativeNumbers() {
        ButtonOperator.clickSubtract(Times.FOUR);
        ButtonOperator.clickSubtract();
        Validator.validateResults(-5);

        ButtonOperator.clickAdd();
        Validator.validateResults(-4);

        ButtonOperator.clickMultiplyBy2();
        Validator.validateResults(-8);

        ButtonOperator.clickDivideBy2();
        Validator.validateResults(-4);

        ButtonOperator.clickPowerBy2();
        Validator.validateResults(16);

        ButtonOperator.clickDivideBy2(Times.FOUR);
        ButtonOperator.clickSubtract(Times.TWO);

        ButtonOperator.clickSquareRoot();
        Validator.validateResults("Invalid input");
        ButtonOperator.clickAdd();
        Validator.validateResults(1);
    }

}
