package com.example.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class myCanvas extends View {
    Paint paint;
    Rect rect;

    public myCanvas(Context context)
    {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(getResources().getColor(android.R.color.black));
        paint.setStrokeWidth(3);
        paint.setTextSize(100);

        canvas.drawRect(50,50,400,800,paint);
        canvas.drawArc(50, 20, 800, 800,0,90,true,paint);
        canvas.drawCircle(600,200,200,paint);
        canvas.drawText("HELLO",400,1000,paint);

    }
}
