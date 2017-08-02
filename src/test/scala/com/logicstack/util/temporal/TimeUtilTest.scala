package com.logicstack.util.temporal

import java.time.LocalDate
import java.time.temporal.{ChronoUnit, TemporalUnit}

import com.logicstack.util.temporal.model.LocalDateRange
import org.specs2.mutable.Specification

class TimeUtilTest extends Specification {
  "TimeUtil" should {

    "validate expiration dates" in {
      val ttl = 5
      val `unit` = ChronoUnit.HOURS
      val start = TimeUtil.now.minusHours(6)

      TimeUtil.isExpired(ttl, `unit`, start) shouldEqual true
    }

    "calculate the dates in a date range" in {
      val dates = Seq("2017-05-01", "2017-05-02", "2017-05-03", "2017-05-04", "2017-05-05")
        .map(LocalDate.parse)

      val range = LocalDateRange(dates.head, dates.last)

      range.toDates shouldEqual dates
    }

  }

}
