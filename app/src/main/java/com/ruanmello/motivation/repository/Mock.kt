package com.ruanmello.motivation.repository

import android.provider.Settings.Global.getString
import android.provider.Settings.Secure.getString
import com.ruanmello.motivation.R
import com.ruanmello.motivation.infra.MotivationConstants
import com.ruanmello.motivation.ui.SplashActivity
import java.util.*

data class Phrase(val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING

//    Frase, categoria Morning
//    Frase2, categoria Happy

    private val mListPhrases1: List<Phrase> = listOf(
        Phrase("Not knowing it was impossible, he went there and did it.", HAPPY),
        Phrase("You are not defeated when you lose, you are defeated when you give up!", HAPPY),
        Phrase("When it's dark, we see more stars!", HAPPY),
        Phrase("Insanity is always doing the same thing and expecting a different result.", HAPPY),
        Phrase("Don't stop when you're tired, stop when you're done.", HAPPY),
        Phrase("What can you do now that has the greatest impact on your success?", HAPPY),
        Phrase("The best way to predict the future is to invent it.", MORNING),
        Phrase("You lose all chances that you don't take advantage of.", MORNING),
        Phrase("Failure is the condiment that gives flavor to success.", MORNING),
        Phrase("As long as we are not committed, there will be hesitation!", MORNING),
        Phrase("If you don't know where you want to go, any path will do.", MORNING),
        Phrase("If you believe, it makes all the difference.\n", MORNING),
        Phrase("Risks must be taken because the greatest danger is not to risk anything!", MORNING)
    )

    fun getPhrase1(categoryId1: Int): String {

        val filtered1 = mListPhrases1.filter { it.category == categoryId1 || categoryId1 == ALL }

        val rand1 = Random().nextInt(filtered1.size)

        return filtered1[rand1].description
    }



    private val mListPhrases: List<Phrase> = listOf(
        Phrase("N??o sabendo que era imposs??vel, foi l?? e fez.", HAPPY),
        Phrase("Voc?? n??o ?? derrotado quando perde, voc?? ?? derrotado quando desiste!", HAPPY),
        Phrase("Quando est?? mais escuro, vemos mais estrelas!", HAPPY),
        Phrase("Insanidade ?? fazer sempre a mesma coisa e esperar um resultado diferente.", HAPPY),
        Phrase("N??o pare quando estiver cansado, pare quando tiver terminado.", HAPPY),
        Phrase("O que voc?? pode fazer agora que tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("A melhor maneira de prever o futuro ?? invent??-lo.", MORNING),
        Phrase("Voc?? perde todas as chances que voc?? n??o aproveita.", MORNING),
        Phrase("Fracasso ?? o condimento que d?? sabor ao sucesso.", MORNING),
        Phrase(" Enquanto n??o estivermos comprometidos, haver?? hesita????o!", MORNING),
        Phrase("Se voc?? n??o sabe onde quer ir, qualquer caminho serve.", MORNING),
        Phrase("Se voc?? acredita, faz toda a diferen??a.", MORNING),
        Phrase("Riscos devem ser corridos, porque o maior perigo ?? n??o arriscar nada!", MORNING)
    )


    fun getPhrase(categoryId: Int): String {

        val filtered = mListPhrases.filter { it.category == categoryId || categoryId == ALL }

        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }



}