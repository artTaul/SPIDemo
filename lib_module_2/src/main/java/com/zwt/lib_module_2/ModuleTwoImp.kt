package com.zwt.lib_module_2

import android.util.Log
import com.zwt.base.CommonServer

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2021/12/30 10:57 上午
 * @Email：zhangwentao01@tojoy.com
 */
class ModuleTwoImp : CommonServer {
    override fun getModuleName(): String = "my name is module_2"
    override fun initData() {
        Log.e("zhang", "initData module_2")
    }
}