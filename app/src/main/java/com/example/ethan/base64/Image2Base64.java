package com.example.ethan.base64;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Ethan on 2017/1/11.
 */
public class Image2Base64 {
    public static String image2Base64(String imgPath, Bitmap bitmap, Context context){
        if (imgPath!=null&&imgPath.length()>0){
            bitmap = readBitmap(imgPath,context);
        }
        if (bitmap==null){
            Toast.makeText(context,"图片没有找到！",Toast.LENGTH_SHORT).show();
            Log.d("bitmapp","bimap为空的");
        }
        ByteArrayOutputStream out=null;

        try {
            out=new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,out);
            out.flush();
            out.close();
            byte[] imgBytes = out.toByteArray();
            return Base64.encodeToString(imgBytes,Base64.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Bitmap readBitmap(String imgPath,Context context) {
        try {
            return BitmapFactory.decodeFile(imgPath);
        }catch (Exception e){
            Toast.makeText(context,"图片读取失败！",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        return BitmapFactory.decodeFile(imgPath);
    }
    public static Bitmap base2Image(String base64Data/*,String imgName,String path*/){
        byte[] bytes=Base64.decode(base64Data,Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
         return bitmap;

       /* File myCaptureFile = new File(path,imgName);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(myCaptureFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean isTu = bitmap.compress(Bitmap.CompressFormat.JPEG,100,fos);
        if (isTu){
            try {
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
