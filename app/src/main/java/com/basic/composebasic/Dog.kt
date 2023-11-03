package com.basic.composebasic

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int
)

val dogs = listOf(
    Dog(R.drawable.msi, R.string.tingky),
    Dog(R.drawable.msi, R.string.wingky),
    Dog(R.drawable.msi, R.string.dipsy),
    Dog(R.drawable.msi, R.string.lala),
    Dog(R.drawable.msi, R.string.pooh),
    Dog(R.drawable.msi, R.string.sepooh),
    Dog(R.drawable.msi, R.string.piglet),
    Dog(R.drawable.msi, R.string.rabbit),
    Dog(R.drawable.msi, R.string.tiger)
)
