package com.janedler.main;

import com.janedler.cookers.ChineseCooker;
import com.janedler.cookers.CookerEnum;
import com.janedler.proxy.Proxy;

/**
 * Created by janedler on 2017/10/20.
 */
public class Main {

    public static void main(String[] args){

        ChineseCooker proxy = new ChineseCooker();
        proxy.doCook();



    }

}
