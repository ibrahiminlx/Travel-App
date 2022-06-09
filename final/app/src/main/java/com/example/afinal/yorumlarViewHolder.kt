
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.afinal.R
import com.example.afinal.veri


class yorumlarViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate
            (
            R.layout.activity_detay3,
            container,
            false
        )
    ) {
    val crdView: CardView = itemView.findViewById(R.id.cardview12)
    val yorum : TextView = itemView.findViewById(R.id.tvYorum)
    val puan2 : TextView = itemView.findViewById(R.id.tvPuan)


    fun bind2(veri1: veri) {


        yorum.text=veri1.yorum
        puan2.text=veri1.puan2.toString()
        println("asdasda"+yorum)



    }

}
