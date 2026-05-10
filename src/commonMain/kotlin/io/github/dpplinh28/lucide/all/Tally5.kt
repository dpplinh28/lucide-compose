package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tally5") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 6f)
                lineTo(2f, 18f)
            }
}

public val LucideIcons.All.Tally5Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tally5: ImageVector
    @Composable get() = Tally5Definition.asImageVector()
