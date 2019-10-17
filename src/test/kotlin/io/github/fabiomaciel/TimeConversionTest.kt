package io.github.fabiomaciel

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TimeConversionTest {

    @Test
    fun `Sample input 0`(){
        val convertedTime = timeConversion("07:05:45PM")
        assertThat(convertedTime).isEqualTo("19:05:45")
    }

    @Test
    fun `Test case 1`(){
        val convertedTime = timeConversion("12:40:22AM")
        assertThat(convertedTime).isEqualTo("00:40:22")
    }

    @Test
    fun `Test case 2`(){
        val convertedTime = timeConversion("06:40:03AM")
        assertThat(convertedTime).isEqualTo("06:40:03")
    }

    @Test
    fun `Test case 9`(){
        val convertedTime = timeConversion("11:59:59PM")
        assertThat(convertedTime).isEqualTo("23:59:59")
    }
}
