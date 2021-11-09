import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * https://www.hackerrank.com/challenges/staircase/problem
 */

fun staircase(n: Int) {
    var actualN = n
    while (actualN > 0) {
        printElementTimes(actualN-1, " ")
        actualN--
        printElementTimes(n-actualN, "#")
        println()
    }
}

private fun printElementTimes(times : Int, element : String) {
    var tmpTimes = times
    while (tmpTimes > 0) {
        print(element)
        tmpTimes--
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
