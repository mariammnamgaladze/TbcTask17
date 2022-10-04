package com.example.tbctask17

data class Attributes(
    val title:String,
    val cover:Int
)
{
    companion object {
        val attrinutesList = listOf(
            Attributes("intagram : @mariamnamgaladzee__",R.drawable.maro),
            Attributes("FB : No FB",R.drawable.maro),
            Attributes("number: 591 95 10 **",R.drawable.maro),

        )
    }
}