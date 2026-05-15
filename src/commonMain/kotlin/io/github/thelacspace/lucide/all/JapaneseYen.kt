package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("JapaneseYen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 9.5f)
                verticalLineTo(21f)
                moveToRelative(0f, -11.5f)
                lineTo(6f, 3f)
                moveToRelative(6f, 6.5f)
                lineTo(18f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 15f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.JapaneseYenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.JapaneseYen: ImageVector
    @Composable get() = JapaneseYenDefinition.asImageVector()
