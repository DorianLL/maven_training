package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    Sample sample = new Sample();

    @Test
    public void op() {
        int a = 1;
        int b = 1;

        int result = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(result).as("Addition of 1+1")
                .isEqualTo(2);

    }
}