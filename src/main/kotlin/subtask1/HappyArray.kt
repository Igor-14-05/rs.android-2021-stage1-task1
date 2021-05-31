package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray_1 = sadArray.toMutableList()
        var pow = 1
        while (pow < sadArray_1.size) {
            var i = 1
            while (i < sadArray_1.size - 1) {
                var q = sadArray_1[i - 1] + sadArray_1[i + 1]
                if (sadArray_1[i] > q) {
                    sadArray_1.removeAt(i)
                } else i++
            }
            pow++
        }
        return sadArray_1.toIntArray()
        throw NotImplementedError("Not implemented")
    }
}
