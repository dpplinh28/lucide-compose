package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
