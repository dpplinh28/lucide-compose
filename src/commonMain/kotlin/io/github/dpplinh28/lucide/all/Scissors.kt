package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.12f, 8.12f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 4f)
                lineTo(8.12f, 15.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.8f, 14.8f)
                lineTo(20f, 20f)
            }
}

public val LucideIcons.All.ScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scissors: ImageVector
    @Composable get() = ScissorsDefinition.asImageVector()
