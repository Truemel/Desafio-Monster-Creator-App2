package cl.desafiolatam.monstercreator.model

import androidx.lifecycle.LiveData

/**
 * Created by Cristian Vidal on 2019-10-02.
 */
interface MonsterRepositoryInterface {
    fun saveMonster(monster: Monster)
    fun getAllMonsters(): LiveData<List<Monster>>
    fun clearAllMonsters()
}