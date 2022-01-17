package com.zwt.spidemo

import com.zwt.base.CommonServer
import java.util.*

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2021/12/30 11:10 上午
 * @Email：zhangwentao01@tojoy.com
 */
class SPIFactory private constructor() {

    private var mIterator: Iterator<CommonServer>

    companion object {
        val instance: SPIFactory by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SPIFactory()
        }
    }

    init {
        val loader = ServiceLoader.load(CommonServer::class.java)
        mIterator = loader.iterator()
    }

    fun getCommonServer(): CommonServer = mIterator.next()

    fun hasNextCommonServer(): Boolean = mIterator.hasNext()

}