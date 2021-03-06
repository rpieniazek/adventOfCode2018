package day1

import java.io.File


fun main(args: Array<String>) {
    val frequences: MutableSet<Int> = HashSet<Int>();
    val changes:MutableList<Int> = ArrayList<Int>();

    File("src/main/kotlin/2018/day1/input.txt").useLines { lines ->
        lines.forEach { line ->
            changes.add(line.toInt())
        }
    }
    var sum = 0;
    do {
        changes.forEach {change ->
            sum += change
            if(!frequences.add(sum)){
                println(sum)
                return
            }
        }
    }
    while(true)


}

