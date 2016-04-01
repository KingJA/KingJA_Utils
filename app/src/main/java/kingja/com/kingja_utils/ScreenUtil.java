package kingja.com.kingja_utils;

import android.util.DisplayMetrics;

/**
 * 项目名称：常用工具类
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/4/122:46
 * 修改备注：
 */
public class ScreenUtil {
    public static int dip2px(int dip) {
        float density = BaseApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dip * density + 0.5);
    }

    public static int px2dip(int px) {
        float density = BaseApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (px / density + 0.5);
    }

    public static int getScreenWidth() {
        DisplayMetrics dm = BaseApplication.getContext().getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        DisplayMetrics dm = BaseApplication.getContext().getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

}
