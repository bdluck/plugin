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

import com.intellij.openapi.components.PersistentStateComponent;
import org.jdom.Element;

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * @author panliang
 * @version 1.0
 * @ProjectName idea
 * @Description
 * @Date 2020/3/18 11:57
 */
@State(name = "SearchJar", storages = {@Storage(value = "123")})
public class FormatSetting implements PersistentStateComponent<Element> {

    private String value;

    @Nullable
    @Override
    public Element getState() {
        Element element = new Element("test");
        element.setAttribute("key", getValue());
        return element;
    }

    @Override
    public void loadState(@NotNull Element element) {
        setValue(String.valueOf(element.getAttribute("key")));
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}