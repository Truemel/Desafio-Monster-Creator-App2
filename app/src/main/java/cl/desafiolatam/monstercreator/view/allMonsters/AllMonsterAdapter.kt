package cl.desafiolatam.monstercreator.view.allMonsters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.desafiolatam.monstercreator.R
import cl.desafiolatam.monstercreator.model.Monster
import kotlinx.android.synthetic.main.monster_item.view.*

/**
 * Created by Cristian Vidal on 2019-10-02.
 */
class AllMonsterAdapter(private val monsters: MutableList<Monster>) :
    RecyclerView.Adapter<AllMonsterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.monster_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(monsters[position])
    }

    override fun getItemCount() = monsters.size

    fun updateMonsters(creatures: List<Monster>) {
        this.monsters.clear()
        this.monsters.addAll(creatures)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var monster: Monster

        fun bind(monster: Monster) {
            this.monster = monster
            with(monster) {
                itemView.monsterImageView.setImageResource(drawable)
                itemView.name.text = name
                itemView.monsterPoints.text = monsterPoints.toString()
            }

        }
    }
}

