package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tally4") { strokeWidth ->
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
}

public val LucideIcons.All.Tally4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tally4: ImageVector
    @Composable get() = Tally4Definition.asImageVector()
