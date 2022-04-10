package com.demi.kotlinstarter

// 꼭 클래스 파일명과 진짜 클래스명이 일치하지 않아도 된다.
// 하나의 클래스 파일안에 여러 개의 클래스가 들어갈 수 있다.

class ClassPractice {
}

// constructor 라는 말 생략 가능
// 생성자에서 선언까지 해주면 디폴트 값으로 지정된다.
open class Human constructor(val name: String = "Anonymous") {

    // java 에서 오버로딩을 통해 생성자를 여럿 둘 수 있었듯이 constructor 라는 부생성자 생성 가능하다.
    // : this(name) 에서 name 은 주생성자에서 위임한 것이다.
    constructor(name: String, age: Int) : this(name) {
        println("My name is ${name}, $age years old")
    }

    // 순서상 init 블록이 부생성자 constructor 보다 가장 먼저 실행된다.
    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is SOoOOoOO GOOD!!")
    }

    open fun singASong() {
        println("Lalala~~ Lala~~")
    }
}

// Override
class Korean : Human() {
    override fun singASong() {
        super.singASong()
        println("랄랄라~~ 랄라~~")
        println("My name is $name")
    }
}

fun main() {
    val human = Human("Jamie")
    val stranger = Human()  // Anonymous 로 디폴트 값 지정

    human.eatingCake()
    println("This human's name is ${human.name}")
    println("This human's name is ${stranger.name}")

    val mom = Human("Delphi", 60)

    val korean = Korean()
    korean.singASong()
}