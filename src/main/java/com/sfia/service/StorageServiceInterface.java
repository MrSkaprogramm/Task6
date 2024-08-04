package com.sfia.service;

import com.sfia.service.Impl.CustomArrayList;
import com.sfia.service.Impl.CustomHashSet;

public interface StorageServiceInterface {
    void putToArrayList(CustomArrayList<String> customArrayList);

    void putToArrayListByIndex(CustomArrayList<String> customArrayList);

    void getFromArrayListByIndex(CustomArrayList<String> customArrayList);

    void deleteFromArrayListByIndex(CustomArrayList<String> customArrayList);

    void putToHashSet(CustomHashSet<String> customHashSet);

    void ifContainsHashSet(CustomHashSet<String> customHashSet);

    void iterateHashSet(CustomHashSet<String> customHashSet);

    void deleteFromHashSet(CustomHashSet<String> customHashSet);

}
