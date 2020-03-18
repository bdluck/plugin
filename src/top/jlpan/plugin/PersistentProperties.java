package top.jlpan.plugin;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description 插件持久化参数
 * @Date 2020/3/18 16:12
 */
@State(name = "PersistentProperties", storages = {@Storage("11111.xml")})
public class PersistentProperties implements PersistentStateComponent<Element> {

    private String text = "";

    public static PersistentProperties getInstance() {
        return ServiceManager.getService(PersistentProperties.class);
    }

    @Nullable
    @Override
    public Element getState() {
        Element element = new Element("params");
        element.setAttribute("text", text);
        return element;
    }

    @Override
    public void loadState(@NotNull Element element) {
        this.text = element.getAttributeValue("text");
    }


    /**
     * text是否改变
     * @param text
     * @return
     */
    public boolean isText(String text) {
        return this.text.equals(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
