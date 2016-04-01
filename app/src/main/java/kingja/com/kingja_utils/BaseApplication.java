package kingja.com.kingja_utils;

import android.app.Application;
import android.content.Context;

/**
 * 项目名称：常用工具类
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/4/122:46
 * 修改备注：
 */
public class BaseApplication extends Application {

    private static Context mApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = getApplicationContext();
    }

    public static Context getContext() {
        return mApplicationContext;
    }
}
