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

package org.onepf.opfmaps.google.delegate.model;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import org.onepf.opfmaps.delegate.model.CircleOptionsDelegate;
import org.onepf.opfmaps.model.OPFLatLng;

/**
 * @author Roman Savin
 * @since 03.08.2015
 */
public final class GoogleCircleOptionsDelegate implements CircleOptionsDelegate {

    public static final Creator<GoogleCircleOptionsDelegate> CREATOR = new Creator<GoogleCircleOptionsDelegate>() {
        @Override
        public GoogleCircleOptionsDelegate createFromParcel(final Parcel source) {
            return new GoogleCircleOptionsDelegate(source);
        }

        @Override
        public GoogleCircleOptionsDelegate[] newArray(final int size) {
            return new GoogleCircleOptionsDelegate[size];
        }
    };

    @NonNull
    private final CircleOptions circleOptions;

    public GoogleCircleOptionsDelegate() {
        this.circleOptions = new CircleOptions();
    }

    private GoogleCircleOptionsDelegate(@NonNull final Parcel parcel) {
        this.circleOptions = parcel.readParcelable(CircleOptions.class.getClassLoader());
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate center(@NonNull final OPFLatLng center) {
        circleOptions.center(new LatLng(center.getLat(), center.getLng()));
        return this;
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate fillColor(final int color) {
        circleOptions.fillColor(color);
        return this;
    }

    @Nullable
    @Override
    public OPFLatLng getCenter() {
        final LatLng center = circleOptions.getCenter();
        if (center != null) {
            return new OPFLatLng(new GoogleLatLngDelegate(center));
        }
        return null;
    }

    @Override
    public int getFillColor() {
        return circleOptions.getFillColor();
    }

    @Override
    public double getRadius() {
        return circleOptions.getRadius();
    }

    @Override
    public int getStrokeColor() {
        return circleOptions.getStrokeColor();
    }

    @Override
    public float getStrokeWidth() {
        return circleOptions.getStrokeWidth();
    }

    @Override
    public float getZIndex() {
        return circleOptions.getZIndex();
    }

    @Override
    public boolean isVisible() {
        return circleOptions.isVisible();
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate radius(final double radius) {
        circleOptions.radius(radius);
        return this;
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate strokeColor(final int color) {
        circleOptions.strokeColor(color);
        return this;
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate strokeWidth(final float width) {
        circleOptions.strokeWidth(width);
        return this;
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate visible(final boolean visible) {
        circleOptions.visible(visible);
        return this;
    }

    @NonNull
    @Override
    public GoogleCircleOptionsDelegate zIndex(final float zIndex) {
        circleOptions.zIndex(zIndex);
        return this;
    }

    @Override
    public int describeContents() {
        return circleOptions.describeContents();
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeParcelable(circleOptions, flags);
    }

    @Override
    public String toString() {
        return circleOptions.toString();
    }

    @Override
    public boolean equals(final Object other) {
        return other != null
                && (other == this || other instanceof GoogleCircleOptionsDelegate
                && circleOptions.equals(((GoogleCircleOptionsDelegate) other).circleOptions));
    }

    @Override
    public int hashCode() {
        return circleOptions.hashCode();
    }
}
