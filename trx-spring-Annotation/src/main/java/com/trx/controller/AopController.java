package com.trx.controller;

import com.trx.annotation.Crypt;
import org.springframework.stereotype.Controller;

@Controller
public class AopController {

    @Crypt
    public String getAnswer(String question){
//        String str = question.replace("吗","");
//        str = str.replace("? ","!");
        return question;
    }

    @Crypt
    public String fortuneTelling(String name){
        System.out.println(name);
        String[] strs = {"女犯伤官把夫克，旱地莲花栽不活，不是吃上两家饭，也要刷上三家锅。","一朵鲜花头上戴，一年四季也不开，一心想要花开时，采花之人没到来。","此命生来脾气暴，上来一阵双脚跳，对你脾气啥都好，经常与人吵和闹。"};
        int index = name.hashCode()%3;
        return strs[index];
    }
}
