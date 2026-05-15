package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacSagittarius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                lineTo(3f, 21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 9f)
                lineToRelative(6f, 6f)
            }
}

public val LucideIcons.All.ZodiacSagittariusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacSagittarius: ImageVector
    @Composable get() = ZodiacSagittariusDefinition.asImageVector()
