package top.jlpan.impl;

import com.intellij.openapi.ui.Messages;

import top.jlpan.Hello;

/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description
 * @Date 2020/3/18 10:16
 */
public class HelloImpl implements Hello {


    @Override
    public void sayHello() {
        Messages.showMessageDialog(
                "HelloWorld!",
                "Sample",
                Messages.getInformationIcon()
        );

    }


}
