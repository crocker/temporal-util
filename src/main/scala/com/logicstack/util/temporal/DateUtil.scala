package com.logicstack.util.temporal

import java.time._
import java.time.temporal.ChronoUnit.DAYS
import java.time.temporal.WeekFields
import java.util.Locale

import com.logicstack.util.temporal.model.range.LocalDateRange

object DateUtil {
  private val weekField = WeekFields.of(Locale.getDefault).dayOfWeek()

  def today: LocalDate = {
    LocalDate.now(ZoneOffset.UTC)
  }

  def yesterday: LocalDate = {
    today.minusDays(1)
  }

  def lastWeek: LocalDateRange = {
    LocalDateRange(
      from = today.minusWeeks(1).`with`(weekField, 1),
      to = today.minusWeeks(1).`with`(weekField, 7)
    )
  }

  def lastMonth: LocalDateRange = {
    LocalDateRange(
      from = today.minusMonths(1).withDayOfMonth(1),
      to = today.withDayOfMonth(1).minusDays(1)
    )
  }

  def lastYear: LocalDateRange = {
    LocalDateRange(
      from = today.withDayOfMonth(1).minusMonths(12),
      to = today.withDayOfMonth(1)
    )
  }

  def getDatesBetween(startDate: LocalDate, endDate: LocalDate): Seq[LocalDate] = {
    val days = DAYS.between(startDate, endDate)
    for (f <- 0L to days) yield startDate.plusDays(f)
  }

}
