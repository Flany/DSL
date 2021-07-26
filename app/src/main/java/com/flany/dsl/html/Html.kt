package com.flany.dsl.html

import java.lang.StringBuilder


/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
object Html {
    fun html(block: HtmlElement.() -> Unit): String {
        val html = HtmlElement()
        html.block()
        return html.render(StringBuilder())
    }
}