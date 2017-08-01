package com.test.calc.activities;

import android.support.test.espresso.ViewInteraction;

import com.test.calc.R;

import java.math.BigDecimal;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class Validator {

    public static void validateResults(int resultsValue)
    {
        validateResults(new BigDecimal(resultsValue));
    }

    public static void validateResults(BigDecimal resultsValue)
    {
        validateResults(resultsValue.toString());
    }

    public static void validateResults(String resultText)
    {
        ViewInteraction textView = onView(
                allOf(withId(R.id.result),
                        isDisplayed()));
        textView.check(matches(withText("Result: " + resultText)));
    }
}
