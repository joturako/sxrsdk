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

/**
 * This is used in SXRWidget plugin to create SXRTexture handle from texture
 * generated in shared context.
 */
public class SXRSharedTexture extends SXRTexture {
    /**
     * 
     * @param gvrContext
     *            Current gvrContext
     */
    public SXRSharedTexture(SXRContext gvrContext, int id) {
        super(gvrContext, NativeSharedTexture.ctor(id));
    }

    SXRSharedTexture(SXRContext gvrContext, long ptr) {
        super(gvrContext, ptr);
    }
}

class NativeSharedTexture {
    static native long ctor(int id);
}
