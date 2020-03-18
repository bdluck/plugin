/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2020.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2020/3/18   panliang         Create the class
 * http://www.jimilab.com/
 */


package top.jlpan;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.jlpan.impl.Setting;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description
 * @Date 2020/3/18 11:09
 */
public class Config implements SearchableConfigurable {

    private FormatSetting setting = new FormatSetting();

    private String text;

    private JTextField jTextField;







    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "123";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        jTextField = new Setting().getTextField();
        return jTextField;
    }

    @Override
    public boolean isModified() {
        System.out.println(jTextField.getText());
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    @NotNull
    @Override
    public String getId() {
        return "config_id";
    }
}
