package com.logicstack.util.temporal.model.range

import java.time.LocalDateTime

case class LocalDateTimeRange(
  from: LocalDateTime,
  to: LocalDateTime
) {

  def toLocalDataRange: LocalDateRange = {
    LocalDateRange(
      from = from.toLocalDate,
      to = to.toLocalDate
    )
  }

}
