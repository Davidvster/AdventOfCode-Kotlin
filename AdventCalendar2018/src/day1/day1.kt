package day1

import java.io.File

fun main(args: Array<String>) {
    var sum1 = 0
    val instructions = mutableListOf<Int>()
    val alreadyReached = mutableListOf<Int>()
    File("/Users/david.valic/IdeaProjects/AdventCalendar/AdventCalendar2018/src/day1/day1src.txt").forEachLine { line ->
        sum1 += line.toInt()
        instructions.add(line.toInt())
    }
    var sum2 = 0
    var firstTwice: Int? = null
    while (firstTwice == null) {
        for (number in instructions) {
            sum2 += number
            if (alreadyReached.contains(sum2)) {
                firstTwice = sum2
                break
            } else {
                alreadyReached.add(sum2)
            }
        }
    }
    println("part1: $sum1")
    println("part2: $firstTwice")
}