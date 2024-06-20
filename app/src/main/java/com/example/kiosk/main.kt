package com.example.kiosk

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    while(true){
        println("메뉴를 고르세요.")
        println("[1] 라멘 [2] 떡볶이 [3] 포케 [4]기타 [0] 종료")
        val selectedMenu = readln()

        when(selectedMenu){
            "1" -> {
                val menu1 = Menu("라멘", "맛있는 일본식 라면")
                menu1.showMenu()
                println( "[1] 미소 [2] 간장 [3] 소금 [0] 뒤로가기")
                val selectedOption = readln()
                when(selectedOption){
                    "1" -> {
                        val food = Food("미소 라멘", "녹진한 국물의 미소 라멘입니다.", 9000)
                        food.showMenu()
                    }
                    "2" -> {}
                    "3" -> {}
                    "0" -> {}
                }
            }
            "2" -> {
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
                println("메뉴를 직접 입력 해주세요.")
                val selectedOption = readln()
                println("${selectedOption}는 잠시만 기다려주세요.")
                thread(start = true) {
                    runBlocking {
                        launch {
                            delay(3000)
                        }
                    }
                    println("죄송합니다. 이 메뉴는 준비되어있지 않습니다.")
                }
                break
            }
            "0" -> {
                println("프로그램을 종료 합니다.")
                break
            } else -> println("숫자를 올바르게 입력 해주세요.")
        }
    }
}