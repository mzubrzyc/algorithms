package algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProducerConsumerPatternTest {

    @Test
    void runProducerConsumer() {
        ProducerConsumerPattern producerConsumerPattern = new ProducerConsumerPattern();
        Assertions.assertThatNoException().isThrownBy(producerConsumerPattern::runProducerConsumer);
    }
}