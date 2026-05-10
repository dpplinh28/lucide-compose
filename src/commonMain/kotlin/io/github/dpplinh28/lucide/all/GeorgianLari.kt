package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GeorgianLari") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.5f, 21f)
                arcToRelative(7.5f, 7.5f, 0f, true, true, 7.35f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 12f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineTo(3f)
            }
}

public val LucideIcons.All.GeorgianLariDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GeorgianLari: ImageVector
    @Composable get() = GeorgianLariDefinition.asImageVector()
