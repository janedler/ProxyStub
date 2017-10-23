package com.janedler.interf;

import com.janedler.cookers.CookerEnum;

/**
 * Created by janedler on 2017/10/20.
 */
public abstract class IBinder {

    public abstract void onTransact(CookerEnum cookerEnum);

}
