package com.mapzen.android.lost.internal;

import com.mapzen.android.lost.api.LocationAvailability;
import com.mapzen.android.lost.api.LocationRequest;

import android.location.Location;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;

public class TestServiceStub extends IFusedLocationProviderService.Stub {

  List<IFusedLocationProviderCallback> callbacks = new ArrayList<>();

  @Override public void add(IFusedLocationProviderCallback callback) throws RemoteException {
    this.callbacks.add(callback);
  }

  @Override public void remove(IFusedLocationProviderCallback callback) throws RemoteException {
    this.callbacks.remove(callback);
  }

  @Override public Location getLastLocation() throws RemoteException {
    return null;
  }

  @Override public LocationAvailability getLocationAvailability() throws RemoteException {
    return null;
  }

  @Override public void requestLocationUpdates(LocationRequest request) throws RemoteException {

  }

  @Override public void removeLocationUpdates(List<LocationRequest> request) throws
      RemoteException {

  }

  @Override public void setMockMode(boolean isMockMode) throws RemoteException {

  }

  @Override public void setMockLocation(Location mockLocation) throws RemoteException {

  }

  @Override public void setMockTrace(String path, String filename) throws RemoteException {

  }
}
