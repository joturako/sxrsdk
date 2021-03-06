/* Copyright 2015 Samsung Electronics Co., LTD
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.samsungxr;

import java.util.List;


/**
 * Encapsulates the data used to construct a SXRTexture.
 * An image can be a simple bitmap, a compressed bitmap,
 * a cubemap (6 separate bitmaps for each cube face) or
 * a compressed cubemap (6 compressed bitmaps).
 *
 * Images are typically read in from files using the @{link SXRAssetLoader}
 * but it is also possible to create them programatically.
 */
public class SXRImage extends SXRHybridObject
{
    public enum ImageType
    {
        BITMAP(1),
        CUBEMAP(2),
        FLOAT_BITMAP(3);

        public int Value;
        ImageType(int v) { Value = v; }
    };

    protected SXRImage(SXRContext gvrContext, long ptr)
    {
        super(gvrContext, ptr);
    }

    protected SXRImage(SXRContext gvrContext)
    {
        super(gvrContext, 0);
    }

    protected static final String TAG = "SXRImage";

    public String getFileName()
    {
        return NativeBitmapImage.getFileName(getNative());
    }

    public void setFileName(String fname)
    {
        NativeBitmapImage.setFileName(getNative(), fname);
    }
}
