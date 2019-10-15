package io.github.fabiomaciel

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat as assertThat1

class Test1{

    @Test
    fun `test1`(){
        assertThat1(1).isEqualTo(1)
    }
}