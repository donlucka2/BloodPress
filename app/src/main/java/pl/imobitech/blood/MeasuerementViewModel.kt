package pl.imobitech.blood

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MeasuerementViewModel (application: Application) : AndroidViewModel(application) {

    private val repository: MeasurementRepository
    val allMeasurements: LiveData<List<Measurement>>

    init {
        val messDao = MeasurementRoomDatabase.getDatabase(application).messDao()
        repository = MeasurementRepository(messDao)
        allMeasurements = repository.allMeasurements
    }

    fun insert(measurement: Measurement) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(measurement)
    }
}