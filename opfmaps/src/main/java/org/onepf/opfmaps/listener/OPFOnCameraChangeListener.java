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

import org.onepf.opfmaps.model.OPFCameraPosition;

/**
 * Interface definition for a callback to be invoked when the camera state changes (position, zoom, tilt or bearing).
 *
 * @author Roman Savin
 * @since 30.07.2015
 */
public interface OPFOnCameraChangeListener {

    /**
     * Called after the camera position has changed. It is always called for the final position in the animation.
     *
     * @param position The {@link OPFCameraPosition} at the end of the last camera change.
     */
    void onCameraChange(@NonNull OPFCameraPosition position);
}
