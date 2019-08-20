package pl.imobitech.blood

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class MeasurementRepository(private val messDao: MessDao) {


    val allMeasurements: LiveData<List<Measurement>> = messDao.getAllWords()

    @WorkerThread
    suspend fun insert(measurement: Measurement) {
        messDao.insert(measurement)
    }

}