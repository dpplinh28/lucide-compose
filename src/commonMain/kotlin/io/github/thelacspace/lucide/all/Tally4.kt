package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

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
