package cn.vita.widget.paragraphbgtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

public class ParagraphBgTextView extends android.support.v7.widget.AppCompatTextView{

    private int paragraphBgColor;

    public ParagraphBgTextView(Context context) {
        super(context);
    }

    public ParagraphBgTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public ParagraphBgTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ParagraphBgColorTextView, 0, 0);
        paragraphBgColor = a.getColor(R.styleable.ParagraphBgColorTextView_paragraphBgColor, 0xFFFFFFFF);

    }

    @Override
    public void draw(Canvas canvas) {
        int lineCount = getLayout().getLineCount();
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setColor(paragraphBgColor);
        for (int i = 0; i < lineCount; i++) {
            rect.top = (getLayout().getLineTop(i));
            rect.left = (int) getLayout().getLineLeft(i);
            rect.right = (int) getLayout().getLineRight(i);
            rect.bottom = (int) (getLayout().getLineBottom(i) - ((i + 1 == lineCount) ? 0 : getLayout().getSpacingAdd()));

            canvas.drawRect(rect, paint);
        }
        super.draw(canvas);
    }
}
