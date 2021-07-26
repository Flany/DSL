package com.flany.dsl.html

import com.flany.dsl.html.base.BaseElement

/**
 * @author: hec@shuyilink.com
 * @date:   2021/7/26
 * @since:
 */
class PElement(private val content: String) : BaseElement("p", content)