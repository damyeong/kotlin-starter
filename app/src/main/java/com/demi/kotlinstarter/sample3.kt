package com.demi.kotlinstarter

import java.util.*

fun main() {
    nullCheck()
    ignoreNulls("test")

}

// 7. Nullable & NonNull

fun nullCheck() {
    // NPE: Null Pointer Exception
    // 컴파일 시점에 NPE 를 잡을 수 있도록 해주는 코틀린 <3

    var name: String = "Demi"
    // 물음표 하나 붙여주면 Nullable Type 으로 변한다. 이때는 타입 생략이 불가하다.
    var nullName: String? = null

    var nameInUpperCase = name.uppercase(Locale.getDefault())

    // nullName == null ? null : nullName.uppercase()
    var nullNameInUpperCase = nullName?.uppercase()

    // ?: 엘비스 프레슬리 연산자 Lol
    // Null 일 때의 디폴트값 설정
    val lastName: String? = null
    val fullName = "$name " + (lastName ?: "has NO LASTNAME")

    println(fullName)
}

fun ignoreNulls(str: String?) {
    // Assert 같은.. 절대로 null 일 리 없어! 라는 뜻으로 !! 쓴다.
    // 이때는 ? 물음표를 안 써도 된다.
    // 정말 100% 확실하지 않은 이상 사용하면 안 된다. NPE 유발하므로.
    val mNotNull: String = str!!
    val upper = mNotNull.uppercase()
    println(upper)

    // let : 자신의 리시버 객체(email)를 람다식 내부로 옮겨준다. email 이 null 일 경우 let 내부 연산은 이루어지지 않는다.
    val email: String? = str
    email?.let {
        println("My email is $email")
    }
}
