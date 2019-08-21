package pl.imobitech.blood

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "measurement_table")
class Measurement (@PrimaryKey(autoGenerate = true) var id: Long?,
                   //@ColumnInfo(name = "date") var date: Date,
                   @ColumnInfo(name = "sys") var sys: Int,
                   @ColumnInfo(name = "dia") var dia: Double,
                   @ColumnInfo(name = "pulse") var pulse: Double){

}