package com.example.connectify.utils;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.connectify.model.UserModel;

public class AndroidUtil {
    public static  void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    public static void passUserModelAsIntent(Intent intent, UserModel model){
        intent.putExtra("username",model.getUsername());
        intent.putExtra("phone",model.getPhone());
        intent.putExtra("userId",model.getUserId());
//        intent.putExtra("fcmToken",model.getFcmToken());

    }

    public static UserModel getUserModelFromIntent(Intent intent){
        UserModel userModel;
        userModel = new UserModel();
        userModel.setUsername(intent.getStringExtra("username"));
        userModel.setPhone(intent.getStringExtra("phone"));
        userModel.setUserId(intent.getStringExtra("userId"));
        return userModel;
//        userModel.setFcmToken(intent.getStringExtra("fcmToken"));
    }

//    public static void setProfilePic(Context context, Uri imageUri, ImageView imageView){
//        Glide.with(context).load(imageUri).apply(RequestOptions.circleCropTransform()).into(imageView);
//    }
}
