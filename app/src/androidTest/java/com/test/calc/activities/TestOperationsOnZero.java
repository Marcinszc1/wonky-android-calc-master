package com.test.calc.activities;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.test.calc.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestOperationsOnZero {

    @Rule
    public ActivityTestRule<CalculatorActivity> mActivityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Test
    public void testOperationsOnZero() {
        ButtonOperator.clickAdd();
        ButtonOperator.clickSubtract();
        Validator.validateResults(BigDecimal.ZERO);

        ButtonOperator.clickSubtract();
        ButtonOperator.clickAdd();
        Validator.validateResults(BigDecimal.ZERO);

        ButtonOperator.clickMultiplyBy2();
        Validator.validateResults(BigDecimal.ZERO);

        ButtonOperator.clickPowerBy2();
        Validator.validateResults(BigDecimal.ZERO);

        ButtonOperator.clickSquareRoot();
        Validator.validateResults(BigDecimal.ZERO);

        ButtonOperator.clickDivideBy2();
        Validator.validateResults(BigDecimal.ZERO);
    }

}
