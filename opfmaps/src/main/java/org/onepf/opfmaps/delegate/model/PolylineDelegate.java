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

package org.onepf.opfmaps.delegate.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.onepf.opfmaps.model.OPFLatLng;

import java.util.List;

/**
 * @author Roman Savin
 * @since 30.07.2015
 */
public interface PolylineDelegate {

    int getColor();

    @NonNull
    String getId();

    @Nullable
    List<OPFLatLng> getPoints();

    float getWidth();

    float getZIndex();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setColor(final int color);

    void setGeodesic(final boolean geodesic);

    void setPoints(@NonNull final List<OPFLatLng> points);

    void setVisible(final boolean visible);

    void setWidth(final float width);

    void setZIndex(final float zIndex);
}
