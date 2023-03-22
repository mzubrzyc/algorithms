package algorithms;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@Slf4j
@NoArgsConstructor
public class ProducerConsumerPattern {

    private final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(1000);
    private final AtomicBoolean producerCompleted = new AtomicBoolean(false);

    public void runProducerConsumer() {
        log.info("runProducerConsumer");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(this::producer);
        executorService.submit(this::consumer);
    }

    private void producer() {
        for (int i = 0; i < 10; i++) {
            blockingQueue.add(i);
            log.info("producer i = {}", i);
        }
        log.info("producer has just finished producing, blockingQueue: {}", blockingQueue);
        producerCompleted.set(true);
    }

    private void consumer() {
        while (!producerCompleted.get()) {
            log.info("consumer consumes {}", blockingQueue.poll());
        }
    }

}
