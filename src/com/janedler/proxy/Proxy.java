package com.janedler.proxy;

import com.janedler.cookers.CookerEnum;
import com.janedler.interf.IBinder;
import com.janedler.interf.ICooker;
import com.janedler.stub.Service;
import com.janedler.stub.Stub;

/**
 * Created by janedler on 2017/10/20.
 */
public class Proxy implements ICooker {

    private IBinder mBinder;

    public Proxy(){
        this.mBinder = asInterface();
    }

    @Override
    public void doCook(CookerEnum cookerEnum) {
        mBinder.onTransact(cookerEnum);
    }

    private Stub asInterface() {
        return new Service();
    }

}
