
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.afinal.R
import com.example.afinal.veri


class verilerViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate
            (
            R.layout.activity_detay2,
            container,
            false
        )
    ) {
    val crdView: CardView = itemView.findViewById(R.id.cardview2)
    val profileLink: ImageView = itemView.findViewById(R.id.imgProfilePhoto2)
    val txtisim: TextView = itemView.findViewById(R.id.txtisim2)
    val txtucret: TextView = itemView.findViewById(R.id.txtucret2)
    val txtsaat: TextView = itemView.findViewById(R.id.txtsaat2)
    val txtpuan: TextView = itemView.findViewById(R.id.txtpuan)
    val btndetayy: Button = itemView.findViewById(R.id.btndetay)

    //val txtgenelbilgi: TextView = itemView.findViewById(R.id.txtdetay)
    fun bind(veri1: veri) {

        profileLink.setImageResource(veri1.profilePhotoLink)
        txtisim.text ="İsim: "+ veri1.isim.toString()
        txtucret.text ="Ücret: "+ veri1.ucret.toString()
        txtsaat.text ="Çalışma Saati: "+ veri1.saati.toString()
        txtpuan.text ="Puan:5/ "+ veri1.puan.toDouble()
        //txtgenelbilgi.text ="Genel Bilgi: "+ veri1.genelbilgi.toString()


    }

    }


