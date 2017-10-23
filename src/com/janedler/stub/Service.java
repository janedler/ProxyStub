package com.janedler.stub;

import com.janedler.cookers.CookerEnum;

/**
 * Created by janedler on 2017/10/20.
 */
public class Service extends Stub {

    @Override
    public void doCook(CookerEnum cookerEnum) {

        switch (cookerEnum){
            case CHINESE_COOKER:
                System.out.println("中国厨师开始做菜");
                break;
            case JAPANESE_COOKER:
                System.out.println("日本厨师开始做菜");
                break;
        }
    }
}
