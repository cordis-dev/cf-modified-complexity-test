class ComplexityExamples {
    companion object {
        @JvmStatic
        fun whenTest(args: Array<String>) {
            val num = 3
            when (num) {
                1 -> println("1")
                2 -> println("2")
                3 -> println("3")
                4 -> println("4")
                5 -> println("5")
                6 -> println("6")
                7 -> println("7")
                8 -> println("8")
                9 -> println("9")
                10 -> println("10")
                11 -> println("11")
                12 -> println("12")
                13 -> println("13")
                14 -> println("14")
                15 -> println("15")
                else -> println("Something else")
            }
        }

        @JvmStatic
        fun ifElseTest(args: Array<String>) {
            val num = 3
            if (num == 1) println("1")
            else if (num == 2) println("2")
            else if (num == 3) println("3")
            else if (num == 4) println("4")
            else if (num == 5) println("5")
            else if (num == 6) println("6")
            else if (num == 7) println("7")
            else if (num == 8) println("8")
            else if (num == 9) println("9")
            else if (num == 10) println("10")
            else if (num == 11) println("11")
            else if (num == 12) println("12")
            else if (num == 13) println("13")
            else if (num == 14) println("14")
            else if (num == 15) println("15")
            else println("Something else")
        }
    }
}
