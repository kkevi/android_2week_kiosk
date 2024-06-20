package com.example.kiosk

fun main() {
    var status:Boolean = true

    val menu1 = Menu("쇼유 라멘", "맛있는 쇼유라멘")

    while(status){
        println("메뉴를 고르세요.")
        println("[1] 라멘 [2] 떡볶이 [3] 포케 [4] 덮밥 [5]기타 [0] 종료")
        val selectedMenu = readln()

        when(selectedMenu){
            "1" -> {
                println("육수를 골라주세요.")
                println("[1] 미소 [2] 간장 [3] 소금 [0] 뒤로가기")
                val selectedOption = readln()
                when(selectedOption){
                    "1" -> {

                    }
                    "2" -> {}
                    "3" -> {}
                    "0" -> {}
                }
            }
            "2" -> {
                println("맛을 골라주세요.")
                println("[1] 오리지널 [2] 로제 [3] 마라 [0] 뒤로가기")
                val selectedOption = readln()
                when(selectedOption){
                    "1" -> println("오리지널 떡볶이 나왔습니다~!")
                    "2" -> println("로제 떡볶이 나왔습니다~!")
                    "3" -> println("마라 떡볶이 나왔습니다~!")
                    "0" -> {}
                }
            }
            "3" -> {
                println("토핑을 골라주세요.")
                println("[1] 닭가슴살 [2] 새우 [3] 연어 [0] 뒤로가기")
                val selectedOption = readln()
                when(selectedOption){
                    "1" -> println("닭가슴살 포케 나왔습니다~!")
                    "2" -> println("새우 포케 나왔습니다~!")
                    "3" -> println("연어 포케 나왔습니다~!")
                    "0" -> {}
                }
            }
            "4" -> {
                println("토핑을 골라주세요.")
                println("[1] 삼겹살 [2] 항정살 [3] 큐브스테이크 [0] 뒤로가기")
                val selectedOption = readln()
                when(selectedOption){
                    "1" -> println("삼겹살 덮밥 나왔습니다~!")
                    "2" -> println("항정살 덮밥 나왔습니다~!")
                    "3" -> println("큐브스테이크 덮밥 나왔습니다~!")
                    "0" -> {}
                }
            }
            "5" -> {
                println("메뉴를 직접 입력 해주세요.")
                val selectedOption = readln()
                println("${selectedOption}는 잠시만 기다려주세요.")

                println("죄송합니다. 이 메뉴는 준비되어있지 않습니다.")
            }
            "0" -> {
                println("프로그램을 종료 합니다.")
                status = false
            }
        }
    }
}