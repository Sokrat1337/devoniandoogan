package com.github.synnerz.devoniandoogan.features

import com.github.synnerz.devonian.features.Feature
import com.github.synnerz.devonian.features.misc.BestiaryHighlight

object BestiaryESP : Feature(
    "bestiaryESP",
    "enables esp for Bestiary Highlight feature",
    subcategory = "General",
    cheeto = true,
) {
    override fun add() {
        super.add()
        BestiaryHighlight.phase = true
    }

    override fun remove() {
        super.remove()
        BestiaryHighlight.phase = false
    }
}