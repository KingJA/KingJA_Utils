package kingja.com.kingja_utils;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 项目名称：常用工具类
 * 类描述：TODO
 * 创建人：KingJA
 * 创建时间：2016/4/122:46
 * 修改备注：
 */
public class ToastUtil {

    public static Toast mToast2;
    public static Toast mToast;
    private static View toastRoot;
    private static TextView tv_message;

    public static void singleToast(String msg) {
        if (mToast2 == null) {
            mToast2 = Toast.makeText(BaseApplication.getContext(), "", Toast.LENGTH_SHORT);
        }
        mToast2.setText(msg);
        mToast2.show();
    }

    public static void showThreadToast(final Activity context, final String msg) {
        if ("main".equals(Thread.currentThread().getName())) {
            showToast(context, msg, 1);
        } else {
            context.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    showToast(context, msg, 1);
                }
            });
        }
    }

    public static void showMyToast(String message
    ) {
        showToast(BaseApplication.getContext(), message, Toast.LENGTH_SHORT);
    }

    private static void showToast(Context context, String message, int duration) {
        if (mToast == null) {
            toastRoot = View.inflate(context, R.layout.mytoast, null);
            tv_message = (TextView) toastRoot
                    .findViewById(R.id.tv_message);
            mToast = new Toast(context);
        }
        tv_message.setText(message);
        mToast.setGravity(Gravity.BOTTOM, 0, dip2px(96));
        mToast.setDuration(duration);
        mToast.setView(toastRoot);
        mToast.show();
    }
    
    private static int dip2px(int dip) {
        float density = BaseApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dip * density + 0.5);
    }
}
