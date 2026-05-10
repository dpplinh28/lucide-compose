package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 4f)
                lineTo(9f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                lineTo(3f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 15f)
                lineTo(4f, 10f)
            }
}

public val LucideIcons.All.CheckLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckLine: ImageVector
    @Composable get() = CheckLineDefinition.asImageVector()
