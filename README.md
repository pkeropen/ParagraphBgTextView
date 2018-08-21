# ParagraphBgTextView
Android 段落分行背景TextView 


# How to use 如何使用

##### Gradle  
使用 JCenter 在项目的 build.gradle 中添加如下代码
      
      compile 'com.vita.widget:ParagraphBgTextView:1.0.0'
      
编译成功后，在layout xml文件加入，如下:

     <cn.vita.widget.paragraphbgtextview.ParagraphBgTextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:lineSpacingExtra="4dp"
           android:textSize="18sp"
           android:text="窗前明月光\n疑似地下霜\n举头望明月\n低头思故乡"
           ParagraphBgColorTextView:paragraphBgColor="#FF0000" />

ParagraphBgColorTextView:paragraphBgColor 填写对应的颜色值

# 效果图
      
   <img src="https://raw.githubusercontent.com/pkeropen/ParagraphBgTextView/master/imgs/Screenshot_01.png" width = "310" height = "560" alt="ParagraphBgTextView" align=center />
      
## License

    Copyright 2015 NeXT

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

