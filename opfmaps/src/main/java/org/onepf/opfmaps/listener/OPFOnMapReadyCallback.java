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

package org.onepf.opfmaps.listener;

import android.support.annotation.NonNull;
import org.onepf.opfmaps.OPFMap;

/**
 * Interface definition for a callback to be invoked when the map is ready to be used.
 *
 * @author Roman Savin
 * @since 30.07.2015
 */
public interface OPFOnMapReadyCallback {

    /**
     * Called when the map is ready to be used.
     *
     * @param opfMap A non-null instance of a {@link OPFMap} associated with the {@link org.onepf.opfmaps.OPFMapFragment}
     *               or {@link org.onepf.opfmaps.OPFMapView} that defines the callback.
     */
    void onMapReady(@NonNull final OPFMap opfMap);
}
