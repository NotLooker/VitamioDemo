## Vtiamio Demo

博客地址：[我不只是看客-CSDN](http://blog.csdn.net/u010181592)/
              [NotLooker-Github](https://notlooker.github.io/)  

#### WHPlayer 基于Vitamio(V5.2.3)完成的播放器

修改了Vitamio的MediaController:
暴露出sekbar相关私有方法，以便于在滑动是同步更新进度条

实现方法详见系列博客：[我不只是看客_视频框架Vitamio使用教程](http://blog.csdn.net/u010181592/article/category/5893483)


实现功能:
- 自定义控制器；
- 实现电量监听；
- 左右滑动控制进度；
- 左侧上下滑动控制屏幕亮度(有最低亮度)；
- 右侧上下滑动控制播放声音；
- Android7.0控制器显示适配；
- Android4.4以上全屏播放(隐藏状态栏和虚拟按键)

期待更多:
- 隐藏控制器时，手势监听
- 增加多段url播放
- 全屏小屏切换

****

#### WHPlayer based on Vitamio(V5.2.3)

Modify Vitamio's MediaController:
Exposes the seekbar.OnSeekBarChangeListener private method so that it is synchronized to update the progress bar；

Function implementation method see series blog：[我不只是看客_视频框架Vitamio使用教程](http://blog.csdn.net/u010181592/article/category/5893483)


Function：
- Custom controller UI;
- Power monitoring;
- Left and right sliding control progress on the Controller
- Left slide up and down control screen brightness (with the lowest brightness);
- Right slide up and down control to play sound;
- Android 7.0 controller display adaptation;
- Android 4.4.X above full-screen playback (hide the status bar);

TO DO:
- Add gesture monitor when the controller is hide;
- play list Url
- Full screen switch Small screen

		