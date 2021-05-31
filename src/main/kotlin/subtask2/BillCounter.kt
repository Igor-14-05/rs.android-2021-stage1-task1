package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summ = 0
        for (i in 0 until bill.size){
            summ += bill[i]
        }
        var anna_zapl = summ - bill[k]
        if (b == anna_zapl/2) return "Bon Appetit"
        else return (b - anna_zapl/2).toString()
        throw NotImplementedError("Not implemented")
    }
}
