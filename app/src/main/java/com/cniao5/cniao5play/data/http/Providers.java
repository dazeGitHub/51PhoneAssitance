<<<<<<< HEAD
package com.cniao5.cniao5play.data.http;

import com.cniao5.cniao5play.bean.IndexBeanCache;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.LifeCache;


/**
 * Created by Administrator on 2017/7/11.
 */

public interface Providers {

    @LifeCache(duration = 1, timeUnit = TimeUnit.MINUTES)
    Observable<IndexBeanCache> getIndexInfo(Observable<IndexBeanCache> oMocks);

}
=======
package com.cniao5.cniao5play.data.http;

import com.cniao5.cniao5play.bean.IndexBeanCache;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.LifeCache;


/**
 * Created by Administrator on 2017/7/11.
 */

public interface Providers {

    @LifeCache(duration = 1, timeUnit = TimeUnit.MINUTES)
    Observable<IndexBeanCache> getIndexInfo(Observable<IndexBeanCache> oMocks);

}
>>>>>>> 32674bc4d54d9e98a16c6edff476a379d3872a4c
