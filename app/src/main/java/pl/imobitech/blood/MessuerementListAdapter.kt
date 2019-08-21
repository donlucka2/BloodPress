package pl.imobitech.blood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MessuerementListAdapter  internal constructor(
    context: Context
) : RecyclerView.Adapter<MessuerementListAdapter.MeasurementsViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var measurements = emptyList<Measurement>() // Cached copy of words

    inner class MeasurementsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val measerumentsItemView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeasurementsViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return MeasurementsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MeasurementsViewHolder, position: Int) {
        val current = measurements[position]
        holder.measerumentsItemView.text = current.pulse.toString()
    }

    internal fun setWords(measurements: List<Measurement>) {
        this.measurements = measurements
        notifyDataSetChanged()
    }

    override fun getItemCount() = measurements.size
}