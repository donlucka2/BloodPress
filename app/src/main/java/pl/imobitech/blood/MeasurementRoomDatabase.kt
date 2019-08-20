package pl.imobitech.blood

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Measurement::class], version = 1)
public abstract class MeasurementRoomDatabase : RoomDatabase() {

    abstract fun messDao():MessDao


    companion object {
        @Volatile
        private var INSTANCE: MeasurementRoomDatabase? = null

        fun getDatabase(context: Context): MeasurementRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MeasurementRoomDatabase::class.java,
                    "Measurement_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}

