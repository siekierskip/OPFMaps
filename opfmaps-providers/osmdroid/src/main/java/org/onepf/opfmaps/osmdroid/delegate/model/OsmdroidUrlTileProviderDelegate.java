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

package org.onepf.opfmaps.osmdroid.delegate.model;

import android.support.annotation.Nullable;

import org.onepf.opfmaps.delegate.model.UrlTileProviderDelegate;
import org.onepf.opfmaps.model.OPFTile;
import org.onepf.opfutils.OPFLog;

import java.net.URL;

/**
 * @author Roman Savin
 * @since 03.08.2015
 */
public class OsmdroidUrlTileProviderDelegate implements UrlTileProviderDelegate {

    @Nullable
    @Override
    public URL getTileUrl(final int x, final int y, final int zoom) {
        OPFLog.logStubCall(x, y, zoom);
        return null;
    }

    @Nullable
    @Override
    public OPFTile getTile(final int x, final int y, final int zoom) {
        OPFLog.logStubCall(x, y, zoom);
        return null;
    }
}
