package day1

import java.io.File

fun main(args: Array<String>) {
    var floor = 0
    var found = false
    File("/Users/david.valic/IdeaProjects/AdventCalendar/AdventCalendar2015/src/day1/day1src.txt").forEachLine { line ->
        line.forEachIndexed { i, char ->
            if (char == '(') {
                floor ++
            } else if (char == ')') {
                floor --
            }
            if (floor == -1 && !found) {
                found = true
                println(i+1)
            }
        }
    }
    println(floor)
}