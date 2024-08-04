package com.sfia;

import com.sfia.service.Impl.CustomArrayList;
import com.sfia.service.Impl.CustomHashSet;
import com.sfia.service.Impl.StorageService;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        CustomHashSet<String> customHashSet = new CustomHashSet<>();

        StorageService storageService = new StorageService();
        storageService.putToArrayList(customArrayList);
        storageService.putToArrayListByIndex(customArrayList);
        storageService.getFromArrayListByIndex(customArrayList);
        storageService.deleteFromArrayListByIndex(customArrayList);

        storageService.putToHashSet(customHashSet);
        storageService.iterateHashSet(customHashSet);
        storageService.deleteFromHashSet(customHashSet);
        storageService.ifContainsHashSet(customHashSet);
    }
}