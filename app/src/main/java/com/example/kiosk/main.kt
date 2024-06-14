package com.example.kiosk

fun main() {
    println("메뉴를 고르세요.")
    println("[1] 라멘 [2] 떡볶이 [3] 포케 [4] 덮밥 [5]기타 [00] 종료")
    val selectedMenu = readln()

    var status:Boolean = true
    while(status){
        when(selectedMenu){
            "1" -> {
                println("육수를 골라주세요.")
                println("[1] 돼지 [2] 닭 [3] 소 [0] 뒤로가기")
                val selectedOption = readln()
                break
            }
            "2" -> {
                println("맛을 골라주세요.")
                println("[1] 오리지널 [2] 로제 [3] 마라 [0] 뒤로가기")
                val selectedOption = readln()
                break
            }
            "3" -> {
                println("토핑을 골라주세요.")
                println("[1] 닭가슴살 [2] 새우 [3] 연어 [0] 뒤로가기")
                val selectedOption = readln()
                break
            }
            "4" -> {
                println("토핑을 골라주세요.")
                println("[1] 삼겹살 [2] 항정살 [3] 큐브스테이크 [0] 뒤로가기")
                val selectedOption = readln()
                break
            }
            "5" -> {
                println("메뉴를 직접 입력 해주세요.")
                val selectedOption = readln()
                break
            }
            "0" -> {
                println("메뉴를 고르세요.")
                println("[1] 라멘 [2] 떡볶이 [3] 포케 [4] 덮밥 [5]기타 [00] 종료")
            } else -> {
                println("프로그램을 종료 합니다.")
                status = false
            }
        }
    }
}