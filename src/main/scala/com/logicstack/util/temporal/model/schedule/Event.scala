package com.logicstack.util.temporal.model.schedule

import java.time.LocalTime

import com.logicstack.util.temporal.model.WeekDay

case class Event(
  day: WeekDay,
  start: LocalTime,
  end: LocalTime
)
