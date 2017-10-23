package com.janedler.cookers;

import com.janedler.proxy.Proxy;

/**
 * Created by janedler on 2017/10/20.
 */
public class ChineseCooker extends Proxy {

    public void doCook() {
        super.doCook(CookerEnum.CHINESE_COOKER);
    }

}
