package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TurkishLira") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 4f)
                lineTo(5f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 8.5f)
                lineToRelative(-10f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                arcToRelative(9f, 9f, 0f, false, true, -9f, 9f)
                verticalLineTo(3f)
            }
}

public val LucideIcons.All.TurkishLiraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TurkishLira: ImageVector
    @Composable get() = TurkishLiraDefinition.asImageVector()
