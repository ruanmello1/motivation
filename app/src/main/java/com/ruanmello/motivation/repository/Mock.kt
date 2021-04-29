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
        Phrase("Não sabendo que era impossível, foi lá e fez.", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", HAPPY),
        Phrase("Quando está mais escuro, vemos mais estrelas!", HAPPY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", HAPPY),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", HAPPY),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", MORNING),
        Phrase("Você perde todas as chances que você não aproveita.", MORNING),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", MORNING),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", MORNING),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", MORNING),
        Phrase("Se você acredita, faz toda a diferença.", MORNING),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", MORNING)
    )


    fun getPhrase(categoryId: Int): String {

        val filtered = mListPhrases.filter { it.category == categoryId || categoryId == ALL }

        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }



}