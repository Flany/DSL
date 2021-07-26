package com.flany.dsl.html

import com.flany.dsl.html.base.BaseElement

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
class HeadElement : BaseElement("head") {

    fun title(block: () -> String) {
        val title = TitleElement(block())
        children += title
    }
}