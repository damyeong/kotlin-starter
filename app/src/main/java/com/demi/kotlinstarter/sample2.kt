package com.demi.kotlinstarter

fun main() {
    forAndWhile()
}

// 5. Array and List

// Array: 메모리가 할당되어 나오기 때문에 처음에 지정을 해줘야 한다.
// List: 1.Immutable  2. Mutable (수정 가능 측면)

fun array() {
    // init. 여기서 타입 설명 부분은 전부 생략 가능
    val array: Array<Int> = arrayOf(1, 2, 3)
    val list: List<Int> = listOf(1, 2, 3)

    val array2: Array<Any> = arrayOf(1, "String", 3.14)
    val list2: List<Any> = listOf(1, "String", 3.14)

    // array 원소의 값은 변경 가능하다.
    array[0] = 3

    // list 의 경우 array 처럼 직접 들어가서 바꾸는 것이 불가능하다.
    // list[0] = 2  <- 불가능
    var result = list[0]
    var result2 = list.get(1)

    // 주소값은 바뀌지 않으므로 val 을 써도 된다. 하지만 다시 arrayListOf()로 재할당을 하게된다면 var 을 써야 한다.
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    arrayList = arrayListOf()
}

// 6. For & While

fun forAndWhile() {
    val students = arrayListOf("Jaycee", "Demeter", "Sage", "Zendaya")

    for (name in students) {
        print("$name ")
    }
    println()

    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생은 $name 입니다.")
    }

    var sum: Int = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    // 1, 3, 5, 7, 9
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    // 10 9 8 .. 1
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // 20 미만
    for (i in 1 until 20) {
        print("$i ")
    }
    println()

    var index = 0
    while (index < 10) {
        println("Current index = $index")
        index++
    }

}











