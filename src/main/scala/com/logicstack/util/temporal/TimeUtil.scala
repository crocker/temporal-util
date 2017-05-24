package com.logicstack.util.temporal

import java.time._
import java.time.temporal.{ChronoUnit, TemporalUnit, WeekFields}
import java.util.Locale

object TimeUtil {
  private val weekField = WeekFields.of(Locale.getDefault).dayOfWeek()

  def now: LocalDateTime = {
    ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime
  }

  def nowInSeconds: Long = {
    now.toEpochSecond(ZoneOffset.UTC)
  }

  def isExpired(ttl: Long, `unit`: ChronoUnit, startTime: LocalDateTime): Boolean = {
    val expiration = now.minus(ttl, unit)
    startTime.isBefore(expiration)
  }

  def toStartOfDay(date: LocalDate): LocalDateTime = {
    date.atTime(LocalTime.MIDNIGHT)
  }

  def toEndOfDay(date: LocalDate): LocalDateTime = {
    date.atTime(LocalTime.MIDNIGHT).plusDays(1).minusNanos(1)
  }

  def toTime(sec: Double): String = {
    val hours = sec.toInt / 3600
    val minutes = sec.toInt / 60
    val seconds = (sec % 60).toInt

    def pad(value: Int): String = {
      f"${value}%02d"
    }

    s"${pad(hours)}:${pad(minutes)}:${pad(seconds)}"
  }
}