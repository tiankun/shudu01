package com.example.administrator.shudu01;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2015/10/14.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    //当Android系统需要绘制一个view对象时，就会调用该对象的onDraw方法
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint=new Paint();
        paint.setARGB(100,200,15,45);//yse
        paint.setStyle(Paint.Style.STROKE);//空心
        paint.setStrokeWidth(10);//边框粗细
        paint.setTextSize(100);




        //canvas.drawRect(100,50,200,200,paint);//矩形

       // canvas.drawCircle(100,100,15,paint);//圆形


        canvas.drawText("apple",10,400,paint);//文字
        canvas.drawLine(400, 200, 500, 400, paint);//线
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher),100,100,paint);//图片

        super.onDraw(canvas);
    }
}
