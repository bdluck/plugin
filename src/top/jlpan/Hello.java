package top.jlpan;

import com.intellij.openapi.components.ServiceManager;


/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description
 * @Date 2020/3/18 10:16
 */
public interface Hello {
    static Hello getInstance() {
        return ServiceManager.getService(Hello.class);
    }

    void sayHello();
}
