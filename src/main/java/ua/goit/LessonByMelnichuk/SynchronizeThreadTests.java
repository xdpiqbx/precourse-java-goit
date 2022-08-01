package ua.goit.LessonByMelnichuk;

import java.util.ArrayList;
import java.util.List;

// Потоки пытаются изменить одну и ту же переменную counter!
public class SynchronizeThreadTests {

    private volatile static int counter = 0;

    // Потоки НЕ синхронизированы и пытаются изменить одну и ту же переменную counter!
//    public static void increment(){
//        counter = counter + 1;
//    }

    // Потоки синхронизированы, изменяют counter по очереди
    public synchronized static void increment(){
        counter = counter + 1;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increment();
                }
            });
            threads.add(thread);
        }

        for (Thread thread: threads){
            thread.start();
        }

        for (Thread thread: threads){
            thread.join(); // Waits for this thread to die - Ждёт завершения потока
        }

        System.out.println("counter = " + counter);
    }
}