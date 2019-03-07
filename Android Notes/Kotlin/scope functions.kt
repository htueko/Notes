// Scope Functions
// kotlin have 6 global functions


// let()
val name = "Alex"
name.let { println(name.toUpperCase()) }
val age: Int? = null
age?.let { println(it.dec()) }

// ----------------------------------------

// apply()
import java.util.Calendar

val sometime = Calendar.getInstance()

sometime.set(Calendar.YEAR, 1980)
sometime.set(Calendar.MONTH, 1)
sometime.set(Calendar.DAY_OF_MONTH, 22)
sometime.set(Calendar.HOUR_OF_DAY, 17)
sometime.set(Calendar.MINUTE, 0)
sometime.set(Calendar.SECOND, 0)
sometime.set(Calendar.MILLISECOND, 0)


import java.util.Calendar

val sometime = Calendar.getInstance()

sometime.let {
  it.set(Calendar.YEAR, 1980)
  it.set(Calendar.MONTH, 1)
  it.set(Calendar.DAY_OF_MONTH, 22)
  it.set(Calendar.HOUR_OF_DAY, 17)
  it.set(Calendar.MINUTE, 0)
  it.set(Calendar.SECOND, 0)
  it.set(Calendar.MILLISECOND, 0)
}

println(sometime)


import java.util.Calendar

val sometime = Calendar.getInstance()

sometime.apply {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)
}


import java.util.Calendar

val sometime = Calendar.getInstance().apply {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)
}

println(sometime)


import java.util.Calendar

val sometime = Calendar.getInstance().apply {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)

  println(this)
}


import java.util.Calendar

println(Calendar.getInstance().apply {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)
})

// ----------------------------------------

// run()
import java.util.Calendar

val miracleString = Calendar.getInstance().run {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)

  toString()
}

println(miracleString)

// ----------------------------------------

// with()
import java.util.Calendar

val miracleString = with(Calendar.getInstance()) {
  set(Calendar.YEAR, 1980)
  set(Calendar.MONTH, 1)
  set(Calendar.DAY_OF_MONTH, 22)
  set(Calendar.HOUR_OF_DAY, 17)
  set(Calendar.MINUTE, 0)
  set(Calendar.SECOND, 0)
  set(Calendar.MILLISECOND, 0)

  toString()
}

println(miracleString)

// ----------------------------------------

// also()
import java.util.Calendar

println(Calendar.getInstance().also {
  it.set(Calendar.YEAR, 1980)
  it.set(Calendar.MONTH, 1)
  it.set(Calendar.DAY_OF_MONTH, 22)
  it.set(Calendar.HOUR_OF_DAY, 17)
  it.set(Calendar.MINUTE, 0)
  it.set(Calendar.SECOND, 0)
  it.set(Calendar.MILLISECOND, 0)
})

// ----------------------------------------

// use()
// work like try/catch/finally

// ----------------------------------------

// Summery
Function	How you call it				How you reference the Object	What it returns
let()		Call on an Object			it								block result
apply()		Call on an Object			this							the object
run()		Call on an Object			this							block result
with()		Pass object as parameter	this							block result
also()		Call on an object			it								the object
use()		Call on a Closable			it								block result
