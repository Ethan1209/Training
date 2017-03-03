package com.example.ethan.base64;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
 private Button toimg,to64;
    private TextView tv;
    private ImageView iv;
    private Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String imagePath = Environment.getExternalStorageDirectory().toString()+"/Pictures/Screenshots/imagee.jpg";
       to64= (Button) findViewById(R.id.toBase64);
        toimg= (Button) findViewById(R.id.toImage);
        tv= (TextView) findViewById(R.id.tv);
        iv= (ImageView) findViewById(R.id.iv);
        final String baseimg=Image2Base64.image2Base64(imagePath,bitmap,getBaseContext());
        to64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tv.setText(imagePath);
                tv.setText(baseimg);
            }
        });
        toimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Image2Base64.base2Image(baseimg);
                iv.setImageBitmap(Image2Base64.base2Image("/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEB\n" +
                        "                                                         AQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEB\n" +
                        "                                                         AQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCAeABDgDASIA\n" +
                        "                                                         AhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\n" +
                        "                                                         AAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\n" +
                        "                                                         ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\n" +
                        "                                                         p6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\n" +
                        "                                                         AwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\n" +
                        "                                                         BhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\n" +
                        "                                                         U1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\n" +
                        "                                                         uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD/AD/6\n" +
                        "                                                         KKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAoo\n" +
                        "                                                         ooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiii\n" +
                        "                                                         gAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKA\n" +
                        "                                                         CiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAK\n" +
                        "                                                         KKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAK9v8A2ff2b/j1\n" +
                        "                                                         +1Z8SNP+EX7Ofwk8afGD4h6pDJdWvhfwRot1q17Bp1q0Ud5q2pzxILHRNGszcQfbdb1m4tdKs2kt\n" +
                        "                                                         1u71DMpPiFf2j/sdeOrz/gj/AP8ABtv4r/bm+Edjpvhv9rT9uP4nSeA/B/xF1DTdPu9d8LaSnjXx\n" +
                        "                                                         z4O8Jx6d9stpoJ4fDfgr4d/EH4leE9PuBdWg8WeILXV9XsrvT7UWNAH4s+PP+DeD/gtN8N/B1/45\n" +
                        "                                                         8R/sJeO7rRNMsJdRvYPB/j34JfEHxOlrDHPNJ5Hgj4ffE3xR4uvrlYYC5sbDRLi+xkfZy3Ffjbf2\n" +
                        "                                                         F7pV7f6ZqVldafqWnXdzY6hp1/bzWt/YXtncXFveWd5ZTqs9nc2ssTw3drcKtxbzxlXKsHWv1L/Z\n" +
                        "                                                         R/4LPf8ABRb9l79onwj8d1/a0+P3xNtbHxRp+pfEL4e/Ez4s+N/HHgz4leGJNVtrnxL4c13QPFni\n" +
                        "                                                         HWNKiuNTsIprbStetbSDWPD93NFeaNe2zw7T+on/AAdh/sv/AA6+FX7bnwa/ak+FOl2OjeFv20vg\n" +
                        "                                                         /wD8LA1y10+z+x2+q/EfwjfWdn4g8XCGM/ZYbjxP4W8T+ArnV1twzXviKHWvEl5eXeoazd3TAH86\n" +
                        "                                                         P7Pn7Nnx7/at+I2n/CL9nL4R+N/jD8QtTge7tvDPgbQ7vV72106CaKK71jWZo1Fj4f0KzaeBb3Xt\n" +
                        "                                                         curHRrNpbcXl/CJo3P6ZePP+DeD/AILS/DfwdfeOfEf7B/jy70PTbGXUbqDwd48+CfxC8Um1hS4n\n" +
                        "                                                         l8jwJ8Pvid4n8Z3tyIYGb7Bp+g3F9jbH9nF1mNv27/4J9/EO9/4Jo/8ABsv8d/28f2b9O0nT/wBp\n" +
                        "                                                         /wCOvxNvfCl58UJNN0/U9Y8GWX/C5LP4KeGnIu7WWBbfwTo41/xX4Q0zUxcaWnjbxONWv7K5sp3s\n" +
                        "                                                         rj8Df2O/+Czf/BRr9mj9pzwR8bE/ap+P/wAV7eTxhpEvxC+GvxC+Jnjj4ieFPib4bvtatz4h8OX/\n" +
                        "                                                         AIW8S+IdRsBqup2YmtvD+s6ZbW+vaDqU8NzoN9bOJY5AD8o7+wvdKvb/AEzUrK60/UtOu7mx1DTr\n" +
                        "                                                         +3mtb+wvbO4uLe8s7yynVZ7O5tZYnhu7W4Vbi3njKuVYOtUK/qo/4O6f2c/hr8F/+CkXgT4lfD/S\n" +
                        "                                                         9L8P6l+0N8D9N8d/EjRtMtYLRb/x/ofjbxn4Uu/HFzDEyZuvFujabosF9cmHdqWq6NqeuXV3c6jq\n" +
                        "                                                         F84/DXw7/wAE4f23PFv7HviL9vjw58APEeq/sq+GNRvNN1j4r22teDVjgl07xBB4b1O+g8GS+JV8\n" +
                        "                                                         d6loel61PHpmreI9L8NXXh7Tbr7ULzVkXT9VaIA+Y/hV8LPiB8bviR4J+EPwr8M3njH4ifEXxNon\n" +
                        "                                                         g3wT4V06S0ivtf8AE+v6hDp2j6XbzXtxb2dvJeXk8EH2i8ubazg3g3l1Cm9z+qn/ABD1/wDBab/o\n" +
                        "                                                         wj4lf+FZ8If/AJ4lP/4N7fBy+Of+Cy37DejPF5yWPxB8VeLQmM/vPAfwn+InjuKXocfZz4aNz1wf\n" +
                        "                                                         LOemT9xf8Fcv+C1X/BSL4f8A/BSv9sj4a/AX9tD4reBvhX8OfjHrvw/8K+D/AA3f6ImjaAfBVvZe\n" +
                        "                                                         GdcsrJp9Jup8nxDpOq3F1m4YfbJbgYzu3AH5ZftG/wDBHn/gpj+yT8JvEfx0/aJ/ZM8bfDP4V+Fb\n" +
                        "                                                         jQLTxB4z1fXvh7fafpk/iTXdN8NaDFNbaD4u1XUJW1LW9TsNNjNtaziO5uUF06Rhp2wv2Wv+CT3/\n" +
                        "                                                         AAUT/bX+Gs3xg/Zf/Zf8X/Fn4c2/iTU/CEvivQ9c8B6dZL4l0m00681LSfs/iTxdo1951rb6rpsr\n" +
                        "                                                         TfZhZFbqP/S8hsxfHz/gq/8A8FHv2pPhh4g+C37QH7XnxV+KPwv8Tz6Lc694J8S3Wito2qz6Drdn\n" +
                        "                                                         4g0eS7istKt52Omazp9nqVp/pPy3MMTNuAYV478Gv25P21/2dPCMnw/+AH7YH7SXwU8ES6td69J4\n" +
                        "                                                         O+Ffxt+JvgTwq+vanDZwalrR0Dwv4p0vTf7Tu4tNsIrrUfs32y4W3tA8jCBGAB92f8Q9f/Bab/ow\n" +
                        "                                                         j4lf+FZ8If8A54leefGD/giN/wAFWvgH8M/G3xk+L37Gfj7wV8Nvh5oN94n8aeK9Q8R/DO5svD+g\n" +
                        "                                                         aeWF7ql3baZ431C/kt7fHzJa21xOVz8pYEny3/h63/wVFx/yki/beJznH/DUnxy9Tzz8QfbOPcdw\n" +
                        "                                                         a/pY/wCCuH7QP7QH7C//AARQ/Zc/YR+Ofx7+LPxa/bB/bZjHxg/aP174q/EPxl478beCvhdFqGne\n" +
                        "                                                         JLv4ZnWvFPiPWtS0Cwg1VPBPw9/sWyuf7B1b/hGvi1crarLrWrvMAfxTUUUUAFFFFABRRRQAUUUU\n" +
                        "                                                         AFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQA\n" +
                        "                                                         UUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABX\n" +
                        "                                                         vX7OH7MH7Q37X3xO034M/sy/B3xv8aPiRqttPfW3hXwJol1q19b6ZaPEl7rOtXCAWHh7QrJpoVvt\n" +
                        "                                                         f1y6sNGs3mtlvNQhEqOfBa/ui/Yq8c3X/BFn/g118W/t/fB7TdK8N/tjft9fFhvAHgr4k6ppOl3u\n" +
                        "                                                         veEtHXx34+8EeDItOW+s54L628MeBPhj8Svil4R027F3pY8XeJrXV9as72wt20ogH4RfED/g20/4\n" +
                        "                                                         Li/DPwZqPjzxJ+wJ42v9E0u"));
            }
        });
    }
}
