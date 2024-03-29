package com.youdu.activity.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.umeng.analytics.MobclickAgent;
import com.youdu.constant.Constant;
import com.youdu.util.StatusBarUtil;

/**
 * @author: qndroid
 * @function: 所有Activity的基类，用来处理一些公共事件，如：数据统计
 * @date: 16/3/10
 */
public abstract class BaseActivity extends AppCompatActivity {

    public String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUmeng();
        reverseStatusColor();
    }

    /**
     * 初始化友盟统计
     */
    private void initUmeng() {
        TAG = getComponentName().getShortClassName();
        MobclickAgent.setDebugMode(true);
        MobclickAgent.openActivityDurationTrack(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onPageStart(TAG);
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(TAG);
        MobclickAgent.onPause(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 整个android系统内存不足时,系统回调此方法,在此释放一些不必要的资源
     * 例如:缓存图片
     *
     * @param level 标志当前应用被回收的可能性,数值越大表示越容易被回收，最大值为80时,被回收的可能性最大。
     */
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    /**
     * 申请指定的权限.
     */
    public void requestPermission(int code, String... permissions) {
        ActivityCompat.requestPermissions(this, permissions, code);
    }

    /**
     * 判断是否有指定的权限
     */
    public boolean hasPermission(String... permissions) {

        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case Constant.WRITE_READ_EXTERNAL_CODE:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    doSDCardPermission();
                }
                break;
        }
    }

    /**
     * 处理整个应用用中的SDCard业务
     */
    public void doSDCardPermission() {
    }

    /**
     * 隐藏状态栏
     */
    public void hiddenStatusBar() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     * 改变状态栏颜色
     *
     * @param color
     */
    public void changeStatusBarColor(@ColorRes int color) {
        StatusBarUtil.setStatusBarColor(this, color);
    }

    /**
     * 调整状态栏为亮模式，这样状态栏的文字颜色就为深模式了。
     */
    private void reverseStatusColor() {
        StatusBarUtil.statusBarLightMode(this);
    }

    /**
     * Activity绑定到滑动关闭,
     * 在使用了浸淫式状态栏后再用效果就不太好了
     */
//    public void attachSlidr() {
//        //可以搞一个单例优化一下代码。
//        SlidrConfig config = new SlidrConfig.Builder()
//                .position(SlidrPosition.LEFT)
//                .sensitivity(1f)
//                .scrimColor(Color.BLACK)
//                .scrimStartAlpha(0.8f)
//                .scrimEndAlpha(0f)
//                .velocityThreshold(2400)
//                .distanceThreshold(0.25f)
//                .edge(true)
//                .edgeSize(0.18f) // The % of the screen that counts as the edge, default 18%
//                .build();
//        Slidr.attach(this, config);
//    }
}
