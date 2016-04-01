/**
 *
 */
package kingja.com.kingja_utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * 项目名称：常用工具类
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/4/122:46
 * 修改备注：
 */
public class ActivityUtil {
    public static void goActivity(Activity activity, Class clazz) {
        Intent intent = new Intent(activity,
                clazz);
        activity.startActivity(intent);
    }

    public static void goActivityAndFinish(Activity activity, Class clazz) {
        Intent intent = new Intent(activity,
                clazz);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void goActivityWithBundle(Activity activity, Class clazz, Bundle bundle) {
        Intent intent = new Intent(activity,
                clazz);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    public static void goActivityForResult(Activity activity, Class clazz, int requestID) {
        Intent intent = new Intent(activity,
                clazz);
        activity.startActivityForResult(intent, requestID);
    }

    public static void goActivityForResultWithBundle(Activity activity, Class clazz, Bundle bundle, int requestID) {
        Intent intent = new Intent(activity,
                clazz);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, requestID);
    }

}
