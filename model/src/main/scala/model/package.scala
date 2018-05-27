import java.time.LocalDate

package object model {

  case class Company(id: Int, name: String)

  case class Passenger(id: Int, name: String)

  case class PassInTrip(tripId: Int,
                        passengerId: Int,
                        date: LocalDate,
                        place: String)

  case class Trip(id: Int,
                  companyId: Int,
                  plane: String,
                  townFrom: String,
                  townTo:String,
                  timeOut: LocalDate,
                  timeIn: LocalDate)
}
