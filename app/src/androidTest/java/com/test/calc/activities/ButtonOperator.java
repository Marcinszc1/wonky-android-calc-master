package com.test.calc.activities;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.core.deps.guava.base.Optional;

import com.test.calc.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by x on 28.07.2017.
 */

public class ButtonOperator {
    public static void clickAdd()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.add), withText("ADD"), isDisplayed()));
        button.perform(click());
    }
    public static void clickAdd(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickAdd();
        }
    }

    public static void clickSubtract()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.subtract), withText("SUBTRACT"), isDisplayed()));
        button.perform(click());
    }
    public static void clickSubtract(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickSubtract();
        }
    }

    public static void clickSquareRoot()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.sqrt), withText("SQUARE ROOT"), isDisplayed()));
        button.perform(click());
    }
    public static void clickSquareRoot(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickSquareRoot();
        }
    }

    public static void clickDivideBy2()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.divide), withText("DIVIDE by 2"), isDisplayed()));
        button.perform(click());
    }
    public static void clickDivideBy2(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickDivideBy2();
        }
    }

    public static void clickMultiplyBy2()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.multiply), withText("MULTIPLY by 2"), isDisplayed()));
        button.perform(click());
    }
    public static void clickMultiplyBy2(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickMultiplyBy2();
        }
    }

    public static void clickPowerBy2()
    {
        ViewInteraction button = onView(
                allOf(withId(R.id.power), withText("POWER by 2"), isDisplayed()));
        button.perform(click());
    }
    public static void clickPowerBy2(int times)
    {
        for(int i = 0; i < times; ++i) {
            clickPowerBy2();
        }
    }
}
