// Created by plusminus on 12:28:16 - 21.09.2008
package org.mozilla.osmdroid.contributor;

import android.location.Location;

import org.mozilla.osmdroid.contributor.util.RecordedGeoPoint;
import org.mozilla.osmdroid.util.GeoPoint;

import java.util.ArrayList;

/**
 * @author Nicolas Gramlich
 */
public class RouteRecorder {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    protected final ArrayList<RecordedGeoPoint> mRecords = new ArrayList<RecordedGeoPoint>();

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    public ArrayList<RecordedGeoPoint> getRecordedGeoPoints() {
        return this.mRecords;
    }

    // ===========================================================
    // Methods from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    public void add(final Location aLocation, final int aNumSatellites) {
        this.mRecords
                .add(new RecordedGeoPoint((int) (aLocation.getLatitude() * 1E6), (int) (aLocation
                        .getLongitude() * 1E6), System.currentTimeMillis(), aNumSatellites));
    }

    public void add(final GeoPoint aGeoPoint, final int aNumSatellites) {
        this.mRecords.add(new RecordedGeoPoint(aGeoPoint.getLatitudeE6(), aGeoPoint
                .getLongitudeE6(), System.currentTimeMillis(), aNumSatellites));
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
}
