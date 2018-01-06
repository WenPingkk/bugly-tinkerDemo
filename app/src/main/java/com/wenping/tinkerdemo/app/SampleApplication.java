package com.wenping.tinkerdemo.app;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 *
 * @author WenPing
 * @date 1/4/2018
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.wenping.tinkerdemo.app.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}