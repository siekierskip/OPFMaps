/*
 * Copyright 2012-2015 One Platform Foundation
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

package org.onepf.opfmaps.yandexweb.model;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import org.onepf.opfutils.OPFLog;

/**
 * @author Roman Savin
 * @since 02.09.2015
 */
public final class BitmapDescriptorFactory {

    private BitmapDescriptorFactory() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public static BitmapDescriptor defaultMarker() {
        return new BitmapDescriptor();
    }

    @NonNull
    public static BitmapDescriptor defaultMarker(final float hue) {
        return new BitmapDescriptor(hue);
    }

    @NonNull
    public static BitmapDescriptor fromAsset(@NonNull final String assetName) {
        OPFLog.logStubCall(assetName);
        return new BitmapDescriptor();
    }

    @NonNull
    public static BitmapDescriptor fromBitmap(@NonNull final Bitmap image) {
        OPFLog.logStubCall(image);
        return new BitmapDescriptor();
    }

    @NonNull
    public static BitmapDescriptor fromFile(@NonNull final String fileName) {
        OPFLog.logStubCall(fileName);
        return new BitmapDescriptor();
    }

    @NonNull
    public static BitmapDescriptor fromPath(@NonNull final String absolutePath) {
        OPFLog.logStubCall(absolutePath);
        return new BitmapDescriptor();
    }

    @NonNull
    public static BitmapDescriptor fromResource(final int resourceId) {
        OPFLog.logStubCall(resourceId);
        return new BitmapDescriptor();
    }
}
