package com.logicstack.util.temporal.model

import java.time.{LocalDate, LocalTime}

import com.logicstack.util.temporal.{DateUtil, TimeUtil}

case class LocalDateRange(
  from: LocalDate,
  to: LocalDate
) {
  def toLocalDateTimeRange: LocalDateTimeRange = {
    LocalDateTimeRange(
      from = TimeUtil.toStartOfDay(from),
      to = TimeUtil.toEndOfDay(to)
    )
  }

  def getDates: Seq[LocalDate] = {
    DateUtil.getDatesBetween(this.from, this.to)
  }
}
