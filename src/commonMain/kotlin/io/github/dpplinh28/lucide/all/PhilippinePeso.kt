package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhilippinePeso") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 11f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 7f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 12f)
                horizontalLineTo(7f)
            }
}

public val LucideIcons.All.PhilippinePesoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhilippinePeso: ImageVector
    @Composable get() = PhilippinePesoDefinition.asImageVector()
