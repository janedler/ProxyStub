package com.janedler.stub;

import com.janedler.cookers.CookerEnum;
import com.janedler.interf.IBinder;
import com.janedler.interf.ICooker;

/**
 * Created by janedler on 2017/10/20.
 */
public abstract class Stub extends IBinder implements ICooker {

    public abstract void doCook(CookerEnum cookerEnum);

    @Override
    public void onTransact(CookerEnum cookerEnum) {
        this.doCook(cookerEnum);
    }

}
