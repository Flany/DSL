package com.flany.dsl.html

import com.flany.dsl.html.base.BaseElement
import java.lang.StringBuilder

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
class HtmlElement : BaseElement("html") {

    fun head(block: HeadElement.() -> Unit) {
        val head = HeadElement()
        head.block()
        children += head
    }

    fun body(block: BodyElement.() -> Unit) {
        val body = BodyElement()
        body.block()
        children += body
    }
}