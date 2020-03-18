package top.jlpan;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description
 * @Date 2020/3/17 15:14
 */
public class TestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Hello hello = Hello.getInstance();
        hello.sayHello();
    }

}
