import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.afinal.veri

class yorumAdapter(val veriListesi2: List<veri>) :
    RecyclerView.Adapter<yorumlarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): yorumlarViewHolder {
        return yorumlarViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return veriListesi2.size
    }

    override fun onBindViewHolder(holder: yorumlarViewHolder, position: Int) {
        holder.bind2(veriListesi2[position])
    }
    }