package com.zwt.lib_module_1

import android.util.Log
import com.zwt.base.CommonServer

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2021/12/30 10:52 上午
 * @Email：zhangwentao01@tojoy.com
 */

class ModuleOneImp : CommonServer {
    override fun getModuleName(): String = "my name is module_1"
    override fun initData() {
        Log.e("zhang", "initData module_1")
    }
}