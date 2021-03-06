// src/script/scala/progscala3/rounding/YieldingFor.scala

import progscala3.rounding.WeekDay
import progscala3.rounding.WeekDay._

val days = for {
  day <- WeekDay.values
  up   = WeekDay.upper(day)
} yield up
assert(days == Set("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"))
