package io.github.fabiomaciel

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


fun assertUtil(elements: List<Int>, min:Long, max:Long){
    val (minimum, maximum) = minMaxLogic(elements.toTypedArray())
    assertThat(minimum).isEqualTo(min)
    assertThat(maximum).isEqualTo(max)
}
class MinMaxTest{


    @Test
    fun sampleTestCase0(){
        assertUtil(listOf(1,2,3,4,5),
            10, 14)
    }

    @Test
    fun sampleTestCase1(){
        assertUtil(listOf(7, 69, 2, 221, 8974),
            299, 9271)
    }

    @Test
    fun testCase1(){
        assertUtil(
            listOf(256741038, 623958417, 467905213, 714532089, 938071625),
            2063136757, 2744467344
        )
    }

}