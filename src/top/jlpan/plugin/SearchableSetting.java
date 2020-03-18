package top.jlpan.plugin;

import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.jlpan.impl.Windows;

import javax.swing.*;

/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description 搜索栏设置参数
 * @Date 2020/3/18 11:09
 */
public class SearchableSetting implements SearchableConfigurable {

    /**
     * 持久化参数
     */
    private PersistentProperties properties = PersistentProperties.getInstance();

    /**
     * 设置窗口
     */
    private Windows windows = new Windows();


    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "插件设置";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return windows.getWindows();
    }

    @Override
    public boolean isModified() {
        String text = windows.getTextField().getText();
        return !properties.isText(text);
    }

    @Override
    public void apply() {
        String text = windows.getTextField().getText();
        properties.setText(text);
    }

    public void reset() {
        windows.getTextField().setText(properties.getText());
    }

    @NotNull
    @Override
    public String getId() {
        return "config_id";
    }
}
