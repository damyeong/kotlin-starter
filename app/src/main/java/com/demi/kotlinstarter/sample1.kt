package com.demi.kotlinstarter

fun main() {
    helloWorld()

    println(add(4, 5))

    // 3. String Template
    val name = "Demi"
    val lastName = "Lee"
    println("My name is $name and I am a BE Developer.")
    println("My name is ${name}, and I am a BE Developer.")
    println("My name is ${name + lastName}, and I am a BE Developer.")

    println("is this true? ${1 == 0}")
    println("this is 2\$s") // 변수로 인식하지 않도록 백슬래시 사용

    checkNum(1)

}

// 1. 함수

// void 형태일 때 Unit 을 써준다. (안 써도 무방)
fun helloWorld(): Unit {
    println("Hello, World!")
}

// 변수명: 타입, Int 대문자 유의. 리턴값이 있다면 반드시 : Int 써주어야 한다.
fun add(a: Int, b: Int): Int {
    return a + b
}

// 2. val vs var
// val = value

fun hi() {
    // val 은 상수라서 변하지 않음. val cannot be reassigned.
    val a: Int = 10
    var b: Int = 9
    var e: String

    b = 100
    println(b)

    val c = 100  // : Int 굳이 안 써도 상관없으니, val/var 구분값은 반드시 써준다.
    var d = 100

    var name: String = "Demi"
}

// 4. 조건식

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
// 삼항연산자가 없어서 대신하여 이렇게 잘 씀
fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    // Statement
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("unknown value")
    }

    // Expression
    // else 반드시 써줘야.
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b: $b")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
// 값을 만들면 표현식. 예를 들어 조건식에 의해 a 또는 b 가 도출되는 것이면 표현식
// when 을 통해 실행에 대해 서술한 문장은 Statement, when 을 통해 특정 값이 도출되면 표현식
// 모든 함수는 코틀린에서 Expression 으로 사용이 된다. 다만 void 리턴형은 Statement 이다.


