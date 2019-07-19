package com.logicstack.util.temporal.model.schedule

import java.time.LocalTime

//  {"sunday":[["9:00","21:00"]],"saturday":[["8:00","23:00"]],"tuesday":[["9:00","22:00"]],"friday":[["9:00","23:00"]],"thursday":[["9:00","22:00"]],"wednesday":[["9:00","22:00"]],"monday":[["9:00","22:00"]]}
case class Schedule(
  events: Seq[Event] = Seq.empty
)
