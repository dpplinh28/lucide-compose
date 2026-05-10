package io.github.dpplinh28.lucide

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.metadata.*

data class LucideIconMetadata(
    val name: String,
    val tags: List<String>,
    val categories: List<String>,
    val definition: LucideIconDefinition
) {
    val vector: ImageVector @Composable get() = definition.asImageVector()
}

object LucideMetadata {
    const val VERSION = "1.14.0"

    val allIcons: List<LucideIconMetadata> by lazy {
        
        lucideMetadata0 +
        
        lucideMetadata1 +
        
        lucideMetadata2 +
        
        lucideMetadata3 +
        
        lucideMetadata4 +
        
        lucideMetadata5 +
        
        lucideMetadata6 +
        
        lucideMetadata7 +
        
        lucideMetadata8 +
        
        lucideMetadata9 +
        
        lucideMetadata10 +
        
        lucideMetadata11 +
        
        lucideMetadata12 +
        
        lucideMetadata13 +
        
        lucideMetadata14 +
        
        lucideMetadata15 +
        
        lucideMetadata16 +
        
        lucideMetadata17 +
        
        emptyList()
    }
}
