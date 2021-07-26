package com.flany.dsl.html.base

import java.lang.StringBuilder

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
open class BaseElement(private val name: String, private val content: String = "") : Element {

    val children = mutableListOf<Element>()

    override fun render(builder: StringBuilder): String {
        builder.append("<$name>\n")
        if (content.isNotEmpty()) {
            builder.append("$content\n")
        }
        children.forEach {
            it.render(builder)
        }
        builder.append("</$name>\n")
        return builder.toString()
    }
}