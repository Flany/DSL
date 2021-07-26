package com.flany.dsl.html

import com.flany.dsl.html.base.BaseElement

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
class BodyElement : BaseElement("body") {

    fun h1(block: () -> String) {
        val h1 = H1Element(block())
        children += h1
    }

    fun p(block: () -> String) {
        val p = PElement(block())
        children += p
    }
}