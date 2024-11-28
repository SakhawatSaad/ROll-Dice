package com.shsaad.rolldice

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.log

class DiceViewModel : ViewModel() {

    private val dices = listOf(
        R.drawable.empty_dice,
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )

    private val numderOfDiceSides = 6

    private val  _pickedDice = MutableLiveData<Int>()
    val pickedDice : LiveData<Int>
        get()= _pickedDice


    fun rolldice(){
        val dice = Dice (numderOfDiceSides)
        val nums = dice.roll()
        Log.d("Tag","roll dice :$nums")
        _pickedDice.postValue(dices[nums])
    }


}