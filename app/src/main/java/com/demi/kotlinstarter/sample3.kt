package com.demi.kotlinstarter

import java.util.*

fun main() {
    nullCheck()
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

    // !!
    //


}

fun ignoreNulls(str: String?) {

}
