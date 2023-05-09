package com.example.recyclerview;

public class DesignClass {

    private  int imageView1;
    private  String textView1;
    private  String textView2;
    private  String textView3;


    DesignClass(int imageView1, String textView1, String textView2, String textView3) {
        this.imageView1 = imageView1;
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.textView3 = textView3;

    }

    public int getImageView1() {
        return imageView1;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }

}
