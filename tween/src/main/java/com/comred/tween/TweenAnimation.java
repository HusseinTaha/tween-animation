package com.comred.tween;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/**
 * Created by husseintaha on 5/22/15.
 */
public class TweenAnimation {


    /**
     * setClipParent remove clip from all parent of this view.
     *
     * @param v view to remove clip parent from.
     */
    private static void setClipParent(View v) {
        ViewParent temp = v.getParent();
        while (temp != null) {
            try {
                ((ViewGroup) temp).setClipChildren(false);
                temp = temp.getParent();
            } catch (ClassCastException ex) {
                temp = temp.getParent();
            }
        }
    }


    /**
     * fromLeft
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void fromLeft(final View view, int duration) {
        fromLeft(view, duration, 0);
    }

    /**
     * fromLeft
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void fromLeft(final View view, int duration, int offset) {
        int x = Utility.getScreenWH(Utility.context).get("width").getAsInt();
        baseFrom(view, new TranslateAnimation(
                0, -x,
                0, 0,
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 0), duration, offset);
    }

    /**
     * toLeft
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void toLeft(final View view, int duration) {
        toLeft(view, duration, 0);
    }

    /**
     * toLeft
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void toLeft(final View view, int duration, int offset) {
        baseTo(view, new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_SELF, -3.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f), duration, offset);

    }

    /**
     * fromRight
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void fromRight(final View view, int duration) {
        fromRight(view, duration, 0);
    }

    /**
     * fromRight
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void fromRight(final View view, int duration, int offset) {
        int x = Utility.getScreenWH(Utility.context).get("width").getAsInt();
        baseFrom(view, new TranslateAnimation(
                0, x,
                0, 0,
                Animation.RELATIVE_TO_SELF, 0,
                Animation.RELATIVE_TO_SELF, 0), duration, offset);
    }

    /**
     * toRight
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void toRight(final View view, int duration) {
        toRight(view, duration, 0);
    }

    /**
     * toRight
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void toRight(final View view, int duration, int offset) {
        baseTo(view, new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_SELF, 3.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f), duration, offset);

    }

    /**
     * fromBottom
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void fromBottom(final View view, int duration) {
        fromBottom(view, duration, 0);
    }

    /**
     * fromBottom
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void fromBottom(final View view, int duration, int offset) {
        int y = Utility.getScreenWH(Utility.context).get("height").getAsInt();
        baseFrom(view, new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.RELATIVE_TO_SELF, 0,
                        0, y,
                        0, 0),
                duration, offset);
    }

    /**
     * toBottom
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void toBottom(final View view, int duration) {
        toBottom(view, duration, 0);
    }

    /**
     * toBottom
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void toBottom(final View view, int duration, int offset) {
        baseTo(view, new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 3.0f), duration, offset);

    }

    /**
     * fromTop
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void fromTop(final View view, int duration) {
        fromTop(view, duration, 0);
    }

    /**
     * fromTop
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void fromTop(final View view, int duration, int offset) {
        int y = Utility.getScreenWH(Utility.context).get("height").getAsInt();
        baseFrom(view, new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.RELATIVE_TO_SELF, 0,
                        0, -y,
                        0, 0),
                duration, offset);
    }

    /**
     * toTop
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     */
    public static void toTop(final View view, int duration) {
        toTop(view, duration, 0);
    }

    /**
     * toTop
     * animate a view from left of screen
     *
     * @param view     the view to  animate
     * @param duration the duration of the animation
     * @param offset   is the delay before start the animation
     */
    public static void toTop(final View view, int duration, int offset) {
        baseTo(view, new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, -3.0f), duration, offset);

    }


    /**
     * @param view     the view to animate
     * @param anim     the Animation object
     * @param duration the duration of the animation
     * @param offset   the delay before starting animation
     */
    private static void baseTo(final View view, Animation anim, int duration, int offset) {
        view.setVisibility(View.VISIBLE);
        setClipParent(view);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        anim.setStartOffset(offset);
        anim.setDuration(duration);
        view.startAnimation(anim);
    }

    /**
     * @param view     the view to animate
     * @param trans    the translation animation object
     * @param duration the duration of the animation
     * @param offset   the delay before starting animation
     */
    private static void baseFrom(final View view, TranslateAnimation trans, int duration, int offset) {
        view.setVisibility(View.INVISIBLE);
        setClipParent(view);
        AnimationSet rootSet = new AnimationSet(true);
        trans.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        trans.setStartOffset(offset);
        trans.setDuration(duration);
        rootSet.addAnimation(trans);

        view.startAnimation(rootSet);
    }
}
