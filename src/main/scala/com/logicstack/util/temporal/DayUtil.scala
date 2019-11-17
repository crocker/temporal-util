package com.logicstack.util.temporal

object DayUtil {
  private val dayAbbreviations =
    Map(
      "M" -> WeekDay.Monday,
      "Mo" -> WeekDay.Monday,
      "Mon" -> WeekDay.Monday,

      "T" -> WeekDay.Tuesday,
      "Tu" -> WeekDay.Tuesday,
      "Tue" -> WeekDay.Tuesday,
      "Tues" -> WeekDay.Tuesday,

      "W" -> WeekDay.Wednesday,
      "We" -> WeekDay.Wednesday,
      "Wed" -> WeekDay.Wednesday,
      "Weds" -> WeekDay.Wednesday,

      "Th" -> WeekDay.Thursday,
      "Thu" -> WeekDay.Thursday,
      "Thur" -> WeekDay.Thursday,
      "Thurs" -> WeekDay.Thursday,

      "F" -> WeekDay.Friday,
      "Fr" -> WeekDay.Friday,
      "Fri" -> WeekDay.Friday,

      "S" -> WeekDay.Saturday,
      "Sa" -> WeekDay.Saturday,
      "Sat" -> WeekDay.Saturday,

      "Su" -> WeekDay.Sunday,
      "Sun" -> WeekDay.Sunday,
    )

  def toWeekDay(abbreviation: String): Option[WeekDay] = {
    dayAbbreviations.get(abbreviation.toLowerCase.capitalize)
  }

}
