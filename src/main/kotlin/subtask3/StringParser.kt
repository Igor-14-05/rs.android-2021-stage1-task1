package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var arr = ArrayList<String>()
        for (i in 0 until inputString.length) {
                   when (inputString[i]) {

                        '[', '{', '(', '<' -> {
                            var scob = inputString[i].toString()
                            var str = ""
                            var per = i + 1
                           for (j in per until inputString.length) {
                                if (inputString[j].toString() == ")" && scob == "(") break
                                else if (inputString[j].toString() == "]" && scob == "[") break
                                else if (inputString[j].toString() == "}" && scob == "}") break
                               else if (inputString[j].toString() == ">" && scob == "<") break
                                else str += inputString[j].toString()
                           }
                           arr.add(str)
                       }
                  }
               }
        var n = arr.size
       var arr_1 = Array<String>(n,{"q"})
       for (i in 0 until n) arr_1[i] = arr[i]
       return arr_1
        throw NotImplementedError("Not implemented")
    }
}
