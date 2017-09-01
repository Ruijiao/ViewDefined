package core.overite;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

/**
 * Created by Fang Ruijiao on 2017/9/1.
 *
 * 查看生命周期
 */
public class TestView extends RelativeLayout {

    private final String TAG = "definedView";

    public TestView(Context context) {
        super(context);
        Log("TestView(111)");
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log("TestView(222)");
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log("TestView(333)");
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Log("onFinishInflate()");
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log("onAttachedToWindow()");
    }

    private boolean isMeasured = false;
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log("onMeasure()");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log("onLayout()");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log("onDraw()");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log("onSizeChanged()");
    }

    @Override
    public void dispatchWindowFocusChanged(boolean hasFocus) {
        super.dispatchWindowFocusChanged(hasFocus);
        Log("dispatchWindowFocusChanged() hasFocus:" + hasFocus);
    }


    private void Log(String info){
        Log.i(TAG,info);
    }

}
