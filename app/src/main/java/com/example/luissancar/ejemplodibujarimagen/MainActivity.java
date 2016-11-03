package com.example.luissancar.ejemplodibujarimagen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
        getSupportActionBar().hide();


    }

    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(0, 0, 255);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Bitmap bmp = BitmapFactory.decodeResource(getResources(),
                    R.mipmap.coche);
            canvas.drawBitmap(bmp, (ancho - 250) / 2, (alto - 200) / 2, null);


            //
            //


            //


            //dibuja 10 circulos
            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 255, 0, 0);
            pincel1.setStyle(Paint.Style.STROKE); // dibuja solo la figura no rellena
            for (int f = 0; f < 10; f++) {
                canvas.drawCircle(ancho / 3, alto / 4, f * 15, pincel1);
            }
            //dibuja una línea
            canvas.drawLine(10,10,100,200,pincel1);
            // dibuja un rectángulo
            pincel1.setColor(Color.GREEN);
            pincel1.setStyle(Paint.Style.FILL); // rellena la figura
            canvas.drawRect(40,500,200,800,pincel1);
        }
    }
}
