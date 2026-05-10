package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualNot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 9f)
                lineTo(19f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 15f)
                lineTo(19f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
}

public val LucideIcons.All.EqualNotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualNot: ImageVector
    @Composable get() = EqualNotDefinition.asImageVector()
