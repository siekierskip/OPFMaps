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

package org.onepf.maps.yandexweb.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * @author Roman Savin
 * @since 02.09.2015
 */
public final class BitmapDescriptor implements Parcelable {
    //todo implement

    public static final Creator<BitmapDescriptor> CREATOR = new Creator<BitmapDescriptor>() {
        @Override
        public BitmapDescriptor createFromParcel(final Parcel source) {
            return new BitmapDescriptor(source);
        }

        @Override
        public BitmapDescriptor[] newArray(int size) {
            return new BitmapDescriptor[size];
        }
    };

    public BitmapDescriptor() {
    }

    private BitmapDescriptor(@NonNull final Parcel parcel) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
    }
}