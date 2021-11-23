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
import kotlin.math.max
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Hackerrank does not allow: candles.maxOrNull() :(
    var max = 0
    candles.map { if (it > max) max = it }
    return candles.count { it == max}
}

fun main(args: Array<String>) {
    // Not used but Hackerrank uses it just to input the length of the array
    readLine()!!.trim().toInt()
    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = birthdayCakeCandles(candles)
    println(result)
}
