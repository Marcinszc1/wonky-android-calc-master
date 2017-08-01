package com.test.calc.activities;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import java.sql.Time;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestOppositenessOfOperations {

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testOppositenessOfOperations() {

        ButtonOperator.clickAdd(Times.TWO);
        Validator.validateResults(2);
        ButtonOperator.clickSubtract(Times.TWO);
        Validator.validateResults(0);
        ButtonOperator.clickSubtract();
        ButtonOperator.clickAdd();
        Validator.validateResults(0);

        ButtonOperator.clickAdd(Times.THREE);
        Validator.validateResults(3);

        ButtonOperator.clickMultiplyBy2();
        ButtonOperator.clickDivideBy2();
        Validator.validateResults(3);

        ButtonOperator.clickDivideBy2();
        ButtonOperator.clickMultiplyBy2();
        Validator.validateResults(3);

        ButtonOperator.clickPowerBy2();
        ButtonOperator.clickSquareRoot();
        Validator.validateResults(3);
        ButtonOperator.clickSquareRoot();
        ButtonOperator.clickPowerBy2();
        Validator.validateResults(3);
    }

}
