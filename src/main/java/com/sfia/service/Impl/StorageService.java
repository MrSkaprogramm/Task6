package com.sfia.service.Impl;

import com.sfia.service.StorageServiceInterface;
import com.sfia.utils.RandomGenerator;

import java.util.Iterator;
import java.util.Scanner;

public class StorageService implements StorageServiceInterface {
    private final RandomGenerator randomGenerator = new RandomGenerator();
    private Scanner scanner = new Scanner(System.in);

    public void putToArrayList(CustomArrayList<String> customArrayList) {
        System.out.println("Custom ArrayList:");
        for(int i=0; i < 15; i++) {
            String randomString = randomGenerator.generateRandomWord();
            System.out.println(i + " - " + randomString);
            customArrayList.put(randomString);
        }
        System.out.println();
    }

    public void putToArrayListByIndex(CustomArrayList<String> customArrayList) {
        for(int i=0; i < 2; i++) {
            System.out.println("Enter the element of custom ArrayList:");
            String element = scanner.nextLine();
            System.out.println("- " + element);
            customArrayList.put(i, element);
        }
        System.out.println();
    }

    public void getFromArrayListByIndex(CustomArrayList<String> customArrayList) {
        System.out.println("Enter the index of element you want to get from custom ArrayList:");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Custom ArrayList element: " + customArrayList.getByIndex(index));
    }

    public void deleteFromArrayListByIndex(CustomArrayList<String> customArrayList) {
        System.out.println("Enter the index of element you want to delete from custom ArrayList:");
        int index = scanner.nextInt();
        scanner.nextLine();
        customArrayList.deleteByIndex(index);
        System.out.println("Custom ArrayList without deleted element:");
        for (String currString : customArrayList) {
            System.out.println("- " + currString);
        }
        System.out.println();
    }

    public void putToHashSet(CustomHashSet<String> customHashSet) {
        System.out.println("Custom HashSet:");
        for(int i=0; i < 2; i++) {
            System.out.println("Enter the element of customHashSet:");
            String element = scanner.nextLine();
            System.out.println("- " + element);
            customHashSet.put(element);
        }
        customHashSet.put(null);
        for(int i=0; i < 18; i++) {
            String randomString = randomGenerator.generateRandomWord();
            System.out.println("- " + randomString);
            customHashSet.put(randomString);
        }
        System.out.println();
    }

    public void ifContainsHashSet(CustomHashSet<String> customHashSet) {
        System.out.println("Enter the element you want to check in customHashSet:");
        String element = scanner.nextLine();
        System.out.println("HashSet contains this element: " + customHashSet.contains(element));
    }

    public void iterateHashSet(CustomHashSet<String> customHashSet) {
        System.out.println("Iterated HashSet:");
        Iterator<String> hashSetIterator = customHashSet.iterator();
        while (hashSetIterator.hasNext()) {
            String element = hashSetIterator.next();
            System.out.println("- " + element);
        }
        System.out.println();
    }

    public void deleteFromHashSet(CustomHashSet<String> customHashSet) {
        System.out.println("Enter the item you want to delete from customHashSet:");
        String element = scanner.nextLine();

        customHashSet.delete(element);
        System.out.println("CustomHashSet without deleted element:");
        for (String currString : customHashSet) {
            System.out.println("- " + currString);
        }
        System.out.println();
    }
}
