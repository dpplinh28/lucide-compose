package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tally1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.Tally1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tally1: ImageVector
    @Composable get() = Tally1Definition.asImageVector()
