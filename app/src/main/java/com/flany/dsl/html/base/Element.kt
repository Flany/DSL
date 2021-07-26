package com.flany.dsl.html.base

import java.lang.StringBuilder

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
interface Element {
    fun render(builder: StringBuilder): String
}