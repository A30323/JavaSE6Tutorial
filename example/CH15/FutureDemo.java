package onlyfun.caterpillar;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureDemo {
    public static void main(String[] args) {
        Callable<int[]> primeCallable = new PrimeCallable(1000);
        FutureTask<int[]> primeTask = new FutureTask<int[]>(primeCallable);
		
        Thread t = new Thread(primeTask);
        t.start();
		
        try {
            // ���]�{�b���䥦�Ʊ�
            Thread.sleep(5000);
			
            // �^�Ӭݬݽ�Ƨ�n�F��
            if(primeTask.isDone()) {
                int[] primes = primeTask.get();
                for(int prime : primes) {
                    System.out.print(prime + " ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }	
    }
}