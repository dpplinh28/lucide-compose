package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDivide") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                lineTo(16f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                lineTo(12f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                lineTo(12f, 8f)
            }
}

public val LucideIcons.All.CircleDivideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDivide: ImageVector
    @Composable get() = CircleDivideDefinition.asImageVector()
