package pl.imobitech.blood

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface MessDao {


    @Query("SELECT * from measurement_table ORDER BY id ASC")
    fun getAllWords(): LiveData<List<Measurement>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(measurement: Measurement)

    @Query("DELETE FROM measurement_table")
    fun deleteAll()

}