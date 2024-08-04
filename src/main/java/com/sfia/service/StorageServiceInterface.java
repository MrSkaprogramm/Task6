package com.sfia.service;

import com.sfia.service.Impl.CustomArrayList;
import com.sfia.service.Impl.CustomHashSet;

import java.util.Iterator;

public interface StorageServiceInterface {
    public void putToArrayList(CustomArrayList<String> customArrayList);

    public void putToArrayListByIndex(CustomArrayList<String> customArrayList);

    public void getFromArrayListByIndex(CustomArrayList<String> customArrayList);

    public void deleteFromArrayListByIndex(CustomArrayList<String> customArrayList);

    public void putToHashSet(CustomHashSet<String> customHashSet);

    public void ifContainsHashSet(CustomHashSet<String> customHashSet);

    public void iterateHashSet(CustomHashSet<String> customHashSet);

    public void deleteFromHashSet(CustomHashSet<String> customHashSet);
}
