enum DaysOfWeek {
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Saturday,
  Sunday,
}

function getDayType(day: DaysOfWeek): string {
  return day === DaysOfWeek.Saturday || day === DaysOfWeek.Sunday
    ? "Weekend"
    : "Weekday";
}

console.log(getDayType(3))
