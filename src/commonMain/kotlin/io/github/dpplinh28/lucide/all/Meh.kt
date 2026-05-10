package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Meh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                lineTo(16f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(9.01f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(15.01f, 9f)
            }
}

public val LucideIcons.All.MehDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Meh: ImageVector
    @Composable get() = MehDefinition.asImageVector()
