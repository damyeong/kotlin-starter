package com.demi.kotlinstarter

/**
 1. Lambda
    람다식은 마치 value 처럼 다룰 수 있는 익명함수다.
    1) 메서드의 파라미터로 넘겨줄 수 있다. fun maxBy(a: Int) <- 여기의 인자로 함수를 넣을 수 있다.
    2) return 값으로 사용할 수 있다.

 람다의 기본 정의
    val lambdaName : Type = {argumentList -> codeBody}

 */

//          input   output  argument       return
val square: (Int) -> (Int) = {number -> number * number}
// 이렇게 해도 된다. 적어도 한 곳에서는 타입명 선언을 해줘야 한다.
val square2 = {number: Int -> number * number}

val nameAge = {name: String, age: Int ->
    "My name is ${name}, I'm ${age}."
}


fun main() {
    println(square(12))
    println(square2(12))

    println(nameAge("Demi", 100))

    val a = "Demi said, "
    val b = "Taylor said, "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Josh", 40))

    println(calculateGrade(93))

    // number 값 비교해서 Boolean 리턴
    val lambda = {number: Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))  // it 은 여기서 8.1592

    // 소괄호 생략 가능
    val c = invokeLambda { it > 3.22 }
    println(c)

}


// 확장함수
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age: Int): String {
    // 파라미터가 하나일 때는 it 이라는 예약어 사용 가능. this 는 String, it 은 Int
    val introduceMyself: String.(Int) -> String = {"I am $this and $it years old"}
    return name.introduceMyself(age)
}


// 람다의 Return
// inputType 은 arguments 가 복수일 수 있으므로 꼭 소괄호를 써줘야 하고, 리턴은 1개이므로 안 써도 된다.
val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(8.1592)
}