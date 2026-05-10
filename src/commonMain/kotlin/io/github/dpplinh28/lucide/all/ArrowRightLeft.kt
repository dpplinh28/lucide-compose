package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 3f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 7f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 21f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 17f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.ArrowRightLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightLeft: ImageVector
    @Composable get() = ArrowRightLeftDefinition.asImageVector()
